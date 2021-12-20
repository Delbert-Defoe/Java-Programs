/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author CheeZee
 */
public class WhileLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double fvalue, cvalue, minValue, maxValue, value;
        
        System.out.println("Hello, Please indicate which conversion you would like performed: ");
        System.out.println("Type '1' for Celcius -> Fahrenheit");
        System.out.println("Type '2' for Fahrenheit -> Celcius: ");
        int option = sc.nextInt();
        
        switch(option) {
            
            case 1:
                System.out.print("Please enter the smallest temperature to convert (C): ");
                minValue = sc.nextDouble();
                System.out.print("\nPlease enter the largest temperature to convert (C): ");
                maxValue = sc.nextDouble();
                
                value = minValue; 
                while(value <= maxValue){
                  cvalue = value;  
                  fvalue = (cvalue * 1.8) + 32;
                  
                  DecimalFormat numformat = new DecimalFormat("#.0");
                  System.out.println(cvalue +" Celcius  -->  "+numformat.format(fvalue)+" Fahrenheit");
                  
                  value++;
                }
             break;
             
            case 2:
                System.out.print("Please enter the smallest temperature to convert (F): ");
                minValue = sc.nextDouble();
                System.out.print("\nPlease enter the largest temperature to convert (F): ");
                maxValue = sc.nextDouble();
                
                value = minValue;
                  
                while(value <= maxValue){
                      
                    fvalue = value;  
                    cvalue = ((fvalue - 32) * 5 )/9;
                  
                    DecimalFormat numformat = new DecimalFormat("#.0");
                    System.out.println(fvalue +" Fahrenheit  -->  "+numformat.format(cvalue)+" Celcius");
                      
                    value++;
                }
        }
       
       
    }
    
}
