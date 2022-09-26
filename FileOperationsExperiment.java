package class_assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileOperationsExperiment {

	public static void main(String[] args) {
		String fileName = "F:\\Selenium workspace\\zoho_assignment1\\src\\class_assignments\\FileOperationsExperiment.java";
		printTheFile(fileName);
		countTheLines(fileName);
		copyFiles(fileName);
		findFilePath(fileName);
	}

	private static void findFilePath(String fileName) {
		File file = new File(fileName);
		System.out.println("Path: " + file.getPath());
	}

	private static void copyFiles(String fileName) {
		File sourceFile = new File("F:\\Selenium workspace\\zoho_assignment1\\src\\class_assignments\\FileOperationsExperiment.java");
        File copyFile = new File("F:\\Selenium workspace\\zoho_assignment1\\src\\class_assignments\\FileOperationsExperimentCopy.java");
        System.out.println("Copied Successfully");
	}

	private static void countTheLines(String fileName) {
		int lines = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			while (reader.readLine() != null)
				lines++;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void printTheFile(String fileName) {
		try {
			FileReader fileReader = new FileReader(fileName);
			int index;
			while ((index = fileReader.read()) >=0)

				System.out.print((char) index);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}

