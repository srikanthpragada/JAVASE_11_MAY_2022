package streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class ListFiles {

	public static void main(String[] args) throws Exception {
		Path p = Path.of("d:\\classroom\\may11\\demo");
		
		Files.walk(p)
		     .forEach(System.out::println);

	}

}
