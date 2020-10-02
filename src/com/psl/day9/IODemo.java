package com.psl.day9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class IODemo {

	public static void displayFolderContents(String path)
	{
		Map<String,String> map = new HashMap<String, String>();
		File file = new File(path);
		for (String name : file.list()) {
			System.out.println(name);
			map.put(name, file.getName());
		}

	}
	
	public static boolean searchFile(String path, String filename) {
		File file = new File(path);
		for (String name : file.list()) {
			if(name.equals(filename))
				return true;
		}
		
		return false;
	}
	
	public static int countWords(String filePath) {
		int wordscnt = 0;
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			
			while ((line = reader.readLine())!=null) {
				String tokens [] = line.split(" ");
				wordscnt = wordscnt + tokens.length;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return wordscnt;
	}
	
	
	
	
	public static void main(String[] args) {
		displayFolderContents("/home/nilesh/Desktop");
		System.out.println("\n"+searchFile("/home/nilesh/Desktop", "test.zip"));
		System.out.println(countWords("/home/nilesh/Desktop/steps.txt"));
	}
	
	
}
