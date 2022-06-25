package streams;

import java.util.List;

public class StreamFromList {

	public static void main(String[] args) {
		 var names = List.of("Jack","Mark","Larry", "Jack", "Scott");
		 
		 names.stream()
		      .distinct()
		      .sorted() 
		      .skip(1)
		      .limit(2)
		      .forEach(System.out::println);

	}

}
