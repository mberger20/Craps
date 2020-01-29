
/**
 * The Craps class plays the game. 
 *
 * @author Maddy Berger
 * @version 2020-01-15
 */

import java.util.Scanner;

public class Craps
{
    public static void giveInstructions(Scanner in)
    {
        System.out.println("Would you like instructions on how to play Craps (Y/n)?");
        String playGame = in.nextLine();
        if (playGame.equals("") ||
            playGame.substring(0,1).equalsIgnoreCase("y"))
        {
            System.out.println("1. Roll two dice and add them together.");
            System.out.println("2. If you get a 7 or 11 on the first roll you win.");
            System.out.println("   If you get a 2, 3, or 12 on the first roll you lose.");
            System.out.println("   Any other number you roll becomes your point...");
            System.out.println("3. You have to keep rolling to try and get your point again.");
            System.out.println("   If you didn't win or lose on the first roll, keep");
            System.out.println("   rolling until:");
            System.out.println("   a. you roll your point again, and you win!");
            System.out.println("   b. you roll a 7, and lose. :(");
        }

    }
    
    public static int rollTheDice(Scanner in, Die d)
    {
        System.out.println("Press <Enter> to roll the dice.");
        in.nextLine(); // Don't even need to save their input. 
        int result1 = d.roll();
        int result2 = d.roll();
        int total = result1 + result2;
        System.out.println("You rolled a " + result1 + " and a " + result2 + " for a total of " + total + ".");
        return total;
    }
        
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Die d = new Die();
        System.out.println("The game of Craps!");
        giveInstructions(in);
        
        String playStatus = "y";
        while (playStatus.substring(0,1).equalsIgnoreCase("y"))
        {
            System.out.println("First roll!");
            int result = rollTheDice(in, d);
            if (result == 7 || result == 11)
            {
                System.out.println("You win!");
            }
            else if (result == 2 || result == 3 || result == 12)
            {
                System.out.println("You lose!");
            }
            else 
            {
                int point = result;
                System.out.println("Your point is " + result + ". Try to roll again.");
                result = rollTheDice(in, d);
                while (result != 7 && result != point)
                {
                    System.out.println("Roll again!");
                    result = rollTheDice(in, d);
                }
                if (result == 7)
                {
                    System.out.println("So sorry, you lose");
                }
                else 
                {
                    System.out.println("You rolled your point again! You win!");
                }
            }
                
            System.out.println("Would you like to play again (Y/n)?");
            playStatus = in.nextLine();
            if (playStatus.equals("")) { playStatus = "y"; }
        }
        System.out.println("Thanks for playing the game of Craps!");
    }
}


    
   