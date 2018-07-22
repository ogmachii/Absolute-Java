//

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TextEOF {
	public void useMe() {
		try {
			// File objects
			
			BufferedReader inputStream = new BufferedReader(new FileReader("original.text"));
			PrintWriter outputStream = new PrintWriter(new FileOutputStream("numbered.txt"));
			
			// Integer, String, Declaration
			
			int count = 0; 
			String line = inputStream.readLine();
			
			while(line != null) {
				count++;
				outputStream.println(count + " " + line);
				line = inputStream.readLine();
			}
			inputStream.close();
			outputStream.close();
		}catch(FileNotFoundException e) {
			System.out.println("err... File not found...");
		} catch(IOException e) {
			System.out.println("err... Cannot read...");
		}
	}
}
