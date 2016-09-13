/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realworld1abstract;

/**
 *
 * @author Chris
 */
public abstract class Machine {
    private String powerOn;
    private String powerOff;

    public String getPowerOn() {
        return powerOn;
    }

    public void setPowerOn(String powerOn) {
        this.powerOn = powerOn;
    }

    public String getPowerOff() {
        return powerOff;
    }

    public void setPowerOff(String powerOff) {
        this.powerOff = powerOff;
    }
    
    
    public abstract double sendBytes();
    public abstract double recieveBytes();
}
