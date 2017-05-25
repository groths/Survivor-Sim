package main;

import java.util.ArrayList;

/**
 *
 * @author Rachel, Matt
 */
public class Main {

    private static final int TOTAL_CONTESTANTS = 18;
    
    private static final int FINALE_CONTESTANTS = 18;
    
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
        
    private static void runDay()
    {
        
    }
    
}
