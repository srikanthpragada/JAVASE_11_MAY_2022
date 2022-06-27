package streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class CountJavaFiles {

	public static void main(String[] args) throws Exception {
		Path p = Path.of("d:\\classroom\\may11\\demo");
		
		long count = Files.walk(p)
		     .filter(f -> f.toString().endsWith(".java"))
		     .count();
		
		System.out.println(count);

	}
 

}
