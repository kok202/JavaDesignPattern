package designpattern16_state;

public class Light {
    State lightStateOn = new StateOn();
    State lightStateOff = new StateOff();
    State lightState = lightStateOn;
    
    public void turnOn(){
        lightState.on();
        lightState = lightStateOn;
    }
    
    public void turnOff(){
        lightState.off();
        lightState = lightStateOff;
    }
}
