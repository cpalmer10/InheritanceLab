/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realworld1interface;

/**
 *
 * @author Chris
 */
public abstract class Computer implements Machine {
    private String make;
    private String model;
    private String typeOf;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeOf() {
        return typeOf;
    }

    public void setTypeOf(String typeOf) {
        this.typeOf = typeOf;
    }
    
    
    @Override
    public double sendBytes() {
        return 0;
    }

    @Override
    public double recieveBytes() {
        return 0;
    }
    
}
