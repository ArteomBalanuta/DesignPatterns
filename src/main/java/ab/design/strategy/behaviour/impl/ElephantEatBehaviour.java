package ab.design.strategy.behaviour.impl;

import ab.design.strategy.behaviour.EatBehaviour;

import static java.lang.System.out;

public class ElephantEatBehaviour implements EatBehaviour {
    @Override
    public void eat() {
        out.println("Elephant eating..");
    }
}
