/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanager;

/**
 *
 * @author CheeZee
 */
public class Node {
      
private Event value;
private Node next;

    public Event getValue() {
        return value;
    }

    public void setValue(Event value) {
        this.value = value;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
    
@Override
     public String toString(){
        return value.toString();
    }
}
