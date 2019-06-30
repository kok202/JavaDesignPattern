package Alton;

import framework.BikeFactory;
import framework.Body;
import framework.Wheel;

public class AltonFactory implements BikeFactory{

    @Override
    public Body createBody() {
        return new AltonBody();
    }

    @Override
    public Wheel createWheel() {
        return new AltonWheel();
    }
    
}
