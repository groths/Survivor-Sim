/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;

/**
 *
 * @author Rachel
 */
public class Contestant {
    
    private String name;
    private int age;
    private int strength;
    private int intelligence;
    private int social;
    private List<Contestant> allies;
    
    public Contestant(String name, int age){
        this.name = name;
        this.age = age;
        allies = null;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void createAlliance(Contestant ally){
        allies.add(ally);
    }
    
}
