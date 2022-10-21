package com.infinite.day1;

public class CtoR {
	public void Calc(double c){
		double r =(4*c/5);
		System.out.println("radius value"+r);
	}
	

	public static void main(String[] args) {
		double c=37;
		CtoR obj = new CtoR();
		obj.Calc(c);
	 

	}

}
