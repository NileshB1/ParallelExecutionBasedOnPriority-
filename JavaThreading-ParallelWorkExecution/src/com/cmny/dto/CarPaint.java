package com.cmny.dto;

public class CarPaint {
	
	int serviceCharge = 0;
	int timeTaken = 0;
	
	public CarPaint(int serviceCharge, int timeTaken) {
		this.serviceCharge = serviceCharge;
		this.timeTaken = timeTaken;
	}
	
	public void paint() {
		//car paint steps
		System.out.println("Car paint done...");
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
