/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Vignesh
 */
public class ArrayBasic {
    public static void main(String[] args) {
        int i;
        int[] nos = {1, 2, 3, 4};
        char[] str = {'a', 'b', 'c'};
        int[] emptyArray = new int[10];
        
        String[] stringArray = {"hello ", "how are ","you"};
        
        for(i=0;i<stringArray.length;i++) {
            System.out.print(stringArray[i]);
        }
        
        System.out.println();
        
        for(i=0;i<nos.length;i++) {
            System.out.print(nos[i]);
        }
        
        System.out.println();
        
        for(i=0;i<str.length;i++) {
            System.out.print(str[i]);
        }
        
        System.out.println();
        
        for(i=0;i<emptyArray.length;i++) {
        	emptyArray[i] = i;
            System.out.print(emptyArray[i]);
        }
        
        
        
    }
    
}
