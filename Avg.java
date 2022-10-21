package com.infinite.day1;

public class Avg {
	public void check(int s1,int s2,int s3,int s4,int s5){
		int total=s1+s2+s3+s4+s5;
		int avg = (total)/5;
		System.out.println("average of 5 subjects is"+avg);
		System.out.println("total of 5 subjects is"+total);
	}
	public void show(int s1,int s2,int s3,int s4,int s5){
		if(s1>=35 && s2>=35 && s3>=35 && s4>=35 && s5>=35){
			System.out.println("pass");
			}else{
				System.out.println("fail");
			}
	} 
	public static void main(String[] args) {
		int s1=34,s2=56,s3=35,s4=40,s5=45;
		Avg obj=new Avg();
		obj.check(s1, s2, s3, s4, s5);
		obj.show(s1, s2, s3, s4, s5);
		
	}

}
