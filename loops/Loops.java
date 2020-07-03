/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author Vignesh
 */
public class Loops {
    public static void main(String[] args) {
        int num=10,i;
        System.out.println("For loop");
        for(i=0;i<num;i++) {
            System.out.println("loop "+i);
        }
        System.out.println("While loop");
        i=0;
        while(num!=i) {
            System.out.println("while "+i);
            i++;
        }
        i=0;
        do {
            System.out.println("dowhile "+i);
            i++;
        }while(num!=i);
    }
    
}
