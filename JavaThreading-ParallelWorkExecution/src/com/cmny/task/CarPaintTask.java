package com.cmny.task;

import com.cmny.dto.CarPaint;

public class CarPaintTask implements Command {
	private CarPaint carPaint = null;
	
	public CarPaintTask(CarPaint carPaint) {
		this.carPaint = carPaint;
	}
	
	@Override
	public void execute() {
		carPaint.paint();
	}
	
	@Override
	public String toString() {
		return "Car paint task";
	}

	@Override
	public int getTimeTaken() {
		return carPaint.getTimeTaken();
	}
}
