/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mits.iot.smartdevice.examples;

import edu.mits.iot.smartdevice.Actuator;
 

public  class AlarmLight implements Actuator{

    /**
     *
     */
    @Override
    public void setId() {
     //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    
    @Override
    public char getId() {
       //To change body of generated methods, choose Tools | Templates.
       return 0;
    }

    /**
     *
     */
    @Override
    public void write() {
        System.out.println(System.currentTimeMillis()+" light on");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char status() {
        //To change body of generated methods, choose Tools | Templates.
        return 0;
    }
    
}
