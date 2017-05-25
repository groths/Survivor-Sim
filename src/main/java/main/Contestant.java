package main;

import java.util.ArrayList;

/**
 * NOW create a tribe class
 * @author Rachel, Matt
 */
public class Contestant {
    
    private final String NAME;
    
    /**
     * TODO add birthdays
     */
    private final int AGE;
    
    private int strength;
    private int intelligence;
    private int charisma;
    
    // NOW create getAllies method. Keep in mind that it is bad to return the actual allies class
    // because then it can be changed from outside this class (never a good idea to return a private arraylist)
    // INSTEAD one thing you could do is return a clone of the arraylist, which I think is more safe
    private final ArrayList<Contestant> allies = new ArrayList<>();
    
    public Contestant(String name, int age){
        this.NAME = name;
        this.AGE = age;
        // NOW figure out how strength,intelligence,andcharisma are initialized (I recommed the Random class)
    }
    
    public String getName(){
        return NAME;
    }
    
    public int getAge(){
        return AGE;
    }
    
    /**
     * QUESTION since this is non-static, is this method called for both constestants in the alliance? Would there ever be a case where createAlliance is only called for one contestant, or is it always called for both?
     * @param ally
     */
    public void createAlliance(Contestant ally){
        allies.add(ally);
    }
    
}
