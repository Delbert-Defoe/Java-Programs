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
public class InsertionSortDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InsertionSort insertionSorter = new InsertionSort();
        
        
        int[] arr = {4,6,5,7,9,2,4,1};
        insertionSorter.insertionSort(arr);
        insertionSorter.printArray(arr);
        
    }
    
}
