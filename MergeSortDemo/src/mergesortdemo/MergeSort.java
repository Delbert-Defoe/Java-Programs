/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortdemo;

/**
 *
 * @author CheeZee
 */
public class MergeSort {
    
    static void mergeSort(int[] array, int left, int right){
        if(left<right){            
            int m = (left+right)/2;
        //merge sort left hand of code (recursively)    
            mergeSort(array, left, m);
        //merge sort right hand of code (recursively)    
            mergeSort(array, m+1, right);
        //merge array    
            merge(array, left, m, right);
        }
    }
    
    static void merge(int[] arr, int left, int middle, int right){
      try{
    /**********Make two new arrays*******/      
        int n1 = middle - left + 1; //The size of the left Array
        int n2 = right - middle; // The Size of the right Array

        
        int[] leftTempArray = new int[n1];
        int[] rightTempArray = new int[n2];
        
    /***Populate the two Arrays by assigning the variables before the middle to left, and after the middle to right ***/    
        for(int i=0; i < n1; i++){
            leftTempArray[i] = arr[left+i];
        }
        for (int i = 0; i < n2; i++) {
            rightTempArray[i] = arr[middle+1+i];  
        }

    /***rejoining the arrays**/    
        int i= 0, j=0; //initializing the arrays of the left(i) and right(j) arrays
        int k = 1; //initializing the index of the merged subarray
        
       
        while(i < n1 && j < n2){
            if(leftTempArray[i] <= rightTempArray[j]){
                arr[k] = leftTempArray[i]; 
                i++;
            } else {
                arr[k] = rightTempArray[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = leftTempArray[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = rightTempArray[j];
            j++;
            k++;
        }
        
        
        
      }catch(Exception e){
          System.out.println("Error in merge(): "+e.toString());
      }
    }
    
    public static void printArray(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
