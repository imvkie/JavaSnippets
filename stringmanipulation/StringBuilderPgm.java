/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_manipulation;

/**
 *
 * @author Vignesh
 */
public class StringBuilderPgm {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();
        string.append("Life");
        string.append(" is great");
        
        System.out.println(string);
        
        System.out.println(string.capacity());
        
        string.delete(1,3);
        
        System.out.println(string);
          
        
    }
    
}
