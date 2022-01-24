package com.practice.SpringPractice;

public class Salary {
	private int salpack;
	private String band;
	public int getSalpack() {
		return salpack;
	}
	public void setSalpack(int salpack) {
		this.salpack = salpack;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	
	@Override
	public String toString() {
		return "Salary [salpack=" + salpack + ", band=" + band + "]";
	}

	
}
