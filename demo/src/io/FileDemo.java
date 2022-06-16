package io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File f = new File("d:\\classroom");
		
		System.out.println(f.exists());
		if(f.isDirectory())
		{
			for(File file : f.listFiles())
			{
				System.out.println(file.getAbsolutePath());
			}
		}
		

	}

}
