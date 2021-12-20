/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicationandsorting;

/**
 *
 * @author CheeZee
 */
public class InsertionSorter {
    
    public static void sortAndRemove(int[] arr){
        //Initializing a variable which will keep track of the amount of duplicates
        int dups = 0;
        //nested for loop will run through array numerous times comparing one index to the rest of the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                //to prevent Array out of bounds, ensuring that j stays within the index
                //actual comparison      
                if(arr[i]==arr[j]){
                    arr[i] = -1;
                    dups++;
                }
            }
        }
        //This is the insertion sort itself, after the array has been scanned for duplicates    
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i], j = i;
            
            while(j > 0 && arr[j-1] > temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    
    //new array that will have the size of the duplicates removed    
        int newArraysize = arr.length - dups;
        int[] newArray = new int[newArraysize];
        int counter = 0;
        
        for(int x = dups; x < arr.length; x++){
          newArray[counter] = arr[x];
          counter++;
        }
        
        printArray(newArray);
    }
    
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +", ");
        }  
        System.out.println();
    }
}
