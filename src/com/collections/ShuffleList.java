package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleList {
public static void main(String[] args) {
	
	List<Integer> list=new ArrayList<Integer>();
	list.add(20);
	list.add(40);
	list.add(60);
	list.add(80);
	list.add(100);

	list.forEach(e->
	{
		System.out.println(e);
	});
	
	Collections.shuffle(list);
	System.out.println(list);
}
}
