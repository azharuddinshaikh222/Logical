package com.collections;

import java.util.ArrayList;
import java.util.List;

public class MaxComparable {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	list.add(60);
	list.add(55);
	list.add(50);
	list.add(45);
	list.add(40);
	System.out.println(list);
	
Integer minElement = list.stream().min((i1,i2)->i2.compareTo(i1)).get();
System.out.println(minElement);
}
}
