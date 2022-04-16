package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingArrayList {
public static void main(String[] args) {
	
	List<Integer> marks=new ArrayList<Integer>();
	marks.add(90);
	marks.add(80);
	marks.add(70);
	marks.add(60);
	marks.add(50);
	marks.add(40);
	System.out.println(marks);
	List<Integer> sortedMarks = marks.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedMarks);
	
}
}
