/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mits.iot.smartdevice.examples;

import edu.mits.iot.smartdevice.Sensor;
 

public class PressureSensor implements Sensor<Integer>{

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
     * @param s
     * @return
     */
    /**
     *
     * @return
     */
    @Override
    public char status() {
        //To change body of generated methods, choose Tools | Templates.
        return 0;
    }

    @Override
    public Integer read() {
        return 0;
    }
    
}
