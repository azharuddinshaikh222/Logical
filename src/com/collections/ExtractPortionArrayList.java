package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ExtractPortionArrayList {
public static void main(String[] args) {
	
	List<Integer> list=new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	System.out.println(list);
	
	List<Integer> subList = list.subList(0,4);
	System.out.println(subList);
}
}
