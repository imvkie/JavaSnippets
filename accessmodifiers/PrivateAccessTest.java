package access_modifiers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vignesh
 */
public class PrivateAccessTest {
    public static void main(String[] args) {
        AccessModifiers access = new AccessModifiers();
        //access.capacity = 10; couldnt get access
        access.privateAccess();        
    }
    
}
