/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddnumbersarraydemo;

/**
 *
 * @author CheeZee, aka Debo, Aka Delbert Defoe, AKa 2019081103
 */
public class OddNumbersArrayDemo {

   
    public static void main(String[] args) {
       int[] numbers = {1,2,3,4,35,24,13,17,18,19,20,24,19,18,21,49};
       
       for(int x=0; x<numbers.length; x++){
           int number = numbers[x];
    
           if(number%2 == 1){
               System.out.println("The number at index "+ x + " is a negative number ("+number+")");
           }
       } 
        
    }
    
}
