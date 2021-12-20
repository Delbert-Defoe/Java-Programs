/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author CheeZee
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {3,6,9,2,1,89,76,34,56,12,9,13};
        int length = numbers.length;
        
        System.out.print("Input: ");
        for(int i=0; i<length; i++){
            System.out.print(numbers[i]+", ");  
        }
        
        System.out.println();
        
           for(int y = 0; y < length; y++)                
              for(int x = 0; x < length - y - 1; x++){
         
          int current= length -1-x;
          int last = length -2-x;
         
          int temp = numbers[current];
          numbers[current] = numbers[last];
          numbers[last] = temp;    
      }
    
       
        
        System.out.print("Reversed: ");
         for(int i=0; i<length; i++){
            System.out.print(numbers[i]+", ");
        }
        
       for(int x=0; x<length; x++){ 
         for(int i=0; i<length; i++){
            
            if(i == numbers.length - 1){
                break;
            } else {  
                 int currentNum = numbers[i];
                 int nextNum = numbers[i+1];
         
                 if(nextNum < currentNum){
                    numbers[i] = nextNum;
                    numbers[i+1] = currentNum;
                 }
            }
          }
        }  
       
        System.out.println();
        System.out.print("Sorted Ascending: ");       
        for(int i=0; i<length; i++){
            //System.out.println(numbers.length-1);
            System.out.print(numbers[i]+", ");
        }
        
         for(int x=0; x<length; x++){ 
         for(int i=0; i<length; i++){
            
            if(i == numbers.length - 1){
                break;
            } else {  
                 int currentNum = numbers[i];
                 int nextNum = numbers[i+1];
         
                 if(nextNum > currentNum){
                    numbers[i] = nextNum;
                    numbers[i+1] = currentNum;
                 }
            }
          }
        }  
         
         System.out.println();
          System.out.print("Sorted Descending: ");       
        for(int i=0; i<length; i++){
            //System.out.println(numbers.length-1);
            System.out.print(numbers[i]+", ");
        }
    
        
    }
    }
    

