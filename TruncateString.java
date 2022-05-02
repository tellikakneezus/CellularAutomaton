
/**
 * Write a description of class TruncateString here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TruncateString
{
    String truncateString(String s) {

        if(Character.getNumericValue(s.charAt(0))%3 == 0){
            truncateString(s.substring(1));
        }else if(Character.getNumericValue(s.charAt(s.length()-1))%3 == 0){
            truncateString(s.substring(0,s.length()-1));
        }else if((Character.getNumericValue(s.charAt(s.length()-1))+Character.getNumericValue(s.charAt(0)))%3 == 0){
            truncateString(s.substring(1,s.length()-1));
        }

        return s;

    }
}
