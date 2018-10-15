package core;
import java.io.*; 
import java.util.*;

public class CNFReader 
{
	private static ArrayList<String> stuff = new ArrayList<String>();
	private static String line;
	
	public static void ReadFile() throws Exception
	{
		File file = new File("/Users/aidenchia/Documents/@SUTD/Term\\ 4/Java/twodee/src/sampleCNF/largeSat.cnf");

		BufferedReader reader = new BufferedReader(new FileReader(file));
		
		line = reader.readLine();
		while ((line = reader.readLine()) != null)
		{
			System.out.println(line);
		}

	}

}
