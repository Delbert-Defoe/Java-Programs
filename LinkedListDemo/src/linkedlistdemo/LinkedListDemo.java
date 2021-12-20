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
public class LinkedListDemo {

    
    public static void main(String[] args) {
      LinkedList list = new LinkedList();
      
      list.createLinkedList(5);
      list.insertLinkedList(10, 1);
      list.insertLinkedList(20, 2);
      list.insertLinkedList(30, 3);
      list.insertLinkedList(40, 4);
      list.insertLinkedList(100, 5);
      
      
      
      list.traverseLinkedList();
      list.reverseList();
    //  list.traverseLinkedList();
      
      LinkedList list2 = new LinkedList();
      
      list2.traverseLinkedList();
      list.deleteNode(3);
      System.out.println(list.getSize());
            list2.traverseLinkedList();
      
      list.searchNode(30);
    
     
     StackByLinkedList stack = new StackByLinkedList();
     
     
     //push items into stack
     for(int x = 0; x <=10; x++){
         stack.push(x*10);
     }
      
     System.out.println(stack.peek());
     
     System.out.println();
     
     stack.pop();
     System.out.println(stack.peek());
      
    }
    
}
