/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgorithms;

/**
 *
 * @author CheeZee
 */
public class MergeSort {
    
    public static void sort(int[] array, int left, int right){
        if(left < right){
            int mid = (left + right)/2;
 
            sort(array, left, mid); //Sort the left Side
            sort(array, mid+1, right);  //Sort the right side
            merge(array, left, mid, right); //Merge two arrays
        }
    }
    
    public static void merge(int[] array, int left ,int mid, int right){
        int lSize = mid - left + 1; // initializing the size of the new arrays
        int rSize = right - mid;
        
        //initializing the new arrays with the given sizes
        int[] leftArray = new int[lSize]; 
        int[] rightArray =  new int[rSize];
        
        for (int i = 0; i < lSize; ++i) {
           leftArray[i]  = array[1+i];
        }
        
        for (int i = 0; i < rSize; ++i) {
           rightArray[i] = array[mid + 1 + i];
        }
        
        //initialize the indices of the two new Arrays, and the main Array
        int i=0, j=0, k=0;
        
        //Join the two Arrays back together
        while(i < lSize && j < rSize ){
            if(leftArray[i] <= rightArray[j]){
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i<lSize){
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<rSize){
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
    
    public static void printArray(int[] array){
        
        System.out.println("Array of Size ["+array.length+"] :");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println();
        
    }
}
