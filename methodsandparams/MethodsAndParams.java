/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods_and_params;

/**
 *
 * @author Vignesh
 */
public class MethodsAndParams {
    public static void methodWithoutParam() {
        System.out.println("I dont need parameter");
    }
    public static void methodWithParam(String str) {
        System.out.println(str);
    }
    public static void main(String[] args) {
        String str = "I need parameter";
        methodWithoutParam();
        methodWithParam(str);
    }
    
    /*
        return type is void here you can use int or any other to return
    */
}
