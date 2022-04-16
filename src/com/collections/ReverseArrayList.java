package com.collections;

import java.util.List;

public class ReverseArrayList {
public static void main(String[] args) {
	
	List<String> list = List.of("abc","def","ghi","jkl","mno");
	Object[] array = list.toArray();
	for(int i=array.length-1;i>=0;i--)
	{
		System.out.println(array[i]);
	}
}
}
