package ab.design.strategy.behaviour.impl;

import ab.design.strategy.behaviour.EatBehaviour;
import ab.design.strategy.behaviour.FlyBehaviour;
import ab.design.strategy.behaviour.RunBehaviour;

import static java.lang.System.out;

public class AnimalDefaultBehaviour implements EatBehaviour, FlyBehaviour, RunBehaviour {
    public void eat() {
        out.println("default animal eating..");
    }

    public void run() {
        out.println("default animal run..");
    }

    public void fly() {
        out.println("default animal fly..");
    }
}
