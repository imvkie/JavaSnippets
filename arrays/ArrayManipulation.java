/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Arrays;

/**
 *
 * @author Vignesh
 */
public class ArrayManipulation {
    public static void main(String[] args) {
        int[] emptyArray = new int[10];
        int i;
        
        emptyArray[0] = 23;
        emptyArray[1] = 26;
        emptyArray[2] = 15;
        emptyArray[3] = 3;
        emptyArray[4] = 26;
        emptyArray[5] = 14;
        emptyArray[6] = 24;
        emptyArray[7] = 345;
        emptyArray[8] = 5;
        
        System.out.println("-----------------before sorting-----------------");
        for(i=0;i<emptyArray.length;i++) {
            System.out.print(emptyArray[i]+" ");
        }
        
        Arrays.sort(emptyArray);
        
        System.out.println("-----------------after sorting-----------------");
        for(i=0;i<emptyArray.length;i++){
            System.out.print(emptyArray[i]+" ");
        }
    }
}
