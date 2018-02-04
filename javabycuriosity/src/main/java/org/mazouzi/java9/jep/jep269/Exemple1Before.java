package org.mazouzi.java9.jep.jep269;

import java.util.HashSet;
import java.util.Set;

public class Exemple1Before {
	public static void main(String[] args) {
		Set<String> set = new HashSet();
		set.add("apple");
		set.add("orange");
		set.add("peach");
		
		System.out.println(set);
	}
}
