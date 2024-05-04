package com.oops;

public class car2getterssetters {
	private String doors;
	private String engine;
	private String drivers;
	private int speed;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDrivers() {
		return drivers;
	}
	public void setDrivers(String drivers) {
		this.drivers = drivers;
	}
	
public String run() {
	if(doors.equals("closed") && engine.equals("on")&& drivers.equals("seated") 
			&& speed >0) {
		return "car is running";
	}
	else {
		return "car is not running";
	}
}
}


