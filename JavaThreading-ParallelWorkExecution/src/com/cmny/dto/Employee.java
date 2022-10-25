package com.cmny.dto;

import java.util.ArrayList;
import java.util.List;

import com.cmny.task.Command;

public class Employee {
	private String name;
	private Designation designation;
	
	public Employee(String name, Designation designation) {
		this.name = name;
		this.designation = designation;
	}
	
	List<Command> tasks = new ArrayList<Command>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Designation getDesignation() {
		return designation;
	}
	
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	
	public List<Command> getTasks() {
		return tasks;
	}

	public void setTasks(List<Command> tasks) {
		this.tasks = tasks;
	}

	public void doWork() {
		System.out.println("Employee: " + name + ", designation: "+ designation + " is doing work");
		for(Command command: tasks) {
			command.execute();
		}
	}
	
	public enum Designation {
		Trainee("trainee"), Expert("expert"), Employee("employee");
		
		String designation;
		Designation (String designation) {
			this.designation = designation;
		}
	}
}
