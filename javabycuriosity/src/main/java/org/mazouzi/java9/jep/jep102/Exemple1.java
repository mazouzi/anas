package org.mazouzi.java9.jep.jep102;

public class Exemple1 {
	public static void main(String[] args) {
		System.out.println(ProcessHandle.current());
		
		ProcessHandle.allProcesses().forEach(p -> System.out.println(p.pid() + " " + p.info().commandLine()));
	}
}
