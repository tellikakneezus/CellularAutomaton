
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame
{
    public static void main(String[] args){
        JFrame gameFrame = new JFrame("Cellular Automata");
        JLayeredPane layeredPane = new JLayeredPane();
        int widthOffset = 16;
        int heightOffset = 38;
        int tileSize = 32;

        ArrayList<ArrayList<String>> map;
        Random rand = new Random();
        int mapSize = 31;

        String[] initialRow = new String[mapSize];
        int index = (int)mapSize/2;

        for(int i = 0; i < mapSize; i++){
            if(i == index){
                initialRow[i] = "1";

            }
            else{
                initialRow[i] = "0";
            }
        }

        Automaton mapCreator = new Automaton(0, initialRow, 100);
        map = mapCreator.getMap();
        GameMap mapGUI = new GameMap("blank_tile.gif", "blocked_tile.gif", map);
        gameFrame.add(mapGUI);
        
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setSize((mapSize*tileSize) + widthOffset, (mapSize*tileSize) + heightOffset);
        gameFrame.setVisible(true);
        
        for(int i = 1; i < 256; i++){
            gameFrame.setTitle("Cellular Automata - " + i);
            
            mapCreator = new Automaton(i, initialRow, 100);
            map = mapCreator.getMap();
            mapGUI.createMap(map);
            
              try{
                
                Thread.sleep(400);
                
            }catch(InterruptedException ie){
                
            }
            
        }


        //         for(int i = 0; i < map.size(); i++){
        //             for(int j = 0; j < map.get(i).size(); j++){
        //                 System.out.print(map.get(i).get(j) + " . ");
        //             }
        //             System.out.print("\n");
        //         }

        

     

    }
}
