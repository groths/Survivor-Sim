package main;

import java.util.ArrayList;
import java.util.Scanner;

/**

 @author Rachel, Matt
 */
public class Main
{

    /**
     @param args the command line arguments don't do anything
     */
    public static void main(String[] args)
    {

        System.out.println("Welcome to Surivivor-Sim!");

        playGame();

        

        Scanner input = new Scanner(System.in);

        boolean keepAsking = true;

        String line = "";

        System.out.println("play again?(y/n)");
        
        while (keepAsking)
        {
            line = input.nextLine();
            
            System.out.println("debug 1");
            
            switch (line)
            {
                case ("Y"):
                case ("y"):
                    playGame();
                    System.out.println("play again?(y/n)");
                    break;
                case ("N"):
                case ("n"): keepAsking = false;
                    break;
                default: System.out.println("play again?(y/n)");
            }

            

        }
        
        input.close();
        
        System.out.println("Goodbye!");
        
        
    }

    private static void playGame()
    {
        
        System.out.println("Starting new game");
        
        while (remainingContestants.size() > FINALE_CONTESTANTS)
        {
            runDay();
            day++;
        }
        
        System.out.println("Thanks for playing!");

    }

    private static void runHour()
    {
        System.out.println(hour + ":00");
    }

    /**
     NOW: This is a lot but... Create reward challenge method Create immunity
     challenge method Create tribal council method (We can figure out a system
     to have these each every few days)
     <p>
     And also just like a general neutral day thing where you get the option to
     relax/sleep, look for immunity idol, be social, etc. So maybe if the day is
     a certain multiple we can have the special things like challenges, tribal
     council, etc. but otherwise not
     <p>
     and maybe eventually we can add a random number generator where if it gets
     a certain number certain cool/random things happen (like you see an animal
     or something)
     <p>
     and then we can also incorporate when it gets to a certain day special
     things happen (such as merge, loved ones visit, auction challenge, etc. any
     fun things we want to add!)
     */
    private static void runDay()
    {

        System.out.println("Starting day " + day);
        
        for (int i = 0; i < 24; i++)
        {
            runHour();
            hour++;
            if (hour == 24)
            {
                hour = 0;
            }
        }

    }
    
    static int getTotalContestants()
    {
        return TOTAL_CONTESTANTS;
    }
    
    static ArrayList getAllContestants()
    {
        return (ArrayList) allContestants.clone();
    }

    private static final int TOTAL_CONTESTANTS = 18;

    private static final int FINALE_CONTESTANTS = 3;

    private static int day = 0;

    private static int hour = 6;

    private static ArrayList<Contestant> allContestants = new ArrayList<>(TOTAL_CONTESTANTS);

    private static ArrayList<Contestant> remainingContestants = new ArrayList<>(TOTAL_CONTESTANTS);

}
