/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddevensortlab;

import java.util.Scanner;

/**
 *
 * @author CheeZee
 */
public class OddEvenSortLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {3,8,69,79,12,13,17,1,4,6,9,5,22,54,78,66,31,45,29};
        Sort sorter = new Sort();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("The given array is [");
        sorter.printArray(arr);
        System.out.print("]");
        
        System.out.println();
        System.out.print("Please enter an Even number if you want to sort the Even numbers,\nand an Odd number if you want to sort Odd numbers: ");
        int type = sc.nextInt();
       
        sorter.sort(arr, type);
        
        if(type%2 == 0){
            System.out.print("With the (Even) numbers sorted, the Array is now: [");
            sorter.printArray(arr);
            System.out.print("]");
        }
        
         if(type%2 == 1){
            System.out.print("With the (Odd) numbers sorted, the Array is now: [");
            sorter.printArray(arr);
            System.out.print("]");
        }
        
        
    }
    
}
