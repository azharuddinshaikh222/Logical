package com.collections;

import java.util.ArrayList;
import java.util.List;

public class MininComparator {
public static void main(String[] args) {
	
	List<Integer> list=new ArrayList<Integer>();
	list.add(8);
	list.add(13);
	list.add(18);
	list.add(23);
	list.add(28);
	System.out.println(list);
	
	Integer minList = list.stream().min((i1,i2)->i1.compareTo(i2)).get();
	System.out.println(minList);
}
}
