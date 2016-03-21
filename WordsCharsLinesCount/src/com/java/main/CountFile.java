package com.java.main;
import java.util.*;
import java.io.*;

public class CountFile {
	public static void main(String[] args) {
	    try {

	        Scanner scanner = new Scanner(new FileReader("sample.txt"));
	        
	        PrintWriter output = new PrintWriter(new FileOutputStream(
	                "newfile.txt"));

	        int numOfLines = 0;
	        int numOfWords = 0;
	        int numOfChar = 0; 

	        while (scanner.hasNextLine()) {
	            String line;
	            line = scanner.nextLine();
	            numOfLines++;

	            String str [] = line.split((" "));
	              for ( int i = 0; i <str.length ; i ++) {
	                if (str [i].length() > 0) {
	                  numOfWords ++; 
	                }
	              }
	              numOfChar += (line.length());

	        }

	        System.out.println("Number of Lines = "+numOfLines);
	        System.out.println("Number of Words = "+numOfWords); 
	        System.out.println("Number of Characters = "+numOfChar); 
	        scanner.close();
	        output.close();

	        System.out.println("File written.");

	    }

	    catch (FileNotFoundException e) {
	        System.out.println("There was an error opening one of the files.");
	    }

	    }

}
