/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockdemo;


public class WorldClock extends Clock{
    int otherClock;
    int temp_hr;
    
    WorldClock(){
        this.otherClock = 0;
    }
    WorldClock(int addClock){
        this.otherClock = addClock;
    }
    
    void set_addClock(int add){
        this.otherClock = add;
    }
    int worldTime(){
        WorldClock c = new WorldClock();
        temp_hr = c.getHours() + this.otherClock;
        return temp_hr;
    }
    @Override
    void printTime(){
        WorldClock c = new WorldClock();
        String time=String.format("World Clock (hr:min:sec): %02d:%02d:%02d", temp_hr,c.getMinutes(), c.getSeconds());
        System.out.println(time);
    }
        
    
   
       
}
