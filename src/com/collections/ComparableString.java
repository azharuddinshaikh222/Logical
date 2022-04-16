package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableString {
public static void main(String[] args) {
	List<String> names=new ArrayList<String>();
	names.add("zahid");
	names.add("wasim");
	names.add("danish");
	names.add("mudassir");
	names.add("azhar");
	//System.out.println(names);
	
List<String> updatedName =names.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
System.out.println(updatedName);
}
}
