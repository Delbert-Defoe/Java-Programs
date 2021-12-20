/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesorting;

/**
 *
 * @author CheeZee
 */
public class BubbleSort {
    
    void sort(int[] arr){
        int length = arr.length;
        
        for(int i = 0; i < length-1; i++ ){
            for(int x=0; x <length - i - 1; x++){
                if(arr[x] > arr[x+1]){
                    int tempArr = arr[x];
                    arr[x] = arr[x+1];
                    arr[x+1] = tempArr;
                }
            }
        }
        
        printArray(arr);
    }
    
    void printArray(int[] arr){
        int length = arr.length;
        
        for(int x=0; x < length; x++){
            System.out.println(arr[x]+", ");
        }
    }
}
