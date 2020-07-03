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
public class MainClass {
    public static void main(String[] args) {
        SubClass sub = new SubClass();        
        System.out.println("---------------------constructors----------------");
        new ConstructorsPgm();
        new ConstructorsPgm(5,5);
        //gettersAndSetters gSet = new gettersAndSetters("Vicky","Red",20);
        GettersAndSetters gSet = new GettersAndSetters();
        
        gSet.setMyName("Vignesh");
        gSet.setMyColor("Blue");
        System.out.println("----------------------subClass----------------");
        sub.display();
        System.out.println("----------------------gettersAndSetters----------------");
        gSet.show();
    }
    
}
