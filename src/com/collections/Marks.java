package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Marks {
public static void main(String[] args) {
	
	List<Integer> marks=new ArrayList<Integer>();
	marks.add(46);
	marks.add(50);
	marks.add(29);
	marks.add(32);
	marks.add(90);
	System.out.println(marks);
	
	List<Integer> collect = marks.stream().filter(i-> i>35).collect(Collectors.toList());
	System.out.println(collect);
	
	List<Integer> collect2 = marks.stream().map(i-> i+5).collect(Collectors.toList());
	System.out.println(collect2);
}
}
