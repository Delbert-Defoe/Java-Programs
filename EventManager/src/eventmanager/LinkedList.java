/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CheeZee
 */
public class LinkedList {

    private Node head;
    private Node tail;
    private int size, value;
    Student student = Student.getInstance();
    Event eventsClass = new Event();

    public Node createLinkedList(Event nodeValue) {
        head = new Node();

        Node node = new Node();
        node.setValue(nodeValue);
        node.setNext(null);

        head = node;
        tail = node;
        size = 1;

        return head;
    }

    //Accessors and mutators
    public Node getHead() {
        return head;
    }

    public void setHead(Node node) {
        this.head = node;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

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
    public void insertLinkedList(Event value, int location) {
        Node node = new Node();
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
            Node tempNode = head;
            int index = 0;

            while (index < location - 1) {
                tempNode = tempNode.getNext();
            }

            Node nextNode = tempNode.getNext(); // The node after the new node

            tempNode.setNext(node);
            node.setNext(nextNode);
        }

        setSize(getSize() + 1);
    }

    //Iterating through a inked list
    void traverseLinkedList(Boolean added) {
        Scanner sc = new Scanner(System.in);
        Boolean exit = false;
        try {
            if (existsLinkedList()) {
                Node tempNode = head;

                do {
                    if (added) { //This if statement gives a different list of actions according to if the student is traversing a list of added events or not  
                        System.out.println(tempNode.getValue().toString());
                        System.out.println("1. Next Event");
                        System.out.println("2. Remove Event");
                        System.out.println("3. Edit event");
                        System.out.println("0. Exit");
                        char choice = sc.next().charAt(0);

                        switch (choice) {

                            case '1':
                                if (tempNode.getNext() == null) {
                                    System.out.println("End of Events");
                                    exit = true;
                                } else {
                                    tempNode = tempNode.getNext();
                                }
                                break;

                            case '2':
                                student.deleteEvent(tempNode.getValue());
                                break;

                            case '3':
                                eventsClass.editEvent(tempNode.getValue());
                                break;
                                
                            case'0':
                                exit = true;
                                break;

                            default:
                                System.out.println("Invalid Input");
                                break;
                        }

                    } else {
                        System.out.println(tempNode.getValue().toString());
                        System.out.println("1. Next Event");
                        System.out.println("2. Add Event");
                        System.out.println("3. Exit");
                        char choice = sc.next().charAt(0);

                        switch (choice) {

                            case '1':
                                if (tempNode.getNext() == null) {
                                    System.out.println("End of Events");
                                    exit = true;
                                } else {
                                    tempNode = tempNode.getNext();
                                }
                                break;

                            case '2':
                                student.addEvent(tempNode.getValue());
                                break;

                            case '3':
                                exit = true;
                                break;

                            default:
                                System.out.println("Invalid Input");
                                break;
                        }
                    }
                } while (!exit);
            } else {
                System.out.println("Linked list does not exist");
            }
        } catch (Exception ex) {
            System.out.println("Error in Linkedlist " + ex);
        }
    }

    boolean searchNode(Event nodeValue) {
        if (existsLinkedList()) {
            Node tempNode = head;

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
            }
        } else if (location >= getSize()) {
            Node tempNode = head;

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
            Node tempNode = head;
            for (int x = 0; x < location - 1; x++) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
        }
    }
}
