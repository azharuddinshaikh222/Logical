package com.collections;

import java.util.List;
import java.util.stream.Collectors;

public class DuplicateInList {
public static void main(String[] args) {
	
	
	List<Integer> list = List.of(2,4,3,2,6,7,5);
	System.out.println(list);
	List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
	System.out.println(collect);
}
}
