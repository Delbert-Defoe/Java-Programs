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
public class Student {

    private static String name, password, idNum;
    private static ArrayList<Event> events = new ArrayList();
    Scanner sc = new Scanner(System.in);

    private static Student instance = null;
    
    private Student() {}

    public static Student getInstance() {
        if (instance == null) {
            instance = new Student();
        }

        return instance;
    }

    /**
     * *********************************************************************************************
     *************************************GETTERS AND
     * SETTERS***************************************
     * *********************************************************************************************
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void addEvent(Event event) {
        this.events.add(event);
        updateEvents();
        System.out.println("Event Added");
    }

    public void initEvent(Event event) {
        this.events.add(event);
    }

    public void deleteEvent(Event event) {
        System.out.println("Are you sure you want to Remove this Booking? (y/n): ");
        char choice = sc.next().toLowerCase().charAt(0);
        switch (choice) {
            case 'y':
                this.events.remove(event);
                updateEvents();
                System.out.println("Event Deleted");
                break;

            case 'n':
                return;
                
            default:
                System.out.println("Invalid input");
                break;
        }

    }

    /**
     * ***********************************************************************
     *
     */
    public boolean loggedIn() {
        if (this.name == null) {
            return false;
        } else {
            return true;
        }

    }

    public void updateEvents() {
        BufferedWriter bw = null;
        try {
            ArrayList<String> allData = new ArrayList(); //New Array List to dynamically add and store other Students Data
            File file = new File("Students.txt");
            FileWriter fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);
            BufferedReader br = new BufferedReader(new FileReader("Students.txt"));
            String reading = br.readLine();
            String[] content;

            while (reading != null) {
                content = reading.split("#");

                if (content[0].equals(this.idNum)) { // If the current data stored in content belongs to the logged in user, it will rewrite the values
                    String data = "";

                    if (content.length < 4) { //IF there are no events, the program simply adds a string formatted for the event added
                        String newEvents = "{" + events.get(0).getId() + "}";
                        //Adding to all the data

                        for (String content1 : content) {
                            data += content1 + "#";

                        }
                        data += newEvents;
                        allData.add(data);

                    } else { // If there are already added events the program will have different formatting to do
                        //Rewriting the Events String
                        if (events.size() == 2) { //Special case for 2 events                  
                            content[3] = "{" + events.get(0).getId() + "," + events.get(1).getId() + "}";
                            //Adding to all the data
                            for (String content1 : content) {
                                if (content1.equals("}")) {
                                    continue;
                                }
                                data += content1 + "#";
                            }
                            allData.add(data);
                        } else {
                            content[3] = "{" + events.get(0).getId() + ",";

                            for (int i = 1; i < this.events.size() - 1; i++) {
                                content[3] += events.get(i).getId() + ",";
                            }

                            content[3] += events.get(events.size() - 1).getId() + "}";
                            //Adding to all the data
                            for (String content1 : content) {
                                data += content1 + "#";
                            }
                            allData.add(data);
                        }
                    }

                } else { //If the data does not belong to the currently logged in user, then the data is added with the rest
                    //Adding to all the data
                    String data = "";
                    for (String content1 : content) {
                        data += content1 + "#";
                    }
                    allData.add(data);
                }

                reading = br.readLine();
            }

            //clear.write("");
            //System.out.println(allData.get(0));
            FileWriter clear = new FileWriter(file, false); //File.delete() is not working, i looked online and found out that it was a windows issue, so i had to get creative
            for (int i = 0; i < allData.size(); i++) {
                //System.out.println(allData.get(i));
                bw.write(allData.get(i) + "\n");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error, Removing Event Because the file was not found: " + ex);
        } catch (IOException ex) {
            System.out.println("Error with File whilst trying to update an event: " + ex);
        } catch (Exception ex) {
            System.out.println("Unexpected Error updating Events " + ex);
        } finally {
            try {
                if (bw != null) {
                    bw.flush();
                    bw.close();
                }
            } catch (Exception e) {
                System.out.println("Error in closing: " + e);
            }

        }
    }

}
