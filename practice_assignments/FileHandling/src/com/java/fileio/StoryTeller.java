package com.java.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StoryTeller {
	private String fileName;
	private FileInputStream fin;
	StoryTeller(String fileName){
		this.fileName = fileName;
	}
	
	public void open() {
		try {
			fin = new FileInputStream(fileName);
			System.out.println("======================================");
			System.out.println(fileName + " File is ready...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			System.out.println("\nclosing the file");
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void read() { 
		
		System.out.println("Reading .. " + fileName);
		
		byte b;
		try {
			b = (byte) fin.read();
			
			while(b!=-1) {
				System.out.print((char)b);
				b = (byte) fin.read();
			}
			
			System.out.println("\n---------------\nReading Completed!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
