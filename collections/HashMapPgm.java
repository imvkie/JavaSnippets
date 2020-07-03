/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Vignesh
 */
public class HashMapPgm {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<>();
        HashMap<String, Integer> users = new HashMap<>();
        
        /*
            HashMaps -> <key, values>
            key can be of any type
            ingeneral <object, object>
            HashMaps are like dictionary (unique elements)
        */
        
        System.out.println("\n----------HashMap with key as Integers-----------");
        hash.put(1234,"Vignesh");
        hash.put(1235,"Michael");
        hash.put(123,"George");
        hash.put(234,"Kohli");
        
        System.out.println(hash.entrySet());
        System.out.println("Value at key 123 is : " + hash.get(123));
        
        System.out.println("----HashMap with key as Strings ie.<users,hashkeyvalue>----");
        users.put("Vignesh",224545450);
        users.put("Michael",22345335);
        users.put("George",534467350);
        users.put("Kohli",236736487);
        
        System.out.println(users.entrySet());
        System.out.println("Value at key Vignesh is : " + users.get("Vignesh"));
        
        System.out.println("\n----------HashMap removed Michael-----------");
        users.remove("Michael");
        System.out.println(users.entrySet());
        
        System.out.println("\n----------Iterating with HashMap-----------");
        Iterator<Entry<String, Integer>> iterator = users.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            System.out.println("Username : " + pair.getKey() + " Equivalent Hashkey : "+ pair.getValue());
        }
        
        /*
            Primitives : int, String
            Objects : Integers, String 
            HashMap<Integer, String> users =  new HashMap<>();
         */       

    }    
}
