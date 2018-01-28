package org.mazouzi;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonnaciSeries {
	
	public static void main (String[] args) {
		
		Stream.iterate(new int[]{0, 1}, t -> new int[] {t[1], t[0] + t[1]})
		.limit(10)
		.map(t -> t[0])
		.distinct()
		.forEach(System.out::println);
		//.forEach(t -> System.out.println("(" + t[0] + "," + t[1] +")"));
	}
}
