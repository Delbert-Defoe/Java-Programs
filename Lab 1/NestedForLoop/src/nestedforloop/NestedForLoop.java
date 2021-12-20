/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedforloop;

/**
 *
 * @author CheeZee
 */
public class NestedForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        for(int x=1; x<=5; x++){
            System.out.println();
            for(int y=1; y<=5; y++)
                System.out.print(y*x+" ");
        
        }
            }   
}
