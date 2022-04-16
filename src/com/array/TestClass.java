package com.array;

public class TestClass {
public static void main(String[] args) {
	String S1 = "RADAR";
	String S2 = "Amor, Roma!";
	String S3 = "Amora, Italy!";
	System.out.println(TestClass.isPalindrome(S1));
	System.out.println(TestClass.isPalindrome(S2));
	System.out.println(TestClass.isPalindrome(S3));
}


public static boolean isPalindrome(String str) {

	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
	
	 Character c = str.charAt(i);
	 rev=rev+c;
	}
	String replaceAll = str.replaceAll("[^a-zA-Z0-9]", "");
	boolean equals = str.equals(rev);
	
	
	
	return equals;
}

}


