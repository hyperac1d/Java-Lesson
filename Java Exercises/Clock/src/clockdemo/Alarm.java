/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockdemo;


public class Alarm {
    int set_hr, set_min, set_sec;
    int duration;
    
    Alarm(){
    }
    Alarm(int hr, int min, int sec){
        this.set_hr = hr;
        this.set_min = min;
        this.set_sec = sec;
        duration = 0;
    }
    void getSet(int hr, int min, int sec){
        this.set_hr = hr;
        this.set_min = min;
        this.set_sec = sec;
        duration = 0;
    }
    void isAlarm(){
        Alarm a = new Alarm();
        if(a.equals(a)) {
            System.out.println("Alarm! Alarm! Alarm!");
        } else {          
            System.out.println("---Not Yet--");
        }
 
    }
}
 
