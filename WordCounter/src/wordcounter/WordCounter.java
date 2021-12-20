/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcounter;

import java.util.Scanner;

/**
 *
 * @author CheeZee
 */
public class WordCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        String[] words;
        
        words = sentence.split(" ");
         
         System.out.print("Your sentence has "+words.length+" words");
         
         System.out.println("Which word would you like to view(1-"+words.length+") :");
         int word = sc.nextInt();
         
         System.out.println("word "+word+" is: "+words[word-1]);
         
          
        
    }
    
}
