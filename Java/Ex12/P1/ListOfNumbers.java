import java.io.*;
import java.util.Vector;

public class ListOfNumbers {
    private static final int SIZE = 10;
    private Integer victor[];

    public ListOfNumbers () {
        victor = new Integer[SIZE];
        for (int i = 0; i < SIZE; i++)
            victor[i] = i;
    }
    public void writeList() {
        PrintWriter out = null;  // for print out with some format.

        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));   // Read from a text file, and to printout it.
        
            for (int i = 0; i < SIZE; i++)
                out.println("Value at: " + i + " = " + victor[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " +
                                 e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }
    public void readList(String fileName) {
        String line = null;
        try {
            RandomAccessFile raf = new RandomAccessFile(fileName, "r");
            int idx = 0;
            while ((line = raf.readLine()) != null) {
                Integer i = new Integer(Integer.parseInt(line));
                System.out.println(i);
                victor[idx++] = i; 
            }

        } 
	catch(ArrayIndexOutOfBoundsException aibe){
	    System.err.println("Array Index Out of Bounds Exception :" + aibe);
	}
	catch(FileNotFoundException fe){
	    System.err.println("File Not Found Exception :" + fe);
	}
	catch(IOException ioe){
	    System.err.println("IO Exception :" + ioe);
	}
    }

    public static void main(String[] args) {
       ListOfNumbers ga = new ListOfNumbers();
       ga.readList("infile.txt");
       ga.writeList();
    }
}