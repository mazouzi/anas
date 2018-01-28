package org.mazouzi;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

public class StreamMap {
	
	public static void main (String[] args) {
		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(3, 4);
		List<String[]> pairs =
		numbers1.stream()
		.flatMap(i -> numbers2.stream()
		.map(j ->  new String[]{i.toString(), j.toString()})
		)
		.collect(toList());
		
		pairs.forEach(t -> System.out.println(t[0]+","+t[1]));
	}
	
}
