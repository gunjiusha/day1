package com.infinite.day1;

public class CaseExample {
	public void show(int n){
		switch(n){
		case 1:
			System.out.println("Hi i am sachin...");
			break;
		case 2:
			System.out.println("Hi i am sireesha...");
			break;
		case 3:
		    System.out.println("Hi i am usha...");
		    break;
		case 4:
			System.out.println("Hi i am mahendra...");
		    break;
		case 5:
			System.out.println("Hi i am likkitha...");
			break;
	    default:
	    	System.out.println("Invalid Choice...");
		}
	}

	public static void main(String[] args) {
		int n=4;
		CaseExample obj = new CaseExample();
		obj.show(n);
	  

	}

}
