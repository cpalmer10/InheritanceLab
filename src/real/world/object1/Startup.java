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
public class Startup {
    public static void main(String[] args) {
       Iphone phone = new Iphone();
       phone.getCarrier();
       phone.powerOn();
       phone.setModel("Iphone 7");
        System.out.println(phone.getModel());
    }
}
