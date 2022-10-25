package com.cmny.executor;

import java.util.List;
import java.util.concurrent.ExecutorService;

import com.cmny.dto.Employee;
import com.cmny.statergy.PriorityStrategy;

/**
 * Maintain lifecycle of task execution
 * @author nilesh
 *
 */
public interface TaskExecutor {
	/**
	 * Initializes pool with size so that maximum CPU utilization on given machine
	 */
	public void init();
	
	/**
	 * Shutdown the thread pool
	 */
	public void shutDown();
	
	/**
	 * @return ExecutorService Get task executor
	 */
	public ExecutorService getTaskExecutor();
	
	/**
	 * Execute given task
	 */
	public void execute();
	
	/**
	 * Execute tasks based on priority
	 * @return
	 */
	public PriorityStrategy getPriorityStrategy();
	
	/**
	 * Set priority strategy
	 */
	public void setPriorityStrategy(PriorityStrategy priority);
	
	public void setEmpTasks(List<Employee> empTasks);
	
}
