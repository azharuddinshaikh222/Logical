package com.number;

import java.util.Scanner;

public class CubeOfNumber {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any it value");
	int userInput = sc.nextInt();
	
	while(userInput>0)
	{
		System.out.println(userInput*userInput*userInput);
		 System.out.println("enter any it value");
		 userInput=sc.nextInt();
		
	}
	
	
	
}
}
