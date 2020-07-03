/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Vignesh
 */
public class SingleDerived extends SingleBase {
    public void addValues(){
        int sum = input1+input2;
        System.out.println("sum of two nos is : "+sum);
    }
}
