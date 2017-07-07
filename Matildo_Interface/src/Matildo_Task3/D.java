/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Matildo_Task3;

/**
 *
 * @author 3rd Year account
 */
public class D extends E implements A{
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
    
    @Override
    public void r(){
        System.out.println("Class D implements method r");
    }
    @Override
    public void s(){
        System.out.println("Class D implements method s");
    }
    
    public void t(String t){
        System.out.println("Class D implements method t");
    }
    public String u(String s1, String s2){
       System.out.println("Class D implements method u");
       return "Class D implements u";
    }
    
    public String getD(){
        return this.d;
    }
}
