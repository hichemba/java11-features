package home.hichemba.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMain {

	public static void main(String[] args) {

		String tmpdir = System.getProperty("java.io.tmpdir");
		System.out.println("Temp file path: " + tmpdir);

		Path filePath;
		try {
			filePath = Files.writeString(Files.createTempFile("demo", ".txt"), "Sample text");
			System.out.println("Temp file : " + filePath);

			String fileContent = Files.readString(filePath);
			System.out.println("File content : " + fileContent);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
