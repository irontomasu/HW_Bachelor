import java.io.*;

public class WordCounting{
    public static void main(String[] args) throws IOException{
	BufferedReader a = null;
	byte arr[] = new byte[2048];
	int i;
	try{
	    a = new BufferedReader(new FileReader("input.txt"));
	    String s;
	    while((s = a.readLine())!= null)
		System.out.println(s);
	} catch(Exception e){ System.out.println(e);
	}finally{
	    if(a != null){
		a.close();
	    }
	}
    }
}