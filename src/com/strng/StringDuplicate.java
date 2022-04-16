package com.strng;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDuplicate {
public static void main(String[] args) {
	
	String s="azhhar";
	char[] charArray = s.toCharArray();
    List<char[]> list = Arrays.asList(charArray);
    Map<char[], Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    System.out.println(collect);
    
}
}
