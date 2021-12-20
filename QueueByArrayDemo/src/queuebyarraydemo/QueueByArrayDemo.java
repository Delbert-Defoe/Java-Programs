/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuebyarraydemo;

/**
 *
 * @author CheeZee
 */
public class QueueByArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueByArray que = new QueueByArray(10);
        
        for(int x=0; x<10; x++){
            que.enQueue(x*10);
        }
        System.out.println();
        que.peek();
        
        que.peekOperation();
        que.deQueue();
        que.peek();
        
        
    }
    
}
