package org.example;

import org.example.FlyBehaviours.FlyNoWay;
import org.example.QuackBehaviours.MuteQuack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
