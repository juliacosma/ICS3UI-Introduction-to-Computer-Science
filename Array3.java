// The "Array3" class.
import java.io.*;
public class Array3
{
    public static void main (String[] args) throws IOException
    {
	int randNum[] = new int [5];
	for (int x = 0 ; x < 5 ; x++)
	{
	    randNum [x] = (int) (Math.random () * 10 + 1);
	}

	for (int i = 0 ; i < 5 ; i++)
	{
	    for (int x = 0 ; x < 4 ; x++)
	    {
		if (randNum [x] > randNum [x + 1])
		{
		    int hold = randNum [x];
		    randNum [x] = randNum [x + 1];
		    randNum [x] = hold;
		}
	    }
	}

	for (int x = 0 ; x < 5 ; x++)
	{
	    System.out.print (randNum [x] + " ");
	}

	// Place your code here
    } // main method
} // Array3 class
