
package main;

import java.util.ArrayList;
/**
 *
 * @author Rachel
 */
public class Tribe {
    
    private ArrayList<Contestant> tribe = new ArrayList<>();
    private String tribeName;
    
    public Tribe(String name){
        this.tribeName = name;
    }
    
    public String getName(){
        return tribeName;
    }
    
}
