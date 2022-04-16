package com.collections;

import java.util.ArrayList;
import java.util.List;

public class UpdateInArrayList {
public static void main(String[] args) {
	
	List<String> list = new ArrayList<String>();
	list.add("azhar");
	list.add("shaikh");
	list.add("sahil");
	list.add("sarfaroz");
	System.out.println(list);
	String set2 = list.set(3, "darad");
	System.out.println(list);
	
	
	
	
}
}
