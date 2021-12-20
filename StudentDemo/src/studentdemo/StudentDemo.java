
package studentdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author CheeZee
 */
public class StudentDemo {

    
    public static void main(String[] args) {

        String name;
        float math, english, science;
        
        Scanner sc = new Scanner(System.in);
    try{    
        System.out.print("Please enter your name ----> ");
        name = sc.next();
        
        System.out.print("Please enter math Grade: ");
        math = sc.nextFloat();
        
        System.out.print("Please enter english Grade: ");
        english = sc.nextFloat();
        
        System.out.print("Please enter science Grade: ");
        science = sc.nextFloat();
        
        Student student1 = new Student(name, math, english, science);
        
        System.out.println(student1.getName() +" Has an average of : "+student1.avgMark());
        
        
        Scanner read= new Scanner(System.in);
        
        System.out.print("Please edit your name: ");
        name = read.nextLine();
        
        student1.setName(name);
        
        System.out.println("Your name is now "+student1.getName());
        
    }catch(InputMismatchException e){
       System.out.println("Invalid Input");
    }catch(Exception e){
        System.out.println(e);
    }
        
    }
    
}
