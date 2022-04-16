package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorJava8 {
public static void main(String[] args) {
	List<Integer> marks=new ArrayList<Integer>();
	marks.add(35);
	marks.add(40);
	marks.add(45);
	marks.add(50);
	marks.add(55);
	marks.add(60);
	System.out.println(marks);
	
	List<Integer> updatedMarks = marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
	System.out.println(updatedMarks);
}
}
