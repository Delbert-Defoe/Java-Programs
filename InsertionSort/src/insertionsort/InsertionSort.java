/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author CheeZee
 */
public class InsertionSort {
    
     static void insertionSort(int[] arr){
        for(int x=1; x < arr.length; x++){
            int temp = arr[x], j=x;
            
            while(j>0 && arr[j-1] > temp){
               arr[j] = arr[j-1];
               j--;
            }
            
            arr[j] = temp;
        }
    }
    
    public static void printArray(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print((arr[i] + ", "));
        }
    }
}
