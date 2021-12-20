/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverter;

import java.util.Scanner;

/**
 *
 * @author CheeZee
 */
public class TemperatureConverter {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double fvalue, cvalue;
        
        System.out.println("Hello, Please indicate which conversion you would like performed: ");
        System.out.println("Type '1' for Celcius -> Fahrenheit");
        System.out.println("Type '2' for Fahrenheit -> Celcius: ");
        int option = sc.nextInt();
        
        switch(option) {
            
            case 1:
                System.out.print("Please enter a temperature in celcius: ");
                cvalue = sc.nextDouble();
                fvalue = (cvalue * 1.8 + 32);
                System.out.println("\nThe temperature you entered is " + fvalue + " in fahrenheit");
             break;
             
            case 2:
                System.out.print("Please enter a temperature in fahrenheit: ");
                fvalue = sc.nextDouble();
                cvalue = ((fvalue - 32) * 5)/9;
                System.out.println("\nThe temperature you entered is " + cvalue + " in celcius");
        }
        
        
        
        
       
    }
    
}
