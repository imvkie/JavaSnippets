/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;

/**
 *
 * @author Vignesh
 */
public class ArrayListPgm {
    public static void main(String[] args) {
        int i;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Lion");
        arrayList.add("Tiger");
        arrayList.add("Cheetah");
        
        System.out.println("--------------ArrayList in index 1----------------");
        System.out.println(arrayList.get(1));
        
        System.out.println("\n--------------ArrayList in Loop----------------");
        for(i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }
        
        arrayList.remove(1);
        
        System.out.println("\n--------------After Removing index 1----------------");
        for(i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }
        
        arrayList.add(1,"Gorilla");
        
        System.out.println("\n------ArrayList added in index 1 as Gorilla----------");
        for(i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }
        
        arrayList.remove("Cheetah");
        
        System.out.println("\n------ArrayList : Cheetah is removed as object-----");
        for(i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }
       
        System.out.println("\nSize of arrayList using arraList.size() is " + arrayList.size());
        
        System.out.println("\n-----------Removing using contains------------");
        if(arrayList.contains("Monkey")){
            arrayList.remove("Monkey");
        }else{
            System.out.println("No Monkey is there");
        }
    
    }
}
