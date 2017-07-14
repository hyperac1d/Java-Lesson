/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Matildo_Task2B;

/**
 *
 * @author Student Account
 */
public class Ball {
     double x;
     double y;
     double xSpeed ;
     double ySpeed ;
    
    Ball(double x, double y, double xSpeed, double ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    Ball() {
        this.x = 0.0;
        this.y = 0.0;
        this.xSpeed = 0.0;
        this.ySpeed = 0.0;
    }
    double getX(){
        return this.x;
    }
    void setX(double x){
        this.x = x;
    }
    double getY(){
        return this.y;
    }
    void setY(double y){
        this.y = y;
    }
    
    double getXSpeed(){
        return this.xSpeed;
    }
    void setXSpeed(double xSpeed){
        this.xSpeed = xSpeed;
    }
    double getYSpeed(){
        return this.ySpeed;
    }
    void setYSpeed(double ySpeed){
        this.ySpeed = ySpeed;
    }
    void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    void setXYSpeed(double xSpeed, double ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    void move(){
        this.x *= this.xSpeed;
        this.y *= this.ySpeed;
    }
    void print(){
//        System.out.println("The Ball is in the ("+getX()+","+getY()+") position with a speed of("+getXSpeed()+","+getYSpeed()+")");
        System.out.printf("The Ball is in the (%.2f, %.2f) position with a speed of (%.2f, %.2f)\n",getX(),getY(),getXSpeed(), getYSpeed());
    }
        
}
