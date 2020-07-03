/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_class;

/**
 *
 * @author Vignesh
 */
public class GettersAndSetters {
    private String myName;
    private String myColor;
    private int myAge;
    
    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyColor() {
        return myColor;
    }

    public void setMyColor(String myColor) {
        this.myColor = myColor;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }
    
  /*gettersAndSetters(String myName, String myColor,int myAge){
        this.myName=myName;
        this.myAge=myAge;
        this.myColor=myColor;
    }*/
    
    public void show() {
    System.out.println("My name is "+myName+" and i like "+myColor+" iam "+myAge+" years old");
    }
}


