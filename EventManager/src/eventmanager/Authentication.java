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
public class Authentication {

    private final String usersFile = "Students.txt";
    private final String eventsFile = "Events.txt";
    private final Scanner sc = new Scanner(System.in);
    private Student student = Student.getInstance();

    public void authenticate(String idnum) {
        BufferedWriter bw = null;
        try {
            File file = new File("Students.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader br = new BufferedReader(new FileReader(usersFile));

            Boolean userFound = false;
            String[] data = null;
            String content = " ";

            do {
                content = br.readLine();
                if (content == null) {
                    userFound = false;
                    break;
                }

                data = content.split("#");

                if (data[0].equals(idnum)) {
                    userFound = true;
                }
            } while (!userFound);

            if (userFound) {

                int attempts = 0;
                Boolean authenticated = false;
                do {
                    System.out.print("Please Enter your password (" + data[1] + "): ");
                    String pass = sc.nextLine();
                    if (pass.equals(data[1])) {
                        //System.out.print("ran");
                        authenticated = true;
                    }
                    attempts++;
                } while (attempts < 5 && !authenticated);
                if (authenticated) {
                    Student student = Student.getInstance();
                    student.setName(data[2]);
                    student.setIdNum(data[0]);

                    if (data.length == 4) {
                        setEventList(data[3]);
                    }
                }
            } else {
                System.out.println("This user was not found... Would you like to create a new user? (y/n)");
                String choice = sc.next();

                switch (choice) {

                    case "y":
                        sc.nextLine();
                        System.out.print("Please enter your name: ");
                        String name = sc.nextLine();
                        Boolean matching = false;
                        do {
                            System.out.print("Please create a password: ");
                            String pass1 = sc.nextLine();
                            System.out.print("Please confirm password: ");
                            String pass2 = sc.nextLine();

                            if (!pass2.equals(pass1)) {
                                System.out.println("Please Try entering your password again....");
                            } else {
                                FileWriter fw = new FileWriter(file, true);
                                bw = new BufferedWriter(fw);
                                try {
                                    String studentData = idnum + "#" + pass1 + "#" + name + "\n";

                                    bw.write(studentData);

                                    student.setName(name);
                                    student.setIdNum(idnum);

                                    System.out.println("Thank you for creating an account, you are now logged in as " + student.getName());
                                    matching = true;
                                } catch (Exception ex) {
                                    System.out.println("Error creating new User");
                                } finally {
                                    try {
                                        if (bw != null) {
                                            bw.flush();
                                            bw.close();
                                        }
                                    } catch (Exception ex) {
                                        System.out.println("Error Closing File " + ex);
                                    }
                                }
                            }
                        } while (!matching);
                        break;
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error, File not found " + ex);
        } catch (Exception ex) {
            System.out.println("Unexpected error occured " + ex);
        } finally {
            try {
                if (bw != null) {
                    bw.flush();
                    bw.close();
                }
            } catch (Exception e) {
                System.out.println(".......");
            }

        }
    }

    void setEventList(String events) {
        try {
            ArrayList<Event> allEvents = new ArrayList();
            Event eventClass = new Event();
            allEvents = eventClass.getEvents();

            if (events.length() == 3) {
                for (int i = 0; i < allEvents.size(); i++) {
                    if (events.charAt(1) == allEvents.get(i).getId().charAt(0)) {
                        student.initEvent(allEvents.get(i));
                    }
                }
            } else {
                String studentEvents[] = events.split(",");

                for (int j = 0; j < studentEvents.length; j++) {
                    for (int i = 0; i < allEvents.size(); i++) {
                        //Since the curly braces are included in the first and last string they must be operated on differently
                        if (j == 0) {
                            if (studentEvents[j].charAt(1) == allEvents.get(i).getId().charAt(0)) {
                                student.initEvent(allEvents.get(i));
                            }
                        } else if (j == studentEvents.length - 1) {
                            if (studentEvents[j].charAt(0) == allEvents.get(i).getId().charAt(0)) {
                                student.initEvent(allEvents.get(i));
                            }
                        } else {
                            if (studentEvents[j].equals(allEvents.get(i).getId())) {
                                student.initEvent(allEvents.get(i));
                            }
                        }
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Unexpected Error found Setting Events: " + ex);
        }
    }
}
