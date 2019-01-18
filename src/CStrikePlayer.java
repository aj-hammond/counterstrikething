/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajman
 * 
 * AJ Hammond
 * 9/17/18
 * PA 2
 * 
 * 
 * 
 * Displays a Counter-Strike player's name, what team he plays on, 
 * current ADR, frags & deaths in the latest game (Stats taken from HLTV)
 * Doubles used for frags / deaths in order to correctly calculate frag/death ratio
 */



//start of class
public class CStrikePlayer {
    
    private String name;
    private String team;
    private Double adr;
    private Double frags;
    private Double deaths;
           
    
    
    
    
    
   public CStrikePlayer (String n, String t, Double a, Double f, Double d) {
    
    name = n;
    team = t;
    adr = a;
    frags = f;
    deaths = d;
    
    
} 
    //toString
   
   
   public String toString(){
       String answer;
       
       answer = name + " is a Counter-Strike player for " + team + ", "
              + "and in his latest match he had " + frags + " frags, " + deaths
              + " deaths, and an ADR of " + adr;
    
            
       return answer;
       
   }//end of tostring
   
   
   //getters
   
   public String getName(){
       
       return name;
       
   }
   
   public String getTeam(){
       
       return team;
       
   }
   
   
   public Double getADR(){
       
       return adr;
       
   }
   
   public Double getFrags(){
       
       return frags;
       
   }
   
   public Double getDeaths(){
    
       return deaths;
   }
       
   
   
   
   //setters
   
   
   public void setName(String n){
       
       name = n;
       
   }


   
   public void setTeam(String t){
       
       team = t;
       
   }

   
   public void setADR(Double a){
       
       adr = a;
       
   }
   
   public void setFrags(Double f){
       
       frags = f;
       
   }
   
   
   public void setDeaths(Double d){
       
       deaths = d;
       
   }
   
}//end of class
