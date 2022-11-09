package prac;
import java.io.IOException;
import java.io.RandomAccessFile;

public class prac 
{
    public static void main( String[] args )
    {
        RandomAccessFile rf;
        long pos = 0;
        
        try{
        	rf = new RandomAccessFile("acct20101125.log", "r");
        	pos = readLines(rf);
        	rf.close();
        	
        	System.out.println("\nread 1-10\n\n");
        	
        	rf = new RandomAccessFile("acct20101125.log", "r");
        	rf.seek(pos);
        	pos = readLines(rf);
        }catch(Exception e)
        {
        	System.out.println(e.toString());
       	}
        
    }

	private static long readLines(RandomAccessFile rf) throws IOException {
		long recnum = 1;
		String temp;
		while((temp = rf.readLine()) != null)
		{
			System.out.println("Line " + recnum + " : " + temp);
			if(((++recnum)%10) == 0)
			{
				break;
			}
		}
		return rf.getFilePointer();
	}
    
}

