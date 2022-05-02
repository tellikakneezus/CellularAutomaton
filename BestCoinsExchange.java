
/**
 * Write a description of class BestCoinsExchange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class BestCoinsExchange
{
    int[][] bestCoinsExchange(int[] coins, int change) {
        int[][] output = new int[coins.length][2];
        Arrays.sort(coins);
        int i = coins.length;
        while(change != 0 && i > 0){
            if(coins[i-1] <= change){ 
                change -= coins[i-1];
                if(output[coins.length-i][0] == coins[i-1]){
                    output[coins.length-i][1]++;
                }else{
                    output[coins.length-i][0] = coins[i-1];
                    output[coins.length-i][1]++;
                }
            } 
            else
            {
                i--;
                System.out.println("change: " + change + " | i: " + i);
            }
        }

        return output;

    }
}
