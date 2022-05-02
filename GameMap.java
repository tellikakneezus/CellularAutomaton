/**
 * Write a description of class Map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

import javax.imageio.ImageIO;
import java.io.File;

import java.util.Random;
import java.util.*;

import java.io.IOException;

public class GameMap extends JPanel
{
    private BufferedImage open_tile;
    private BufferedImage closed_tile;

    private BufferedImage[][] mapGUI;
    
    public Tile[][] mapTiles;
    
    int mapSizeX;
    int mapSizeY;

    private Random rand = new Random();

    public GameMap(String openTileFP, String closedTileFP, ArrayList<ArrayList<String>> mapKey){
        try{
            open_tile = ImageIO.read(new File(openTileFP));
            closed_tile = ImageIO.read(new File(closedTileFP));
        }catch(IOException ex){
            System.out.println("File not found");
        }

        mapSizeX = mapKey.get(0).size();
        mapSizeY = mapKey.size();
        initMap();
        createMap(mapKey);
        //mapGUI = new BufferedImage[mapSize][mapSize];

        repaint();
    }
    
    private void initMap(){
        
        mapTiles = new Tile[mapSizeX][mapSizeY];
        
        for(int i = 0; i < mapSizeX; i++){
            for(int j = 0; j < mapSizeY; j++){
                mapTiles[i][j] = new Tile(i,j,0);
                
                
            }
            
        }
    }

    public void createMap(ArrayList<ArrayList<String>> mapKey){

        
        for(int i = 0; i <mapKey.size(); i++){
            for(int j = 0; j < mapKey.get(i).size(); j++){
                if(mapKey.get(i).get(j).equalsIgnoreCase("1")){
                    mapTiles[j][i].type = 1;
                }else{
                    mapTiles[j][i].type = 0;
                }
            }
        }

        repaint();
    }
    
    
    public void setTileType(int x, int y, int type){
        mapTiles[x][y].type = type;
    }

    public void mapChanged(){
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int offset = 32;
        for(int x = 0; x < mapSizeX; x++){
            for(int y = 0; y < mapSizeY; y++){
                switch(mapTiles[x][y].type){
                    case 0: g.drawImage(open_tile,x*offset,y*offset,null);
                    break;
                    case 1: g.drawImage(closed_tile,x*offset,y*offset,null);
                    break;
                    //                     case 2: g.drawImage(current_tile,x*offset,y*offset,null);
                    //                     break;
                    //                     case 3: g.drawImage(past_tile,x*offset,y*offset,null);
                    //                     break;
                    //                     case 4: g.drawImage(goal_tile,x*offset,y*offset,null);
                    

                }

            }
        }
    }
}