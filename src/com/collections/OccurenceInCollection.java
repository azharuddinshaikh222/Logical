package com.collections;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceInCollection {
public static void main(String[] args) {
	
	List<Integer> list = List.of(2,3,4,2,3,6,5,4,5);
	Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	System.out.println(collect);
}
}
