package com.number;

import java.util.Scanner;

public class FibonacciUserInput {
public static void main(String[] args) {
	
	int a=0; int b=1; int c;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	int userInput = sc.nextInt();
	for(int i=0;i<=userInput;i++)
	{
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
	}
}
}
