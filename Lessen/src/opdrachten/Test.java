package opdrachten;

import java.util.Random;
import java.util.Scanner;

public class Test
{
    enum Colour
    {
	RED, GREEN, BLUE, PURPLE, YELLOW, ORANGE
    }

    enum GameState
    {
	BLACK, WHITE, NONE
    }

    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	Random rnd = new Random();
	final int MAX_ROUNDS = 10;
	final int MAX_GUESSES = 4;
	final boolean DEBUG = false;

	Colour[] code = new Colour[MAX_GUESSES];
	GameState[] check = new GameState[MAX_GUESSES];

	for (int i = 0; i < MAX_GUESSES; i++)
	{
	    code[i] = Colour.values()[rnd.nextInt(Colour.values().length)];
	}

	if (DEBUG)
	{
	    for (Colour colour : code)
	    {
		System.out.println(colour.name());
	    }
	}

	int rounds = 0;
	boolean playerHasWon = false;
	int lastIndex = 0;
	for (Colour colour : Colour.values())
	{
	    System.out.println(" -" + colour.name());
	}

	do
	{

	    Colour[] guesses = new Colour[MAX_GUESSES];
	    System.out.println("Round: " + (rounds + 1) + " - Please enter one of the following values: ");// Request
													   // & validate
	    for (int i = lastIndex; i < MAX_GUESSES; i++)
	    {
		lastIndex = i;
		String guess = sc.next(); // user inputs
		for (Colour colour : Colour.values())
		{
		    if (guess.toLowerCase().equals(colour.name().toLowerCase()))
		    {
			guesses[i] = colour;
		    }
		}

		if (guesses[i] == null)
		{
		    System.out.println(" - ERROR - ");
		    System.out.println("Enter one of the following values: ");
		    for (Colour colour : Colour.values())
		    {
			System.out.println(" -" + colour.name());
		    }
		    i--;
		    continue;
		}
		System.out.println("You've selected " + guesses[i].name() + " for position: " + (i + 1));
	    }

	    // Setup for next round
	    lastIndex = 0;
	    rounds++;

	    System.out.println("-- Result for round: " + (rounds + 1) + " --");
	    for (int i = 0; i < MAX_GUESSES; i++)
	    {
		check[i] = GameState.NONE;
		if (guesses[i].equals(code[i]))
		{
		    check[i] = GameState.BLACK;
		    continue;
		} else
		{
		    for (int j = 0; j < MAX_GUESSES; j++)
		    {
			if (j != i && guesses[i].equals(code[j]))
			{
			    check[i] = GameState.WHITE;
			}
		    }
		}
	    }

	    boolean checkIfWon = true;
	    for (int i = 0; i < MAX_GUESSES; i++)
	    {
		System.out.println(check[i].name());
		if (check[i] != GameState.BLACK)
		{
		    checkIfWon = false;
		}
	    }
	    playerHasWon = checkIfWon;

	    System.out.println("-- DONE CHECKING --");
	} while (!playerHasWon && rounds < MAX_ROUNDS);

	if (playerHasWon)
	{
	    System.out.println("Congratulations!");
	} else
	{
	    System.out.println("Sad");
	}
    }
}
