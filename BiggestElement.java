// The "BiggestElement" class.
import java.io.*;
public class BiggestElement
{
    public static void main (String[] args) throws IOException
    {
	int item[] = new int [5];
	populate (item);
	System.out.print ("The largest number is " + findBiggest (item));
	// Place your code here
    } // main method


    public static void populate (int item[]) throws IOException
    {
	for (int x = 0 ; x < item.length ; x++)
	{
	    DataInputStream input = new DataInputStream (System.in);
	    System.out.print ("Enter item number " + (x + 1) + ":");
	    item [x] = Integer.parseInt (input.readLine ());
	}
    }


    public static int findBiggest (int item[])
    {
	int big = item [0];
	for (int x = 1 ; x < item.length ; x++)
	{
	    if (item [x] > big)
	    {
		big = item [x];
	    }
	}
	return big;
    }
} // BiggestElement class


