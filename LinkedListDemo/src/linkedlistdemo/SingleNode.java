/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdemo;


public class SingleNode {
  
private int value;
private SingleNode next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public SingleNode getNext(){
        return next;
    }
    
    public void setNext(SingleNode next){
        this.next = next;
    }
    
@Override
     public String toString(){
        return value + "";
    }


}
