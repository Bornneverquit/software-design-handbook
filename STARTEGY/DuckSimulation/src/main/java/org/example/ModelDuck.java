package org.example;

import org.example.FlyBehaviours.FlyNoWay;
import org.example.QuackBehaviours.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    public void display(){
        System.out.println("I'm a model duck");
    }
}
