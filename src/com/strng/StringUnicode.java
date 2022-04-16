package com.strng;

public class StringUnicode {
public static void main(String[] args) {
	
	String s="mynameisabc";
	int codePointAt = s.codePointAt(0);
	System.out.println(codePointAt);
	int codePointAt2 = s.codePointAt(8);
	System.out.println(codePointAt2);
}
}
