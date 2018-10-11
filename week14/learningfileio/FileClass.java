package week14.learningfileio;

import java.io.File;
import java.util.Date;

public class FileClass {

	public static void main(String[] args) {
		// Windows:
		// "C:\\Users\\PC-NAME\\Desktop\\FILENAME"
		// "C:\\Users\\jailanihar\\Desktop\\abcde.txt"
		File file = new File("/home/jailanihar/abcde.txt");
		System.out.println("Does it exists? " + file.exists());
		// "C:\\Users\\jailanihar\\Desktop"
		System.out.println("Is it a Directory? " + file.isDirectory());
		System.out.println("Is it a File? " + file.isFile());
		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("Last modified on: " + 
								new Date(file.lastModified()));
		System.out.println("File name: " + file.getName());
		// For the next statement: please make sure you are
		// reading file that is not important
		File file2 = new File("/home/jailanihar/abcdefgh.txt");
		file.renameTo(file2);
		file2.delete();
	}
	
}
