/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Matildo_Task2;

/**
 *
 * @author 3rd Year account
 */
public class D implements A{
    String d;
    
    D(){
        this.d = "No value";
    }
     D(String d){
        this.d = d;
    }
    @Override
    public void o(){
        System.out.println("Class D implements method o");
    }
    public void p(){
        System.out.println("Class D implements method p");
    }
   
    public void q(){
        System.out.println("Class D implements method q");
    }
    
    public String getD(){
        return this.d;
    }
}
