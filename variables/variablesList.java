/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author Vignesh
 */
public class variablesList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String myName="Vignesh";
        byte myByte = 127;
        int myAge =20;
        //float i =1.5; issue in lossy convertion
        float myFloat = 1.6f;
        double myDble = 100.1523;
        char ch = 'a';
        boolean tr = true;
        boolean fl = false;
        System.out.println("Boolean can be a "+ tr +" or a "+fl+" one");
        System.out.println("float used with f at end is "+myFloat);
        System.out.println("byte size is : "+myByte);
        System.out.println(ch + " - " + myDble);
        System.out.println("Hello "+myName+" You are "+myAge+" years old.");
        
        /*
        ---------------assignment below----------------
            Create a java class and type the following
            "This is the happiest day of my life"
        */
    }
    
}
