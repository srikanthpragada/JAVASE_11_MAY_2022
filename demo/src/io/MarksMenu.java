package io;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class MarksMenu {

	public static void addMarks(RandomAccessFile raf)  throws Exception 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Marks :");
		int marks = s.nextInt();
		raf.seek(raf.length());
		raf.writeInt(marks);
	}
	
	public static void listMarks(RandomAccessFile raf)
	{
		
	}
	
	// Take rollno and new marks and update file 
	public static void updateMarks(RandomAccessFile raf)  throws Exception 
	{
		
	}
	public static void main(String[] args) throws Exception {
		RandomAccessFile raf = 
				  new RandomAccessFile("d:\\classroom\\may11\\marks.dat","rw");
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.println("**** Marks Menu *****");
			System.out.println("1. Add Marks");
			System.out.println("2. List Marks");
			System.out.println("3. Update Marks");
			System.out.println("4. Exit");
			System.out.println("Enter Choice [1-4] :");
			
			int choice = s.nextInt();
			
			switch(choice)
			{
			  case 1 :  addMarks(raf);
			            break;
			  case 2 :  listMarks(raf);
	            		break;			            
			  case 4 :  raf.close();
			            System.out.println("Goodbye!!!");
				        System.exit(0);
			}
		}

	}

}
