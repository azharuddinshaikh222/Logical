package com.number;

public class NumberReverse {
public static void main(String[] args) {
	
	int num=1234;
	int rev,rem;
	
	while(num!=0)
	{
		rev=num%10;
	    num=num/10;
	    System.out.print(rev);
	}
}
}
