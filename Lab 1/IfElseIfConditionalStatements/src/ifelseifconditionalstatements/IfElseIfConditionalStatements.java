/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelseifconditionalstatements;

import java.util.Scanner;

/**
 *
 * @author CheeZee (Delbert - 2019081103)
 */
public class IfElseIfConditionalStatements {

    public static void main(String[] args) {
        double price, rate, total;
        int units;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is the unit price of your item? : ");
        price = sc.nextDouble();
        
        System.out.println("How much did you buy? : ");
        units = sc.nextInt();
        
        if(units >= 100 && units <= 120){
            rate = 0.1;
        }
        else if(units > 120){
           rate = 0.15;
        }else{
           rate = 0;
        }
        double discount = price *units *rate;
        total = (price * units) - discount;
        
        
        System.out.println("Price: $"+price+"\nDiscount: "+rate+"% \nTotal: $"+total);
    }
    
}
