package com.collections;

import java.util.ArrayList;
import java.util.List;

public class DeleteInArrayList {
public static void main(String[] args) {
	
	List<String> list=new ArrayList<String>();
	list.add("abc");
	list.add("def");
	list.add("ghi");
	list.add("jkl");
	list.add("mno");
	System.out.println(list);
	
	 list.remove(2);
	 System.out.println(list);
	
}
}
