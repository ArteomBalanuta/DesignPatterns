package ab.design.strategy.behaviour.impl;

import ab.design.strategy.behaviour.FlyBehaviour;

import static java.lang.System.out;

public class NonBirdsFlyBehaviour implements FlyBehaviour {
    @Override
    public void fly() {
        out.println("Can not fly");
    }
}
