
/**
 * Write a description of class ReplaceSpace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReplaceSpace
{
    // instance variables - replace the example below with your own
    private String str;

    /**
     * Constructor for objects of class ReplaceSpace
     */
    public ReplaceSpace(String str)
    {
        // initialise instance variables
        this.str = str;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String replaceStr()
    {
        // put your code here
        str.replaceAll(",", " ");
        
        return str;
    }
}
