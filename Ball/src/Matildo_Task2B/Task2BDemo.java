/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Matildo_Task2B;

/**
 *
 * @author Student Account
 */
public class Task2BDemo {
    public static void main(String[] args){
       Ball ball = new Ball();
       ball.setX(3.00);
       ball.setY(5.00);
       ball.setXSpeed(10.00);
       ball.setYSpeed(10.00);
       ball.setXY(2.00, 4.00);
       ball.setXYSpeed(20.00, 20.00);
       System.out.printf("Ball X position: %.2f\n",ball.getX());
       System.out.printf("Ball Y position: %.2f\n",ball.getY());
       System.out.printf("Ball X speed: %.2f\n",ball.getXSpeed());
       System.out.printf("Ball Y speed: %.2f\n",ball.getYSpeed());
       ball.move();
       ball.print();
       
       
    }
}
