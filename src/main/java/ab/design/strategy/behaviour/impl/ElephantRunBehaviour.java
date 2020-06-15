package ab.design.strategy.behaviour.impl;

import ab.design.strategy.behaviour.FlyBehaviour;
import ab.design.strategy.behaviour.RunBehaviour;

import static java.lang.System.out;

public class ElephantRunBehaviour implements RunBehaviour {
    @Override
    public void run() {
        out.println("Slowly running..");
    }
}
