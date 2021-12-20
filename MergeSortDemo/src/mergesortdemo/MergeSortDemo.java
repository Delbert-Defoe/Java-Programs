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
public class MergeSortDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = {10,3,2,5,8,4,3,2,1,9,7,8};
        
        MergeSort.printArray(array);
        System.out.println();
        
        MergeSort.mergeSort(array, 0, array.length-1);
        MergeSort.printArray(array);
        
    }
    
}
