/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Vignesh
 */
public class MainClass {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student2 s2 = new Student2();
        s1.setMyName("Mark");
        s1.setMark1(100);
        s1.setMark2(80);
        s1.setMark3(85);
        s1.total();
        s1.average();
        
        s2.setMyName("Wood");
        s2.setMark1(70);
        s2.setMark2(60);
        s2.setMark3(95);
        s2.total();
        s2.average();
        
        System.out.println("Displaying student 1 record");
        s1.display();
        
        System.out.println("\n-----------------------------------------------\n");
        
        System.out.println("Displaying student 2 record");
        s2.display();
    }    
}
