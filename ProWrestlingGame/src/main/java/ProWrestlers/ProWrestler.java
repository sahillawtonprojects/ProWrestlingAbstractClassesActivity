package ProWrestlers;

//We have to use the keyword "abstract" to declare a class an abstract class
public abstract class ProWrestler {
    
    private String wrestlerName;
    private int wrestlerOverallStrength;
    
    //This is the constructor. For more information about constructors, please watch
    //my video on constructors
    public ProWrestler(String wrestlerName, int wrestlerOverallStrength){
        this.wrestlerName = wrestlerName;
        this.wrestlerOverallStrength = wrestlerOverallStrength;
    }
    
    public void punch(){
        //The code for how a wrestler would punch in the game
        //to save time, we will just print out the action that has occurred
        System.out.println(wrestlerName + " has punched");
    }
    
    public void kick(){
        System.out.println(wrestlerName + " has kicked");
    }
    
    public void grapple(){
        System.out.println(wrestlerName + " is grappling");
    }
    

    public abstract void signatureMove();
    
    
    public String getWrestlerName(){
        return this.wrestlerName;
    }
    
    public void setWrestlerName(String wrestlerName){
        this.wrestlerName = wrestlerName;
    }
    
    public int getWrestlerOverallStrength(){
        return this.wrestlerOverallStrength;
    }
    
    public void setWrestlerOverallStrength(int wrestlerOverallStrength){
     this.wrestlerOverallStrength = wrestlerOverallStrength;    
    }
    
    //Create a toString method here
    //The toString method should print '"wrestlerName" has an overall strength of "wrestlerOverallStrength"' 
    //This method needs to override the object classes method
    
    
    //Create an equals() method here that takes in an argument
    //of a ProWrestler object ie equals(ProWrestler){}
    //and checks if the wrestlers name and overall strength are equal
    //If they are both equal, return true
    
   
}
