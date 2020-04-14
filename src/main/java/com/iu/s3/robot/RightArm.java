package com.iu.s3.robot;

public class RightArm {
	
	private int power;
	private String color;
	
	public RightArm(int power, String color) {
		this.power = power;
	}

	public int getPower() {
		return power;
	}

	public String getColor() {
		return color;
	}

	public void setPower(int power, String color) {
		this.power = power;
		this.color = color;
	}
	
	

}
