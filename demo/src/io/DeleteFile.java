package io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {

	public static void main(String[] args) throws IOException {
//		File f = new File("d:\\classroom\\story.txt");
//		f.delete();
		
		 
		Path path = Paths.get("d:\\classroom\\may11\\nofile.txt");
		//System.out.println(path.getClass());
		Files.delete(path);

	}

}
