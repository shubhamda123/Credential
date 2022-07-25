package buffwr;
import java.io.*;

public class Bwriter {

	public static void main(String[] args) throws IOException
	{
		FileWriter fr=new FileWriter("B.java");
		BufferedWriter br=new BufferedWriter(fr);
		
		br.write("Shubham");
		br.newLine();
		br.write("xyzzz");
		br.flush();
		br.close();
		
	}

}
