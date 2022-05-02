
/**
 * Write a description of class Tile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class Tile 
{
    // instance variables - replace the example below with your own
    private int xPos;
    private int yPos;
    public int type;
    
 

    

    

    
    
    /**
     * Constructor for objects of class Tile
     */
    public Tile(int x, int y, int t)
    {
        xPos = x;
        yPos = y;
        type = t;
        
    }



   
    
    public int getX(){
        return xPos;
        
    }
    
    public int getY(){
        return yPos;
    }


    
   
}
