/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemo;


public class Student {
   private int studentID;
   private String name;
   private float math, english, science;

    public Student(String name, float math, float english, float science) {
       // this.studentID = studentID;
        this.name = name;
        this.math = math;
        this.english = english;
        this.science = science;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public float getScience() {
        return science;
    }

    public void setScience(float science) {
        this.science = science;
    }
    
   
    public float avgMark(){
        
        float average;
        
        average = (math + english + science)/3;
        
        return average;
    }
}
