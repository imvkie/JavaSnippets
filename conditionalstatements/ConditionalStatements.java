/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional_statements;

/**
 *
 * @author Vignesh
 */
public class ConditionalStatements {
    public static void main(String[] args) {
        int number = 10213;
        int sCase = 2;
        
        /*
        Relational Operators
            == Comparison
            != Not equal
            > greater than
            < lesser than
            >= greater than or equal
            <= lesser than or equal
        
        Logical Operators
            && AND
            || OR
            ! NOT
        */
        
        if(number %2 ==0) {
            System.out.println("It is an Even number");
        }else {
            System.out.println("It is an odd number");
        }
        
        switch(sCase) {
            case 1 : System.out.println("It is one");
                     break;
            case 2 : System.out.println("It is two");
                     break;
            case 3 : System.out.println("It is three");
                     break;
                     
            default : System.out.println("It is not one, two or three");
            
        }   
    }
    
}
