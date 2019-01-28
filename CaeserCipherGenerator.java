import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.lang.Object;
import org.apache.commons.lang3.*;

public class CaeserCipherGenerator {
	
	//read in file
	private File file;
	private int cipherIter;
	
	private final String inputStrings = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final String outputStrings = "bcdefghijklmnopqrstuvwxyzaBCDEFGHIJKLMNOPQRSTUVWXYZA";
		
	//constructor requiring file and iteration
	public CaeserCipherGenerator(File f, int iter) {
		
		//assign file and iterator to private variables
		this.file = f;
		cipherIter = iter;
				
	}
	
	public void printCipher() {
	
		try (FileInputStream fis = new FileInputStream(file)) {
	
			int content;
			
			while ((content = fis.read()) != -1) {
				// convert to char and display it
				
				char c = (char)content;
				String c1 = Character.toString(c);
				
				for(int i = 0; i < cipherIter; i++) {
					c1 = iterateChar(c1);
				}
				
				System.out.print(c1);
			}
	
		} catch (IOException e) {
			e.printStackTrace();
		}	
	
	}
	
	
	public String iterateChar(String someChar) {
		
		String newChar = StringUtils.replaceChars(someChar, inputStrings, outputStrings );
		
		return newChar;
		
	}

}
