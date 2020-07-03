/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author Vignesh
 */
public class MethodOverloading {
    void display() {
        System.out.println("This is default method");
    }
    void display(String myName) {
        System.out.println("My name is " + myName);
    }
    void display(String myName, String myColor) {
        System.out.println("My name is " + myName + " and i like "+ myColor);
    }
}
