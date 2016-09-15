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
public abstract class Phone implements Device{
    private String model;
    private int storage;

    public final String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()){
            System.out.println("Invalid entry.");
        } else {
            this.model = model;
        }        
    }

    public final int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
    
    public abstract void getCarrier();
    public abstract void dataUsage();
    public abstract void simCardId();
}
