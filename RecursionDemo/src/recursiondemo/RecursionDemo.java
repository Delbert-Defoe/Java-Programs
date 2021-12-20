/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursiondemo;

/**
 *
 * @author CheeZee
 */
public class RecursionDemo {
    
    static int factorial(int num){
        if(num!=0){ 
           return num*factorial(num-1);
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        
       int num  = 40;
       int result = factorial(num);
       
       System.out.println(result);
       
    }
    
    
    
}
