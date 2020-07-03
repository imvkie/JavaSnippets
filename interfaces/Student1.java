/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Vignesh
 */
public class Student1 implements InterfacesList{
    private String myName;
    private int mark1,mark2,mark3,total,average;

    public void setMyName(String myName) {
        this.myName = myName;
    }
    
    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }    
    
    @Override
    public void total() {
        total=mark1+mark2+mark3;
    }

    @Override
    public void average() {
        average=total/3;
    }

    @Override
    public void display() {
        System.out.println(myName + " has secured " + average + " percent ");
    }
    
}
