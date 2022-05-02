
/**
 * Write a description of class SubVsDivide here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SubVsDivide
{
    // instance variables - replace the example below with your own
    private double x = 2745.96;
    private double percent = 0.025;
    
    public SubVsDivide()
    {
        // initialise instance variables
        
    }


    public String calculate()
    {
        double divide = x / (1 + percent);
        double subtract = x - (x * percent);
        
        return String.valueOf(divide) + " " + String.valueOf(subtract);
    }
}
