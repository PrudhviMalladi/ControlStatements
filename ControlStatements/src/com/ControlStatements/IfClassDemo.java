package com.ControlStatements;

import java.util.Scanner;

public class IfClassDemo {
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check:");
		number = sc.nextInt();
		sc.close();
		if(number >0) {
			
		System.out.println(number+"  is Positive number");
		
		}else if(number<0) {
			System.out.println(number+ "Is negative");
			
		}else {
			System.out.println(number+ "is neither postive or negative");
		}
		
				
		
	}
	

}
