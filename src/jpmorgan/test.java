package jpmorgan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class test {
	
	public static void readFile(File file) throws Exception
	{
		InputStream in = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String line;
		while((line = br.readLine())!=null)
		{
			String[] numbers = line.split(",");
			long X = Long.parseLong(numbers[0]);
			long Z = Long.parseLong(numbers[1]);
			
			
			List<Long> li = new ArrayList<Long>();
			for(long i=0; i<X; i++)
			{
				li.add(i);
			}
			int index = 0;
			while(li.size()>1)
			{
				long j = 1;
				while(j<Z)
				{
					j = j+1;
					index = index+1;
				}
				if(index>=li.size())
					index = index%li.size();
				
				System.out.print(li.get(index)+",");
				li.remove(index);
			}
			System.out.println(li.get(0));
			
		}
	}
	
	public static void main(String[] args)
	{
		File file = new File("C:\\Users\\Danish\\Desktop\\sample.txt");
		try
		{
			readFile(file);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
		