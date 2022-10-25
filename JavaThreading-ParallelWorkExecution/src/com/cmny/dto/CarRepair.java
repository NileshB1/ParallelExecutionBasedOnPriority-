package com.cmny.dto;

public class CarRepair {
	
	int serviceCharge = 0;
	int timeTaken = 0;
	
	public CarRepair(int serviceCharge, int timeTaken) {
		this.serviceCharge = serviceCharge;
		this.timeTaken = timeTaken;
	}
	
	public void reapir() {
		//car repair steps
		System.out.println("Car repair done");
	}
	
	public int getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(int serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public int getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(int timeTaken) {
		this.timeTaken = timeTaken;
	}
}
