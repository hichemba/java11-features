package home.hichemba.java;

import java.util.List;
import java.util.stream.Collectors;

public class StringMain {

	public static void main(String[] args) {

		// New methods : isBlank, lines, strip, stripLeading, stripTrailing, and repeat.
		String multilineString = "This is a \n \n test \n to explore Java 11 features.";
		List<String> lines = multilineString.lines().filter(line -> !line.isBlank()).map(String::strip)
				.collect(Collectors.toList());
		System.out.println(lines);
	}

}
