/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mits.iot.smartdevice.examples;

import edu.mits.iot.smartdevice.Actuator;
import edu.mits.iot.smartdevice.Device;
import edu.mits.iot.smartdevice.Rule;
import edu.mits.iot.smartdevice.Sensor;
 

public class EmptybedRule implements Rule
{
    Integer s2;
    Sensor<Integer> se;
    Actuator a;
    String name;
    int count;
    
    public EmptybedRule(Device d){
      
           se=d.getSensor("pressureSensor");
           a=d.getActuator("emergencylight");
    }
    /**
     *
     */
    @Override
    public void execute(){
         
         if(se.read()==0){                
             a.write();        
         }
    }
}