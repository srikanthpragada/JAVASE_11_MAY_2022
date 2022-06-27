package streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class SearchJavaFiles {

	public static boolean fileContains(Path file, String search) {
		try {
			String contents = Files.readString(file);
			return contents.contains(search);
		} catch (Exception ex) {
			return false;
		}
	}

	public static void main(String[] args) throws Exception {
		Path p = Path.of("d:\\classroom\\may11\\demo");
		String s = "Files";

		Files.walk(p).filter(f -> fileContains(f, s))
		             .forEach(System.out::println);

	}

}
