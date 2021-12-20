/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverterforloop;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author CheeZee
 */
public class TemperatureConverterForLoop {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        double fvalue, cvalue, minValue, maxValue;
        
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
                
                for(double x = minValue; x <= maxValue; x++){
                  cvalue = x;  
                  fvalue = (cvalue * 1.8) + 32;
                  
                  DecimalFormat numformat = new DecimalFormat("#.0");
                  System.out.println(cvalue +" Celcius  -->  "+numformat.format(fvalue)+" Fahrenheit");
                }
             break;
             
            case 2:
                System.out.print("Please enter the smallest temperature to convert (F): ");
                minValue = sc.nextDouble();
                System.out.print("\nPlease enter the largest temperature to convert (F): ");
                maxValue = sc.nextDouble();
                
                for(double x = minValue; x <= maxValue; x++){
                  fvalue = x;  
                  cvalue = ((fvalue - 32) * 5 )/9;
                  
                  DecimalFormat numformat = new DecimalFormat("#.0");
                  System.out.println(fvalue +" Fahrenheit  -->  "+numformat.format(cvalue)+" Celcius");
                }
        }
        
    }
    
}
