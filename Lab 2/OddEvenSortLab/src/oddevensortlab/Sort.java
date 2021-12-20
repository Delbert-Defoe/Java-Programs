/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddevensortlab;

/**
 *
 * @author CheeZee
 */
public class Sort {
    
    public static void sort(int[] arr, int type){
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(type % 2==0){
                   if( arr[j+1]%2==0 && arr[j+1] < arr[j] || arr[j+1]%2==0 && arr[j]%2==1){
                       int temp = arr[j];
                       arr[j] = arr[j+1];
                       arr[j+1] = temp;
                   }
                } else {
                  if( arr[j+1]%2==1 && arr[j+1] < arr[j] || arr[j+1]%2==1 && arr[j]%2 == 0){
                      int temp = arr[j];
                      arr[j] = arr [j+1];
                      arr[j+1] = temp;
                  }  
                }
            }
        }
    }
    
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+", ");  
        }
        //System.out.println();
    }
}
