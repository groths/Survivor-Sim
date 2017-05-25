package main;

import java.util.ArrayList;

/**
 *
 * @author Rachel, Matt
 */
public class Main {

    private static final int TOTAL_CONTESTANTS = 18;
    
    private static final int FINALE_CONTESTANTS = 3;
    
    private static int day = 0;
    
    private static ArrayList<Contestant> allContestants = new ArrayList<>(TOTAL_CONTESTANTS);
    
    private static ArrayList<Contestant> remainingContestants = new ArrayList<>(TOTAL_CONTESTANTS);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Starting Program");
        System.out.println("Welcome to Surivivor-Sim!");
        
        
        while (remainingContestants.size() > FINALE_CONTESTANTS)
        {
            runDay();
            day++;
        }
        
        
        System.out.println("Ending main method");
    }
        
    /**
     * NOW: 
     * This is a lot but...
     * Create reward challenge method
     * Create immunity challenge method
     * Create tribal council method
     * (We can figure out a system to have these each every few days)
     * 
     * And also just like a general neutral day thing where you get the option
     * to relax/sleep, look for immunity idol, be social, etc.
     * So maybe if the day is a certain multiple we can have the special things
     * like challenges, tribal council, etc. but otherwise not
     * 
     * and maybe eventually we can add a random number generator where if it
     * gets a certain number certain cool/random things happen (like you see an animal or something)
     * 
     * and then we can also incorporate when it gets to a certain day special things happen
     * (such as merge, loved ones visit, auction challenge, etc. any fun things we want to add!)
     */
    private static void runDay()
    {
        
         
    }
    
}
