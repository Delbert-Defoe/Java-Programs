/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanager;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author CheeZee
 *
 * Hello miss, i have gone ahead and created an account for you. You may
 * create your own to see how that works. Your user ID is (2020121601) The
 * program will display your password in brackets
 */
public class EventManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Event events = new Event();
        Student student = Student.getInstance();
        Authentication auth = new Authentication();
        boolean exit = false; 

        do {
            try {
                if (!student.loggedIn()) {
                    System.out.println("Please enter your id number: ");
                    String idNum = sc.nextLine();
                    auth.authenticate(idNum);
                } else {
                    char choice = ' ';
                    System.out.println("=====================================================");
                    System.out.println("WELCOME TO USC EVENTS MANAGER " + student.getName() + "!");
                    System.out.println("Please Enter the corresponding Number to Enter a Menu");
                    System.out.println("1. View My Events");
                    System.out.println("2. Book Event");
                    System.out.println("3. Exit");
                    System.out.println("=====================================================");
                    choice = sc.next().charAt(0);

                    switch (choice) {

                        case '1':
                            LinkedList list = new LinkedList();
                            if (student.getEvents().isEmpty()) {
                                System.out.println("You currently have no events");
                                ArrayList<Event> eventList = events.getEvents();
                                list.createLinkedList(eventList.get(0));
                                for (int i = 1; i < eventList.size(); i++) {
                                    list.insertLinkedList(eventList.get(i), i);
                                }
                                list.traverseLinkedList(false);

                            } else {
                                list.createLinkedList(student.getEvents().get(0));
                                for (int i = 1; i < student.getEvents().size(); i++) {
                                    list.insertLinkedList(student.getEvents().get(i), i + 1);
                                }
                                list.traverseLinkedList(true);
                            }
                            break;

                        case '2':
                            LinkedList list1 = new LinkedList();
                            ArrayList<Event> eventList = events.getEvents();

                            list1.createLinkedList(eventList.get(0));
                            for (int i = 1; i < eventList.size(); i++) {
                                list1.insertLinkedList(eventList.get(i), i);
                            }
                            list1.traverseLinkedList(false);

                            break;

                        case '3':
                            exit = true;
                            System.out.println("Goodbye!");
                            break;

                        default:
                            System.out.println("Invalid Input!");
                    }
                }
            } catch (InputMismatchException ex) {
                System.out.println("Oops! you entered some data in wrongly");
            } catch (Exception ex) {
                System.out.println("Oops! an error occured" + ex);
            }
        } while (!exit);
    }

}
