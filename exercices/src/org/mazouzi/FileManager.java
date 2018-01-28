package org.mazouzi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {
	
	public static void main(String[] args) {
		
	}
	
	public static String processFile() throws FileNotFoundException, IOException {
		try(BufferedReader br = new BufferedReader(new FileReader(""))) {
			return br.readLine();
		}
	}
}
