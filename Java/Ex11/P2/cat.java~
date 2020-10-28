import java.io.*;

public class Cat{
    public static void cat(File file) {
	RandomAccessFile input = null;
	String line = null;
    
	try {
	    input = new RandomAccessFile(file, "r");
	    while ((line = input.readLine()) != null) {
		System.out.println(line);
	    }
	    return;
	} catch (FileNotFoundException fe) {
	    System.err.println("File Not Found Exception :" + fe);
	} catch(IOException ioe){
	    System.err.println("IO Exception :" + ioe);
	} finally {
	    if (input != null) {
		input.close();
	    }
	}
    }
}