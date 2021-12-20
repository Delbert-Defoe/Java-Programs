/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author CheeZee
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your number --> ");
        int number = sc.nextInt();
        
        if(number %2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
        
    }
    
}
