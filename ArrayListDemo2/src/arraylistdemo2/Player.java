package arraylistdemo2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CheeZee
 */
public class Player {
    private int number, shirtNumber;
    private String name;

    public Player(int number, int shirtNumber, String name) {
        this.number = number;
        this.shirtNumber = shirtNumber;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "[" + number + ", " + shirtNumber + ", " + name + "]";
    }
    
    
    
}
