package com.number;

public class DesireOutput {
public static void main(String[] args) {
	
	for(int i=0;i<=10;i++)
	{
		System.out.println(i);
		if(1%2==0)
		{
			System.out.println(i-3);
		}
		else {
			System.out.println(i-1);
		}
	}
}
}
