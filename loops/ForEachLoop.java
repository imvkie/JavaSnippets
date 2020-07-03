/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.ArrayList;

/**
 *
 * @author Vignesh
 */
public class ForEachLoop {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");
        animals.add("Giraffee");
        
        //foreach
        for(Object animal : animals) {
            System.out.println(animal);
        }
    }
}
