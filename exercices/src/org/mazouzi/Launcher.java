package org.mazouzi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Launcher {

	public static void main(String[] args) {
		int a =10;
		int b = 5;	
		System.out.println("a="+a+" ,b="+b);
		b = a+b;
		System.out.println("a="+a+" ,b="+b);
		
		List<String> s = Arrays.asList("abdel", "selma", "anas","firas");
		
		//Collections.sort(s, (t1, t2) -> t1.compareTo(t2));
		Collections.sort(s, String::compareTo);
		
		System.out.println(s);
		
		Runnable r = () -> System.out.println("hello");
		
		process(() -> System.out.println("hello 2")); 
		
		
	}
	
	public static void process(Runnable r) {
		r.run();
	}

}
