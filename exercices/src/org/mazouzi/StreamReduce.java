package org.mazouzi;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {
	
	public static void main (String[] args) {
		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		
		int i = numbers1.stream().reduce(0, (a,b) -> a+b);
		int i2 = numbers1.stream().reduce(0, Integer::sum);
		System.out.println(i2);
		
	}
	
}
