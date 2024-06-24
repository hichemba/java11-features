package home.hichemba.java;

import java.util.Arrays;
import java.util.List;

public class CollectionMain {

	public static void main(String[] args) {

		List sampleList = Arrays.asList("FirstItem", "SecondItem");

		String[] sampleArray = (String[]) sampleList.toArray(String[]::new);

		System.out.println(sampleArray[0]);
	}

}
