/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mits.iot.smartdevice.examples;
/**
 * 
 * @author mits
 */
import edu.mits.iot.smartdevice.Rule;
import java.util.*;
public class Rules {
      HashMap<Integer,Rule> hm=new HashMap<>();
      int count=0;
    /**
     *
     * @param prio
     * @param s
     */
    public void setrule(int prio, Rule s){
          hm.put(prio, s);
          count++;
    }
    public Rule getrule(int prio){
        return hm.get(prio);
    }
    
    public void executerules(){
        int i=1;
        while(hm.containsKey(i)){
            Rule r=hm.get(i);
            r.execute();
        }
    }

}

