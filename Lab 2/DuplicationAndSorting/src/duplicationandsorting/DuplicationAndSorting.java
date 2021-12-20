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
public class DuplicationAndSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InsertionSorter sorter = new InsertionSorter();
        
        int[] arr = {2,5,8,2,2,4,3,7,6,7,9};
        sorter.printArray(arr);
        sorter.sortAndRemove(arr);
        //sorter.printArray(arr);
    }
    
}
