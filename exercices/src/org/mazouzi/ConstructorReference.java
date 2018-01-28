package org.mazouzi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class ConstructorReference {

	public static void main (String[] args) {
		List<String> str = Arrays.asList("a","b","A","B");
		//(args) -> ClassName.staticMethod(args) 
    	//===> ClassName::staticMethod
		str.forEach(s -> System.out.println(s));
		str.forEach(System.out::println);
		
		Function<String, Integer> stringToIntegerBefore = (String s) -> Integer.parseInt(s);
		Function<String, Integer> stringToIntegerAfter = Integer::parseInt;
		
		
		
		//(arg0, rest) -> arg0.instanceMethod(rest) 
		//===> ClassName::instanceMethod
		//argo is of type className
		str.sort((t1, t2) -> t1.compareToIgnoreCase(t2));
		str.sort(String::compareToIgnoreCase);
		
		BiPredicate<List<String>, String> containsBefore = (list, element) -> list.contains(element);
		BiPredicate<List<String>, String> containsAfter =  List::contains;
		
		
		//(args) -> expr.instanceMethod(args) 
		//===> expr::instanceMethod
		
		
		
		
	}
	
}
