/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author Vignesh
 */
public class ConstructorOverloading {
   private String myName, myColor;
    
    ConstructorOverloading() {
        System.out.println("This is default constructor");
    }
    ConstructorOverloading(String myName) {
        this.setMyName(myName);
        System.out.println(myName);
    }
    ConstructorOverloading(String myName, String myColor) {
        this.setMyName(myName);
        this.setMyColor(myColor);
        System.out.println(myName + " " + myColor);
    }
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
}
