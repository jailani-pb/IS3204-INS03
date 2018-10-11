package week14.learningfileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class FileWriterClass {

	public static void main(String[] args) {
		File file = new File("data.xml");
		try {
			PrintWriter writeFile = new PrintWriter(
					new FileWriter(file, false));
			// true if you want to modify the file if exists
			// false if you want to override
			
			writeFile.println("<students>");
			writeFile.println("<student>");
			writeFile.println("<id>123</id>");
			writeFile.println("<name>Jailani</name>");
			writeFile.println("</student>");
			writeFile.println("<student>");
			writeFile.println("<id>456</id>");
			writeFile.println("<name>Rahman</name>");
			writeFile.println("</student>");
			writeFile.println("</students>");
			
			writeFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
