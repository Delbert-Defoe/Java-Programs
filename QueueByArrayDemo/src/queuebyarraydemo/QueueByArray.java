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
public class QueueByArray {
    int[] arr;
    int topOfQueue, beginningOfQueue;
    
    public QueueByArray(int size){
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue =-1;
        System.out.println("Created an empty array!");
    }
    
    public void enQueue(int value){
        if(isQueueFull()){
            System.out.println("Queue overflow!");
        } else if(isQueueEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted value " + value);
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted value " + value);
        }
        printQueue();
    }
    
    public void printQueue(){
        if(!isQueueEmpty()){
            System.out.println("Queue....");
            
            for(int x = beginningOfQueue; x <= topOfQueue; x++){
                System.out.print(arr[x] + " -> ");
            }
            System.out.println();
        }else {
            System.out.println("Queue is empty");
        }
    }
    
    public void deQueue(){
        if(isQueueEmpty()){
            System.out.println("Queue underflow");
        } else {
            beginningOfQueue++;
            if(beginningOfQueue > topOfQueue){ //If last element is dequeued 
                beginningOfQueue = topOfQueue = -1;
            }
        }
        printQueue();
        System.out.println();
    }
      public void peek(){
        if(isQueueEmpty()){
            System.out.println("Queue underflow");
        } else {
          System.out.println(arr[beginningOfQueue]);
        }
        //printQueue();
        System.out.println();
    }
    
    public boolean isQueueFull() {
        if(topOfQueue == arr.length -1)
            return true;
        else
           return false; 
    }
    
     public boolean isQueueEmpty() {
        if((beginningOfQueue == -1) || (beginningOfQueue == arr.length))
            return true;
        else
           return false; 
    }
     
     public void peekOperation(){
         if (!isQueueEmpty()){
             System.out.println(arr[beginningOfQueue]);
         }
         else{
             System.out.println("The queue is empty!");
         }
         
     }
     
     public void deleteQueue(){
         arr = null;
         System.out.println("Queue is deleted");
     }
}
