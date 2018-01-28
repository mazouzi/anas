package org.mazouzi;


public class Introspection {
	
public static void main(String[] args) throws ClassNotFoundException {
		String chaine = "toto";
		Class classe = chaine.getClass();
		
		Class classe2 = Class.forName("java.lang.String");
		
		Class classe3 = String.class;
		
		System.out.println(classe.getName());
		System.out.println(classe2.getName());
		System.out.println(classe3.getName());
				
	}
}
