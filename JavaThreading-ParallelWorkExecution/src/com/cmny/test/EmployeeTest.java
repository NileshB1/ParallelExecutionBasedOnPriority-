package com.cmny.test;

import java.util.ArrayList;
import java.util.List;

import com.cmny.dto.CarPaint;
import com.cmny.dto.CarRepair;
import com.cmny.dto.CarWash;
import com.cmny.dto.Employee;
import com.cmny.executor.TaskExecutor;
import com.cmny.executor.TaskExecutorImpl;
import com.cmny.statergy.PriorityStrategy;
import com.cmny.statergy.TimeTakenPriority;
import com.cmny.task.CarPaintTask;
import com.cmny.task.CarRepairTask;
import com.cmny.task.CarWashTask;
import com.cmny.task.Command;

public class EmployeeTest {

	public static void main(String[] args) {
		//Joe
		Employee joe = new Employee("Joe", Employee.Designation.Trainee);
		
		//Smith
		Employee smith = new Employee("Smith", Employee.Designation.Expert);
		
		//Walker
		Employee walker = new Employee("Walker", Employee.Designation.Employee);
		
		CarWash carWash = new CarWash(100, 2);
		CarRepair carRepair = new CarRepair(1000, 5);
		CarPaint carPaint = new CarPaint(1400, 4);
		
		Command carWashTask = new CarWashTask(carWash);
		Command carRepairTask = new CarRepairTask(carRepair);
		Command carPaintTask = new CarPaintTask(carPaint);
		
		List<Command> joeTasks = new ArrayList<Command>();
		joeTasks.add(carWashTask);
		joeTasks.add(carRepairTask);
		joeTasks.add(carPaintTask);
		joe.setTasks(joeTasks);
		
		List<Command> smithTasks = new ArrayList<Command>();
		smithTasks.add(carRepairTask);
		smith.setTasks(smithTasks);
		
		List<Command> walkerTasks = new ArrayList<Command>();
		walkerTasks.add(carPaintTask);
		walkerTasks.add(carRepairTask);
		walker.setTasks(walkerTasks);
		
		joe.doWork();
		smith.doWork();
		walker.doWork();
		
		//Execute tasks in parallel
		System.out.println("######## Employee started work in parallel ########");
		TaskExecutor taskexe = new TaskExecutorImpl();
		PriorityStrategy priority = new TimeTakenPriority();
		taskexe.setPriorityStrategy(priority);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(joe);
		employees.add(smith);
		employees.add(walker);
		taskexe.setEmpTasks(employees);
		
		taskexe.execute();
	}

}
