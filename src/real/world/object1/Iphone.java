/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.world.object1;

/**
 *
 * @author Chris
 */
public class Iphone extends Phone {            
    
    @Override
    public void getCarrier(){
        System.out.println("AT&T");
    }


    @Override
    public void dataUsage() {
        System.out.println("No data usage.");
    }

    @Override
    public void simCardId() {
        System.out.println("No sim card in phone.");
    }

   
    @Override
    public void powerOn() {
        System.out.println("device powering on...");
    }

    @Override
    public void powerOff() {
        System.out.println("device powering off");
    }

    
    
}
