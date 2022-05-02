
/**
 * Write a description of class PaymentHistory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DaysOfWeek
{

    int currentDay;
    int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[] dayNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    int[] daysIntValue(String[] daysOfTheWeek){
        int[] daysIntValue = new int[daysOfTheWeek.length];

        for(int i = 0; i < daysOfTheWeek.length; i++){
            for(int j = 0; j < dayNames.length; j++){
                if(daysOfTheWeek[i] == dayNames[j]){
                    daysIntValue[i] = j;
                }
            }
        }

        return daysIntValue;

    }

}
