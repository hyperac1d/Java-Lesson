/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Matildo_Task3;

/**
 *
 * @author 3rd Year account
 */
public class F extends D implements C{
    int val;
    @Override
   public void o(){
       System.out.println("Class F implements method o");
   }
   public void v(){
       System.out.println("Class F implements method v");
   }

    @Override
    public void v(int val) {
        System.out.println("Class F implements method v");
    }
   
}
