package designpattern07_abstractfactory;

import Alton.AltonFactory;
import framework.BikeFactory;
import framework.Body;
import framework.Wheel;

public class DesignPattern07_AbstractFactory {

    public static void main(String[] args) {
        BikeFactory factory = new AltonFactory();
        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();
        System.out.println(body.getClass());
        System.out.println(wheel.getClass());
        
    }
    
}
