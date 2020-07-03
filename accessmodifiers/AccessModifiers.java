/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access_modifiers;

/**
 *
 * @author Vignesh
 */
public class AccessModifiers {
        private int capacity;
        void privateAccess() {
            capacity = 10;
            System.out.println("im in private and capacity is : "+capacity);
        }
}
