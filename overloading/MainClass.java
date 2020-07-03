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
public class MainClass {
    public static void main(String[] args) {
    //Constructor Overloading
        System.out.println("-------------------Constructor Overloading--------------");
        new ConstructorOverloading();
        new ConstructorOverloading("Vignesh");
        new ConstructorOverloading("Vignesh","Blue");
            
    //Method Overloading
        System.out.println("-------------------Method Overloading--------------");
        MethodOverloading meth = new MethodOverloading();
        meth.display();
        meth.display("Vignesh");
        meth.display("Vignesh","Blue");
    }
}
