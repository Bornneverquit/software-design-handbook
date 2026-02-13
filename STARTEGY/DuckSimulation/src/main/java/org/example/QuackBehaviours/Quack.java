package org.example.QuackBehaviours;

import org.example.QuackBehaviour;

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("I am Quacking");
    }
}
