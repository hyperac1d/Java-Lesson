/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockdemo;

/**
 *
 * @author 3rd Year Account
 */
public class Clock {
    int hr, min, sec;
    
    Clock(){
        this.hr = 0;
        this.min = 0;
        this.sec = 0;
    }
    Clock(int hr, int min, int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    void setTime(int hr, int min, int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    int getHours(){
        return this.hr;
    }
    int getMinutes(){
        return this.min;
    }
    int getSeconds(){
        return this.sec;
    }
    void printTime(){
        String time = String.format("Local Time (hr:min:sec): %02d:%02d:%02d", getHours(), getMinutes(), getSeconds());
        System.out.println(time);
    }
    int incrementSeconds(){
        if(sec == 60){
            sec = 0;
            return incrementMinutes();
        }
        return this.sec++;    
    }
    int decrementSeconds(){
        if(this.sec == 0){
            sec = 59;
            return decrementMinutes();
        }
        return this.sec--;
    }
    int incrementMinutes(){
        if(min == 59){
            min = 0;
            return incrementHours();
        }
        return this.min++;
    }
    int decrementMinutes(){
        if(this.min == 0){
            this.min = 59;
            return decrementHours();
        }
        return this.min--;
    }
    int incrementHours(){
        if(hr == 24){
            hr = 0;
            return this.hr;
        }
        return this.hr++;
    }
    int decrementHours(){
        if(this.hr == 0){
            return this.hr = 24;
        }
        return this.hr--;
    }
    boolean equals(Clock c){ 
        return (hr == c.hr && min == c.min && sec == c.sec);
    } 
    void makeCopy(Clock c){
        hr = c.hr;
        min = c.min;
        sec = c.sec;
    }
    Clock getCopy(){
        Clock temp = new Clock();
        
        temp.hr = hr;
        temp.min = min;
        temp.sec = sec;
        
        return temp;
    }
   
}
