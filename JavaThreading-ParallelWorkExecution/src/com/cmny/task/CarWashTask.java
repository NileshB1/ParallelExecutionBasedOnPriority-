package com.cmny.task;

import com.cmny.dto.CarWash;

public class CarWashTask implements Command {
	private CarWash carWash = null;
	
	public CarWashTask(CarWash carWash) {
		this.carWash = carWash;
	}
	
	@Override
	public void execute() {
		carWash.wash();
	}
	
	@Override
	public String toString() {
		return "Car wash task";
	}

	@Override
	public int getTimeTaken() {
		return carWash.getTimeTaken();
	}
}
