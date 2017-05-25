package main;

import java.util.Random;
import java.util.HashMap;
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
    
    private final HashMap<Contestant, Integer> relationships = new HashMap<>(Main.getTotalContestants() - 1);
    
    
    public Contestant(String name, int age){
        this.NAME = name;
        this.AGE = age;
        
        Random rand = new Random(); 
        this.strength = rand.nextInt(11);
        this.intelligence = rand.nextInt(11);
        this.charisma = rand.nextInt(11);
        
        ArrayList<Contestant> allContestants = Main.getAllContestants();
        
        //Initialize each relationship as 0
        for(int i = 0; i < relationships.size(); i++){
            relationships.put(allContestants.get(i), 0);
        }
        
    }
    
    public String getName(){
        return NAME;
    }
    
    public int getAge(){
        return AGE;
    }

    /**
     * for the add/subtract methods, I was thinking we could do something where
     * it gets really bad if one of their stats becomes negative?
     * (Like they get sick if their strength is low, they start screaming at everyone if their charisma is low)
     * But then that could happen really fast if people have a low stat to begin with
     * 
     * ALSO i wasn't sure if maybe we should make it so their age has to do with their strength level
     * (like generally maybe older people are weaker. but that isn't always true so idk)
     */
    public void addStrength(){
        strength ++;
    }
    
    public void subtractStrength(){
        strength --;
    }
    
    public void addIntelligence(){
        intelligence ++;
    }
    
    public void subtractIntelligence(){
        intelligence --;
    }
    
    public void addCharisma(){
        charisma ++;
    }
    
    public void subtractCharisma(){
        charisma --;
    }
    
    public void improveRelationship(Contestant other){
        relationships.put(other, relationships.get(other) + 1);
    }
    
    public void worsenRelationship(Contestant other){
        relationships.put(other, relationships.get(other) - 1);
    }
}
