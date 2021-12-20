/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimetercalculator;

/**
 *
 * @author CheeZee
 */
class Perimeter {
   private double area, perimeter, length1, length2, base, height;

    public Perimeter(double area, double perimeter, double length1, double length2, double base, double height) {
        this.area = area;
        this.perimeter = perimeter;
        this.length1 = length1;
        this.length2 = length2;
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }


    public double getLength1() {
        return length1;
    }

    public void setLength1(double length1) {
        this.length1 = length1;
    }

    public double getLength2() {
        return length2;
    }

    public void setLength2(double length2) {
        this.length2 = length2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
   
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
  

    public void addPerimeter(){
        this.perimeter = this.base + this.length1 + this.length2;
    }
    
    public void multiplyArea() {
        this.area = (0.5*this.base) * this.height;
    }

    
    
}
