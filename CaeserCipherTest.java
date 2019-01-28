import java.io.File;

public class CaeserCipherTest {

	public static void main(String[] args) {
		
		File someFile = new File("file.txt");
		int myIter = 1;
		
		CaeserCipherGenerator caeserCipher = new CaeserCipherGenerator(someFile, myIter);
		
		caeserCipher.printCipher();
	}
	
}
