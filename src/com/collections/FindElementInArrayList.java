package com.collections;

import java.util.ArrayList;
import java.util.List;

public class FindElementInArrayList {
public static void main(String[] args) {
	
	List<String> list=new ArrayList<String>();
	list.add("red");
	list.add("violet");
	list.add("indigo");
	list.add("blue");
	list.add("red");
	System.out.println(list);
	if(list.contains("red"))
	{
		System.out.println("given collection contains red color");
	}
	else
	{
		System.out.println("given string does not contains red color");
	}
}
}
