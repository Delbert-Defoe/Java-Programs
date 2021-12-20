/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhileloop;

import java.util.Scanner;

/**
 *
 * @author CheeZee
 */
public class DoWhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option = 0;
        Scanner sc = new Scanner(System.in);   
        do {
           
            System.out.println("Enter the number corresponding to an option: \n1.Adding Appointment \n2.Viewing Appointment \n3.Exit");
            option = sc.nextInt();
            
            switch(option){
                case 1:
                    System.out.println("Adding Appointment");
                    break;
                
                case 2:
                    System.out.println("Viewing Appointment");
                    break;
                    
                case 3:
                    break;
                    
                default:
                    System.out.println("Invalid Option");
                    break;
            }
            
        }while(option != 3);
    }
    
}
