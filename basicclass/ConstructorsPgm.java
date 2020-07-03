/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_class;

/**
 *
 * @author Vignesh
 */
public class ConstructorsPgm {
    /*
        We can have multiple constructors in a class but we cant have it with a 
        same signature but if we need two methods with a same name then we should
        overload a method
    */
    ConstructorsPgm() {//Default constructor
        System.out.println("Constructors executed in a seperate class");
    }
    ConstructorsPgm(int a, int b) {//Parameterized constructor
        int sum = a+b;
        System.out.println("Parameterised constructor executed and the sum is "+sum);
    }
    
}
