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
public class SelectionSortDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = {2,6,1,4,9,8};
        
        SelectionSort sort = new SelectionSort();
        
        sort.printArray(array);
        sort.selectionSort(array);
        sort.printArray(array);
        
    }
    
}
