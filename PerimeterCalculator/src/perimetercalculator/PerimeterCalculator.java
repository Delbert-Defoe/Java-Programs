/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimetercalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author CheeZee
 */
public class PerimeterCalculator {

   
    public static void main(String[] args) {
       
       
       Scanner sc = new Scanner(System.in);
       int option;
       String str;
       
   
   try {    
    do{  
        
        System.out.println("Would you like to...");
        System.out.println("------------------------------");
        System.out.println("1. Calculate Area");
        System.out.println("2. Calculate Perimeter");
        System.out.println("3. Quit");
        System.out.println("------------------------------");
        option = sc.nextInt();
    
    switch(option) { 
        
        case 1:
           Perimeter triangle = new Perimeter(1,0,0,0,0,0); 
           System.out.print("Please Enter the base: ");
           double base = sc.nextDouble();
           triangle.setBase(base);
      
           System.out.print("Please Enter the Height: ");
           double height = sc.nextDouble();
           triangle.setHeight(height);
           
           triangle.multiplyArea();
           System.out.println("The Area of your triangle is "+triangle.getArea()+"\n\n");
           break;
      
        case 2:  
           Perimeter triangle2 = new Perimeter(1,0,0,0,0,0);
           
           System.out.print("Please Enter the base: ");
           double base2 = sc.nextDouble();
           triangle2.setBase(base2);
           
           System.out.print("Please Enter the length of Side 1: ");
           double length1 = sc.nextDouble();
           triangle2.setLength1(length1);
      
           System.out.print("Please Enter the length of Side 2: ");
           double length2 = sc.nextDouble();
           triangle2.setLength2(length2);
      
           triangle2.addPerimeter();
      
           System.out.println("The Perimeter of your triangle is "+triangle2.getPerimeter()+"\n\n");
           break;
           
        case 3:
            System.out.println("Goodye!");
            break;
            
        default:
            System.out.println("Invalid Input");
            break;
       
    }
    }while(option != 3);
 
    }catch(Exception ex){
        System.out.println("Error Encountered: "+ex);
    }
    }
    
}
