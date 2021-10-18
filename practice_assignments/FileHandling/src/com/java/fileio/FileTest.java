package com.java.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {
	
	public static void readFile(FileInputStream fin, String fileName) throws IOException {
		
		System.out.println("======================================");
		System.out.println(fileName + " File is ready...");
		System.out.println("Reading .. " + fileName);
		
		byte b = (byte) fin.read();
		
		while(b!=-1) {
			System.out.print((char)b);
			b = (byte) fin.read();
		}
		
		System.out.println("\n---------------\nReading Completed! \nclosing the file");
		fin.close();
	}
	
	public static void main(String[] args) {
		
		
		StoryTeller storyTeller = new StoryTeller("Files/prince.txt");
		storyTeller.open();
		storyTeller.read();
		storyTeller.close();
		
		storyTeller = new StoryTeller("Files/king.txt");
		storyTeller.open();
		storyTeller.read();
		storyTeller.close();
		
		storyTeller = new StoryTeller("Files/queen.txt");
		storyTeller.open();
		storyTeller.read();
		storyTeller.close();
		
//		try {
//			FileInputStream fin;
//			fin = new FileInputStream("prince.txt");
//			readFile(fin, "prince.txt");
//			
//			fin = new FileInputStream("king.txt");
//			readFile(fin, "king.txt"); 
//			
//			fin = new FileInputStream("queen.txt");
//			readFile(fin, "queen.txt"); 
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
}

/*

java.io

	File input and output stream
	
	
				Your Java Code
					data <-- memory - primary memory
					|
			------------------
			|		|		|
			file	memory	socket
			|
	------------------
	|			|
	output		input
	(writing)	(reading)

				DriverManager   		 ClassName
				FixedDepositAccount
				
				openConnection()	 methodName, 
				setLookAndFeel()	 
			
				rollNumber			 variableName
				accOpeningDate		 
				
				PI, MAX, MIN		CONSTANTS
				
				pack1.pack2.		packages
				
=================================================================================							
									Java io
=================================================================================							
		byte based						||	character based
		stream							||	stream
		|								||	|
		1 byte - min unit				||	2 bytes - min unit
		ASCII - 1 byte - 256 			||	char - 2 bytes - 65535
=================================================================================							
InputStream		|		OutputStream	||	Reader			|	writer
	read()		|			write()		||		read()		|	  write()
=================================================================================							
FileInputStream	|	FileOutputStream	||  FileReader		| FileWriter
				|						||					|
				|		PrintStream		||					| PrintWriter
				|						||					|
				|						||					|
				|						||					|
				|						||					|
				









*/