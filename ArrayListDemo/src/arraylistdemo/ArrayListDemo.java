/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.ArrayList;

/**
 *
 * @author CheeZee
 */
public class ArrayListDemo {

   
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();
        
        System.out.println("Initial size of Array: "+al.size());
        
        al.add("Delbert");
        al.add(0,"Ryan");
        al.add("Defoe");
        
        System.out.println("Final size of Array: "+al.size());
        
        for(int x = 0; x<al.size(); x++){
            System.out.println("Index ("+x+") = "+al.get(x));
        }
        
        al.remove(0);
        al.remove("Defoe");
    }
    
}
