package com.cmny.dto;

public class CarWash {
	
	int serviceCharge = 0;
	int timeTaken = 0;
	
	public CarWash(int serviceCharge, int timeTaken) {
		this.serviceCharge = serviceCharge;
		this.timeTaken = timeTaken;
	}
	
	public void wash() {
		//car washing steps
		System.out.println("Car washing done...");
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
