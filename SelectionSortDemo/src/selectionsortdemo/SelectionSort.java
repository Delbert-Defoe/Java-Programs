/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsortdemo;

/**
 *
 * @author CheeZee
 */
public class SelectionSort {
    
    public static void selectionSort(int[] arr){
        for (int j = 0; j < arr.length; j++) {
            int minIndex = j;
            
            for (int i = j + 1; i < arr.length; i++) {
              if (arr[i] < arr[minIndex]) {
                  minIndex = i;
              }
            }
            if (minIndex != j) {
                int temp = arr[j];
                arr[j] = arr[minIndex];
                arr[minIndex] = temp;   
            }
        }
    }
    
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
