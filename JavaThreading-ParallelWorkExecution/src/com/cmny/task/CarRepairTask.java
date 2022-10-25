package com.cmny.task;

import com.cmny.dto.CarRepair;

public class CarRepairTask implements Command {
	private CarRepair carRepair = null;
	
	public CarRepairTask(CarRepair carRepair) {
		this.carRepair = carRepair;
	}
	
	@Override
	public void execute() {
		carRepair.reapir();
	}
	
	@Override
	public String toString() {
		return "Car repair task";
	}

	@Override
	public int getTimeTaken() {
		return carRepair.getTimeTaken();
	}
	
}
