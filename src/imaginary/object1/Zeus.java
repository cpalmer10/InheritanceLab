/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginary.object1;

/**
 *
 * @author Chris
 */
public class Zeus extends MythicalFigure{
    private String callThunder;
    private String transform;

    public String getCallThunder() {
        return callThunder;
    }

    public void setCallThunder(String callThunder) {
        this.callThunder = callThunder;
    }

    public String getTransform() {
        return transform;
    }

    public void setTransform(String transform) {
        this.transform = transform;
    }
    
    
    @Override
    public void usePower() {
        System.out.println("Zeus called thunder!");
    }
}
