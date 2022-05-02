
/**
 * Write a description of class Automaton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//import java.util.ArrayList;
import java.util.*;

public class Automaton
{
    ArrayList<ArrayList<String>> map = new ArrayList<ArrayList<String>>();
    String[] rules = new String[8];
    public Automaton(int ruleNumber, String[] initialRow, int depth){
        initMap(ruleNumber, initialRow, depth);
    }

    private void initMap(int ruleNumber, String[] initialRow, int depth){
        if(ruleNumber < 256){
            String[] newRow = initialRow;
            
            map.add(new ArrayList<String>(Arrays.asList(newRow)));

            String ruleNumberBin = String.format("%8s", Integer.toBinaryString(ruleNumber)).replace(' ', '0');//Integer.toBinaryString(ruleNumber);
            


            for(int i = 0; i< 8; i++){
                String tempString = Integer.toBinaryString(i);
                
                if(tempString.length() < 3){
                    for(int n = 0; n <= (3-tempString.length()); n++){
                        String leadZeroString = "0" + tempString;
                        tempString = leadZeroString;
                    }
                }
                for(int j = 0; j < 3; j++){
                    if(rules[i] == null){
                        rules[i] = String.valueOf(tempString.charAt(j));
                    }else{
                        rules[i] = rules[i] + String.valueOf(tempString.charAt(j));
                    }
                }
            }

            for(int i = 0; i < depth; i++){
                
                String[] tempRow = new String[initialRow.length]; 
                
                int n = 0;
                while(n < (newRow.length + 2)){
                    
                    String arrayCheckPoint = ""; 

                    for(int j = 0; j < 3; j++){

                        if(n < newRow.length-2){
                            arrayCheckPoint = arrayCheckPoint + newRow[n + j];

                        }else{
                            if((n + j) > newRow.length - 1){
                                arrayCheckPoint = arrayCheckPoint + newRow[(n+j) - (newRow.length)];
                            }else{
                                arrayCheckPoint = arrayCheckPoint + newRow[n + j];
                            }

                        }

                    }

                    n++;

                    if(n < newRow.length){
                        //newRow[n] = String.valueOf(ruleNumberBin.charAt(Arrays.asList(rules).indexOf(arrayCheckPoint-1)));
                        int index = Arrays.asList(rules).indexOf(arrayCheckPoint); 
                        String foundString = String.valueOf(ruleNumberBin.charAt(7 - index)); 
                        tempRow[n] = foundString;
                    }else{
                        int index = Arrays.asList(rules).indexOf(arrayCheckPoint); 
                        String foundString = String.valueOf(ruleNumberBin.charAt(7 - index)); 
                        int overIndexN = n - newRow.length;
                        tempRow[overIndexN] = foundString;
                    }

                }
                
                map.add(new ArrayList<String>(Arrays.asList(tempRow)));
                newRow = tempRow;
            }

            
        }else{
            ArrayList<String> warningMessage = new ArrayList<String>();
            warningMessage.add("Number must be below 256");
            map.add(warningMessage);
        }
    }

    public ArrayList<ArrayList<String>> getMap(){
        return map;
    }

}


//             if(ruleNumberBin.length() < 7){
//                 for(int i = 0; i <= (10 - (ruleNumberBin.length()- 1)) ; i++){
//                     String leadZeroString = "0" + ruleNumberBin;
//                     ruleNumberBin = leadZeroString;
//                 }
//             }