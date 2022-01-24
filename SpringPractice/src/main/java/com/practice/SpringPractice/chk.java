package com.practice.SpringPractice;

public class chk {

	void show(byte x, int y) {
		 System.out.println("Inside byte int"+x);
	 }
	void show(int x,int y) {
		 System.out.println("Inside short int"+x);
	 }
	 void show(int x,String y) {
		 System.out.println("Inside int string"+x);
	 }
	 
	 void show(String x,int u) {
		 System.out.println("Inside String int"+x);
	 }
	 void show(double x, int u) {
		 System.out.println("Inside Double int "+x);
	 }
	 
	public static void main(String[] args) {
		chk c= new chk();
		c.show(10,0);

	}

}
