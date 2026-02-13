package org.example.QuackBehaviours;

import org.example.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("<<silence>>");
    }
}
