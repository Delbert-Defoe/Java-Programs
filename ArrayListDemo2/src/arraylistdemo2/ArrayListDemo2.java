/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author CheeZee
 */
public class ArrayListDemo2 {

  
    public static void main(String[] args) {
       
        ArrayList<Player> players = new ArrayList();
                
      try{
        BufferedReader br = new BufferedReader(new FileReader("teamsheet.txt"));

         
       String fileData = br.readLine();
       
       while(fileData != null){
           String[] token = fileData.split(",");
           
           
           int shirtNumber = Integer.parseInt(token[0]);
           String name = token[1];
           int number = Integer.parseInt(token[2]);

           Player obj = new Player(number, shirtNumber, name);
           players.add(obj);
           
           fileData = br.readLine();
            
               
       }
       br.close();
       
      }catch (Exception e){
          System.out.print("Error encountered: "+e);
      }
      
      
      for(Player record: players){
          System.out.println("----------------------");
          System.out.println(record+"\n");
      }
    }
    
}
