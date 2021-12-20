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
public class LinkedList {

    private SingleNode head;
    private SingleNode tail;
    private int size, value;

    public SingleNode createLinkedList(int nodeValue) {
        head = new SingleNode();

        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        node.setNext(null);

        head = node;
        tail = node;
        size = 1;

        return head;
    }

    //Accessors and mutators
    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode node) {
        this.head = node;
    }

    public SingleNode getTail() {
        return tail;
    }

    public void setTail(SingleNode tail) {
        this.tail = tail;
    }

    /* 
    public void setValue(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
     */
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /*
    If the head is null this function will return true otherewise false
     */
    public boolean existsLinkedList() {
        return head != null;
    }

    //inserting into linked list
    public void insertLinkedList(int value, int location) {
        SingleNode node = new SingleNode();
        node.setValue(value);

        if (!existsLinkedList()) {
            System.out.println("This linked lis does not exist");
            return;
        } else if (location == 0) {
            node.setNext(head);
            head = node;

        } else if (location >= size) {
            node.setNext(null);
            tail.setNext(node);
            tail = node;
        } else {
            SingleNode tempNode = head;
            int index = 0;

            while (index < location - 1) {
                tempNode = tempNode.getNext();
            }

            SingleNode nextNode = tempNode.getNext(); // The node after the new node

            tempNode.setNext(node);
            node.setNext(nextNode);
        }

        setSize(getSize() + 1);
    }

    //Iterating through a inked list
    void traverseLinkedList() {
        if (existsLinkedList()) {
            SingleNode tempNode = head;

            for (int i = 0; i < getSize(); i++) {
                System.out.println(tempNode.getValue());

                if (1 != getSize() - 1) {
                    System.out.println("->");
                }
                tempNode = tempNode.getNext();
            }
        } else {
            System.out.println("Linked list does not exist");
        }
        System.out.println("\n");

    }

    boolean searchNode(int nodeValue) {
        if (existsLinkedList()) {
            SingleNode tempNode = head;

            for (int x = 0; x < getSize(); x++) {
                if (tempNode.getValue() == nodeValue) {
                    System.out.println("Found " + nodeValue + " at node: " + x);
                    return true;
                }

                tempNode = tempNode.getNext();
            }

        }
        System.out.println("Node not found");
        return false;
    }

    public void deleteNode(int location) {
        if (!existsLinkedList()) {
            System.out.println("The linked list does not exist");
            return;
        } else if (location == 0) {
            head = head.getNext();
            setSize(getSize() - 1);

            if (getSize() == 0) {
                tail = null;
            } else if (location >= getSize()) {
                SingleNode tempNode = head;

                for (int x = 0; x < getSize() - 1; x++) {
                    tempNode = tempNode.getNext();
                }
                if (tempNode == head) {
                    tail = head = null;
                    setSize(getSize() - 1);
                    return;
                }

                tempNode.setNext(null);
                tail = tempNode;
                setSize(getSize() - 1);
            } else {
                SingleNode tempNode = head;
                for (int x = 0; x < location - 1; x++) {
                    tempNode = tempNode.getNext();
                }
                tempNode.setNext(tempNode.getNext().getNext());
            }
        }
    }

    public void reverseList() {
        if (existsLinkedList()) {
            if (getSize() == 1) {
                return;
            } else if (getSize() == 2) {
                tail.setNext(head);
                head.setNext(null);
                head = tail;
                tail = head.getNext();
                return;
            } else if (getSize() >= 3) {
                SingleNode prevNode = head;
                SingleNode currentNode = head.getNext();
                SingleNode nextNode = currentNode.getNext();

                prevNode.setNext(null);
                currentNode.setNext(prevNode);

                while (nextNode.getNext() != null) {
                    prevNode = currentNode;
                    currentNode = nextNode;
                    nextNode = nextNode.getNext();

                    currentNode.setNext(prevNode);
                }

                nextNode.setNext(currentNode);
                tail = head;
                head = nextNode;

            }
        } else {
            System.out.println("List does not exist or list empty");
        }
        traverseLinkedList();
    }
}
