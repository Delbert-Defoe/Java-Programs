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
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author CheeZee
 */
enum Type {
    ONLINE,
    INTERNAL,
    EXTERNAL
}

public class Event {

    private String id, title, description, url, location, room, organisation, time, date, frequency;
    private Boolean booking;
    private Type type;
    private int maxAttendance;
    private final String eventsFile = "Events.txt";
    private ArrayList<Event> events = new ArrayList();

    public Event() {

    }

    public Event(String id, String title, String description, String url, String location, String room, Type type, int maxAttendance, String time, String date, String frequency, Boolean booking) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.url = url;
        this.location = location;
        this.room = room;
        this.type = type;
        this.maxAttendance = maxAttendance;
        this.time = time;
        this.date = date;
        this.frequency = frequency;
        this.booking = booking;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Boolean getBooking() {
        return booking;
    }

    public void setBooking(Boolean booking) {
        this.booking = booking;
    }

    public ArrayList<Event> getEvents() {
        readEvents();
        return events;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getMaxAttendance() {
        return maxAttendance;
    }

    public void setMaxAttendance(int maxAttendance) {
        this.maxAttendance = maxAttendance;
    }

    /**
     * *****************************************************************
     * methods
     * *************************************************************************
     */
    public void readEvents() {

        try {
            BufferedReader br = new BufferedReader(new FileReader(eventsFile));
            String reading = null;
            String content[];
            reading = br.readLine();

            while (reading != null) {
                content = reading.split(",");
                String id = content[0];
                String title = content[1];
                String description = content[2];
                String room;
                String time = content[8];
                String date = content[9];
                String frequency = content[10];
                Boolean booking = Boolean.getBoolean(content[11]);
                Type type = null;
                String url;
                String location;

                switch (content[6]) {
                    case "ONLINE":
                        type = Type.ONLINE;
                        room = "n/a";
                        break;

                    case "INTERNAL":
                        type = Type.INTERNAL;
                        room = content[5];
                        break;

                    case "EXTERNAL":
                        type = Type.EXTERNAL;
                        room = "n/a";
                        break;

                    default:
                        throw new Exception("Event Type not set or found");

                }

                if (type == Type.EXTERNAL || type == Type.INTERNAL) {
                    url = "n/a";
                    location = content[4];
                } else {
                    url = content[3];
                    location = "n/a";
                }                


                Event newEvent = new Event(id, title, description, url, location, content[5], type, Integer.parseInt(content[7]), time, date, frequency, booking);
                this.events.add(newEvent);

                reading = br.readLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error reading all events " + ex);
        } catch (Exception ex) {
            System.out.println("Unexpected Error: " + ex);
        }
    }

    public void editEvent(Event event) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the corresponding number of the field you would like to edit");
        System.out.println("==================================================================================\n" + "Event: " + event.id + "\n2. Title: " + event.title
                + "\n3. Description: " + event.description + "\n4. URl: " + event.url + "\n5. Location: " + event.location + "\n6. Type: " + event.type.toString()
                + "\n7. Maximum Attendance: " + event.maxAttendance + "\n8. Time: " + event.time + "\n9. Date: " + event.date + "\n10. Frequency: " + event.frequency
                + "\nEnter '0' To Exit \n==================================================================================\n");
        String choice = sc.nextLine();
    

        switch (choice) {
            case "1":
                System.out.println("Cannot Edit Event ID");
                break;

            case "2":
                System.out.print("Please enter a new title: ");
                String title = sc.nextLine();
                event.title = title;
                updateEvents(event);
                break;

            case "3":
                System.out.print("Please Enter a new description: ");
                String description = sc.nextLine();
                event.description = description;
                updateEvents(event);
                break;

            case "4":
                System.out.print("Please enter a new URL: ");
                String url = sc.nextLine();
                event.url = url;
                updateEvents(event);
                break;

            case "5":
                System.out.print("Please enter a new Location: ");
                String location = sc.nextLine();
                event.location = location;
                updateEvents(event);
                break;

            case "6":
                System.out.print("Please enter a new type (online, internal, external): ");
                String type = sc.nextLine().toUpperCase();
                switch (type) {
                    case "ONLINE":
                        event.type = Type.ONLINE;
                        updateEvents(event);
                        break;

                    case "EXTERNAL":
                        event.type = Type.EXTERNAL;
                        updateEvents(event);
                        break;

                    case "INTERNAL":
                        event.type = Type.INTERNAL;
                        updateEvents(event);
                        break;

                    default:
                        System.out.println("Data Entered not a valid type (online, external, internal): ");
                        break;
                }
                break;

            case "7":
                try {
                    System.out.print("Please enter a new maximum attendance: ");
                    int maxAttendance = sc.nextInt();
                    event.maxAttendance = maxAttendance;
                    updateEvents(event);
                } catch (InputMismatchException ex) {
                    System.out.println("Maximum Attendance must be a number!");
                }

            case "8":
                System.out.print("Please enter a new time (24:00): ");
                String time = sc.nextLine();
                event.time = time;
                updateEvents(event);
                break;

            case "9":
                System.out.print("Please enter a new Date ('dd/mm/yy'): ");
                String date = sc.nextLine();
                event.date = date;
                updateEvents(event);
                break;

            case "10":
                System.out.print("Please enter a new frequency for this event: ");
                String frequency = sc.nextLine();
                event.frequency = frequency;
                updateEvents(event);
                break;

            default:
                System.out.println("Invalid Input!");
                break;
        }

    }

    public void updateEvents(Event event) {
           BufferedWriter bw = null;
        try {
            File file = new File("Events.txt");
           // FileWriter fw = new FileWriter(file, true);
            
            
            ArrayList<Event> events = getEvents();
            String data = "";
            
            for (int i = 0; i < events.size(); i++) {
                if(events.get(i).getId().equals(event.getId())){
                    data += toString(event) + "\n";                                    
                } else{
                    data += toString(events.get(i)) + "\n";
                }
                
            }
       
            FileWriter fw = new FileWriter(file, false);
            bw = new BufferedWriter(fw);
            fw.write(data);
            
        }catch(Exception ex){
            System.out.println("Error Found "+ex);
        } finally {
            try{
                if(bw!=null){
                    bw.flush();
                    bw.close();
                }
            }catch(Exception ex){
                System.out.println("Error with buffered writer "+ex);
            }
        }
    }

    @Override
    public String toString() {
        String string = "==================================================================================\n" + "Event: " + this.id + "\nTitle: " + this.title
                + "\nDescription: " + this.description + "\nURl: " + this.url + "\nLocation: " + this.location + "\nRoom: " + this.room + "\nType: " + this.type.toString()
                + "\nMaximum Attendance: " + this.maxAttendance + "\nTime: " + this.time + "\nDate: " + this.date + "\nFrequency: " + this.frequency + "\n Booking Needed?: " + this.booking
                + "\n==================================================================================\n";

        return string;
    }
    
    public String toString(Event event){
        return event.getId() + "," + event.getTitle() + "," + event.getDescription() + "," + event.getUrl() + "," + event.getLocation() + "," + event.getRoom() + "," + event.getType().toString() + "," + event.getMaxAttendance() + "," + event.getTime() + "," + event.getDate() + "," + event.getFrequency() + "," + event.getBooking();
                            
    }

}
