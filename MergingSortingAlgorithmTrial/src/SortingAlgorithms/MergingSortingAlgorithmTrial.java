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
public class MergingSortingAlgorithmTrial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = {3,6,4,1,7,3,8,2,9,0,21,0,12,34,56,75};
        
        MergeSort sorter = new MergeSort();
        
        sorter.printArray(array);
        sorter.sort(array, 0, array.length-1);
        sorter.printArray(array);
    }
    
}
