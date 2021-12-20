/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filewriterdemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author CheeZee
 */
public class FileWriterDemo {

 
    public static void main(String[] args) {
         BufferedWriter bw = null;
         
       try{
         String content = "Computer Science 2 as taught by Fayola St.Bernard";
         
         File file = new File("writing.txt");
         
         if(!file.exists()){
             file.createNewFile();
         }
         
         FileWriter fw = new FileWriter(file, true);
         bw = new BufferedWriter(fw);
         
         bw.write(content);
        
           
       }catch(Exception e){
        System.out.println("The error is: "+e);
       } finally {
           try{
               if(bw!=null){
                   bw.flush();
                   bw.close();
               }
           }catch(Exception e){
               System.out.println("Error in closing: "+e);
                }
           }
       System.out.println("Succesful run");
       }

       
       
    }
   
