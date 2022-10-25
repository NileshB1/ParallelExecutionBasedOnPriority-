package com.cmny.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.cmny.constants.AppConstants;
import com.cmny.dto.Employee;
import com.cmny.statergy.NoPriority;
import com.cmny.statergy.PriorityStrategy;

public class TaskExecutorImpl implements TaskExecutor {

	private ExecutorService taskExecutor;
	private PriorityStrategy priority = new NoPriority();
	private volatile byte[] lock = new byte[0];
	List<Employee> empTasks = new ArrayList<Employee>();
	
	public TaskExecutorImpl() {
		init();
	}
	
	@Override
	public void init() {
		if (taskExecutor == null) {
			synchronized (lock) {
				if(taskExecutor == null) {
					int poolSize = Runtime.getRuntime().availableProcessors();
					if(poolSize <= 0) {
						poolSize = AppConstants.DEFAULT_POOL_SIZE;
					}
					taskExecutor = Executors.newFixedThreadPool(poolSize);
				}
			}
		}
	}

	public void setTaskExecutor(ExecutorService taskExecutor) {
		this.taskExecutor = taskExecutor;
	}

	@Override
	public void shutDown() {
		if(taskExecutor != null && !taskExecutor.isShutdown()) {
			taskExecutor.shutdown();
		}
	}

	@Override
	public ExecutorService getTaskExecutor() {
		return taskExecutor;
	}

	@Override
	public void execute() {
		for(Employee employee: empTasks) {
			employee.setTasks(priority.getPriorityStratergy(employee.getTasks()));
			employee.doWork();
		}
	}

	@Override
	public PriorityStrategy getPriorityStrategy() {
		return priority;
	}

	@Override
	public void setPriorityStrategy(PriorityStrategy priority) {
		this.priority = priority;
	}

	public List<Employee> getEmpTasks() {
		return empTasks;
	}

	public void setEmpTasks(List<Employee> empTasks) {
		this.empTasks = empTasks;
	}
}
