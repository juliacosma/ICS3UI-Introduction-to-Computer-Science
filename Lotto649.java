// The "Lotto649" class.
import java.io.*;
public class Lotto649
{
    public static void main (String[] args) throws IOException
    {
	DataInputStream input = new DataInputStream (System.in);

	int win1, win2, win3, win4, win5, win6, guess1, guess2, guess3, guess4, guess5, guess6, hold, winCount = 0;
	double bankBal = 50.00;
	String answer = "y";

	System.out.println ("Welcome to Lotto649, just $5.00 to play.");
	
	System.out.println(" ");

	while (answer.equalsIgnoreCase ("y") && bankBal >= 5)
	{
	    //charge bank account
	    bankBal = bankBal - 5;
	    
	    //reset win count
	    winCount = 0;

	    //picking winning numbers

	    win1 = (int) (Math.random () * 49 + 1);
	    win2 = (int) (Math.random () * 49 + 1);
	    win3 = (int) (Math.random () * 49 + 1);
	    win4 = (int) (Math.random () * 49 + 1);
	    win5 = (int) (Math.random () * 49 + 1);
	    win6 = (int) (Math.random () * 49 + 1);

	    while (win2 == win1)
	    {
		win2 = (int) (Math.random () * 49 + 1);
	    }

	    while (win3 == win1 || win3 == win2)
	    {
		win3 = (int) (Math.random () * 49 + 1);
	    }

	    while (win4 == win1 || win4 == win2 || win4 == win3)
	    {
		win4 = (int) (Math.random () * 49 + 1);
	    }

	    while (win5 == win1 || win5 == win2 || win5 == win3 || win5 == win4)
	    {
		win5 = (int) (Math.random () * 49 + 1);
	    }

	    while (win6 == win1 || win6 == win2 || win6 == win3 || win6 == win4 || win6 == win5)
	    {
		win6 = (int) (Math.random () * 49 + 1);
	    }

	    //winning numbers
	    //System.out.println ("Winning numbers out of order: " + win1 + " " + win2 + " " + win3 + " " + win4 + " " + win5 + " " + win6);

	    //guessing numbers

	    //first guess
	    System.out.print ("Guess a number from 1-49: ");
	    guess1 = Integer.parseInt (input.readLine ());

	    while (guess1 < 1 || guess1 > 49)
	    {
		System.out.println ("You did not enter a number in the range 1-49.");
		System.out.print ("Guess another number from 1-49: ");
		guess1 = Integer.parseInt (input.readLine ());
	    }

	    //second guess
	    System.out.print ("Guess a second number from 1-49: ");
	    guess2 = Integer.parseInt (input.readLine ());

	    while (guess2 < 1 || guess2 > 49 || guess2 == guess1)
	    {
		if (guess2 < 1 || guess2 > 49)
		{
		    System.out.println ("You did not enter a number in the range 1-49.");
		}
		else
		{
		    System.out.println ("Enter a guess you have not previously entered.");
		}
		System.out.print ("Guess another number from 1-49: ");
		guess2 = Integer.parseInt (input.readLine ());
	    }

	    //third guess
	    System.out.print ("Guess a third number from 1-49: ");
	    guess3 = Integer.parseInt (input.readLine ());

	    while (guess3 < 1 || guess3 > 49 || guess3 == guess1 || guess3 == guess2)
	    {
		if (guess3 < 1 || guess3 > 49)
		{
		    System.out.println ("You did not enter a number in the range 1-49.");
		}
		else
		{
		    System.out.println ("Enter a guess you have not previously entered.");
		}
		System.out.print ("Guess another number from 1-49: ");
		System.out.print ("Guess another number from 1-49: ");
		guess3 = Integer.parseInt (input.readLine ());
	    }

	    //fourth guess
	    System.out.print ("Guess a fourth number from 1-49: ");
	    guess4 = Integer.parseInt (input.readLine ());

	    while (guess4 < 1 || guess4 > 49 || guess4 == guess1 || guess4 == guess2 || guess4 == guess3)
	    {   
		if (guess4 < 1 || guess4 > 49)
		{
		    System.out.println ("You did not enter a number in the range 1-49.");
		}
		else
		{
		    System.out.println ("Enter a guess you have not previously entered.");
		}
		System.out.println ("You did not enter a valid number.");
		System.out.print ("Guess another number from 1-49: ");
		guess4 = Integer.parseInt (input.readLine ());
	    }

	    //fifth guess
	    System.out.print ("Guess a fifth number from 1-49: ");
	    guess5 = Integer.parseInt (input.readLine ());

	    while (guess5 < 1 || guess5 > 49 || guess5 == guess1 || guess5 == guess2 || guess5 == guess3 || guess5 == guess4)
	    {
		if (guess5 < 1 || guess5 > 49)
		{
		    System.out.println ("You did not enter a number in the range 1-49.");
		}
		else
		{
		    System.out.println ("Enter a guess you have not previously entered.");
		}
		System.out.print ("Guess another number from 1-49: ");
		guess5 = Integer.parseInt (input.readLine ());
	    }

	    //sixth guess
	    System.out.print ("Guess a sixth number from 1-49: ");
	    guess6 = Integer.parseInt (input.readLine ());

	    while (guess6 < 1 || guess6 > 49 || guess6 == guess1 || guess6 == guess2 || guess6 == guess3 || guess6 == guess4 || guess6 == guess5)
	    {
		if (guess6 < 1 || guess6 > 49)
		{
		    System.out.println ("You did not enter a number in the range 1-49.");
		}
		else
		{
		    System.out.println ("Enter a guess you have not previously entered.");
		}
		System.out.print ("Guess another number from 1-49: ");
		guess6 = Integer.parseInt (input.readLine ());
	    }

	    //bubble sort
	    for (int x = 0 ; x <= 5 ; x++)
	    {
		if (win1 > win2)
		{
		    hold = win1;
		    win1 = win2;
		    win2 = hold;
		}

		if (win2 > win3)
		{
		    hold = win2;
		    win2 = win3;
		    win3 = hold;
		}

		if (win3 > win4)
		{
		    hold = win3;
		    win3 = win4;
		    win4 = hold;
		}

		if (win4 > win5)
		{
		    hold = win4;
		    win4 = win5;
		    win5 = hold;
		}

		if (win5 > win6)
		{
		    hold = win5;
		    win5 = win6;
		    win6 = hold;
		}
	    }
	    
	    System.out.println(" ");

	    //output
	    System.out.println ("Winning numbers in order: " + win1 + " " + win2 + " " + win3 + " " + win4 + " " + win5 + " " + win6);
	    System.out.println ("Your guesses: " + guess1 + " " + guess2 + " " + guess3 + " " + guess4 + " " + guess5 + " " + guess6);

	    //count wins
	    if (guess1 == win1 || guess1 == win2 || guess1 == win3 || guess1 == win4 || guess1 == win5 || guess1 == win6)
	    {
		winCount++;
	    }

	    if (guess2 == win1 || guess2 == win2 || guess2 == win3 || guess2 == win4 || guess2 == win5 || guess2 == win6)
	    {
		winCount++;
	    }

	    if (guess3 == win1 || guess3 == win2 || guess3 == win3 || guess3 == win4 || guess3 == win5 || guess3 == win6)
	    {
		winCount++;
	    }

	    if (guess4 == win1 || guess4 == win2 || guess4 == win3 || guess4 == win4 || guess4 == win5 || guess4 == win6)
	    {
		winCount++;
	    }

	    if (guess5 == win1 || guess5 == win2 || guess5 == win3 || guess5 == win4 || guess5 == win5 || guess5 == win6)
	    {
		winCount++;
	    }

	    if (guess6 == win1 || guess6 == win2 || guess6 == win3 || guess6 == win4 || guess6 == win5 || guess6 == win6)
	    {
		winCount++;
	    }
	    
	    System.out.println(" ");

	    //guess output
	    System.out.println ("You had " + winCount + " correct guesses.");

	    //prizes
	    if (winCount == 6)
	    {
		System.out.println ("Congrats you won $64 000 000!");
		bankBal = bankBal + 64000000;
	    }
	    if (winCount == 5)
	    {
		System.out.println ("You won $1 000");
		bankBal = bankBal + 1000;
	    }
	    if (winCount == 4)
	    {
		System.out.println ("You won $100");
		bankBal = bankBal + 100;
	    }
	    if (winCount == 3)
	    {
		System.out.println ("You won $50");
		bankBal = bankBal + 50;
	    }
	    if (winCount == 2)
	    {
		System.out.println ("You won $25");
		bankBal = bankBal + 25;
	    }
	    if (winCount == 1)
	    {
		System.out.println ("You won $10");
		bankBal = bankBal + 10;
	    }
	    
	    System.out.println ("Your current balance is $" + bankBal);
	    
	    System.out.println(" ");


	    //play again
	    System.out.print ("If you would like to play again for $5 enter 'y': ");
	    answer = input.readLine ();
	    
	    System.out.println(" ");
	    
	    if (answer.equalsIgnoreCase ("y") && bankBal < 5)
	    {
	    System.out.println ("You have insufficient funds.");
	    }
	}
    } // main method
} // Lotto649 class
