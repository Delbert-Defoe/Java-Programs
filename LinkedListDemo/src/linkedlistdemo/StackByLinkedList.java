/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdemo;

/**
 *
 * @author CheeZee
 */
public class StackByLinkedList {
    LinkedList list;
    
    public StackByLinkedList(){
        list = new LinkedList();
    }
    
    //Push
    public void push(int value){
        if(list.getHead()==null){
            list.createLinkedList(value);
        }else {
            list.insertLinkedList(value, 0);
        }
        System.out.println("Inserted "+ value + " In Stack");
    }
    
    public int pop() {
        int value = -1;
        
        if(isEmpty()){
            System.out.println("Stack Underflow!");
        } else {
            value = list.getHead().getValue();
            list.deleteNode(0);
        }
        return value;
    }
    
    public int peek(){
        if(!isEmpty()){
            return list.getHead().getValue();
        }else{
            System.out.println("This Stack is empty");
            return -1;
        }
    }
    
    public void deleteStack(){
        list.setHead(null);
    }
    
    public boolean isEmpty(){
        if(list.getHead() == null){
            return true;
        }else {
            return false;
        }
    }
}
