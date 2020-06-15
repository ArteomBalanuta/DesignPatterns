package ab.design.strategy.models;

import ab.design.strategy.behaviour.EatBehaviour;
import ab.design.strategy.behaviour.FlyBehaviour;
import ab.design.strategy.behaviour.RunBehaviour;
import ab.design.strategy.behaviour.impl.AnimalDefaultBehaviour;

public abstract class Animal {
    protected FlyBehaviour flyBehaviour = new AnimalDefaultBehaviour();
    protected RunBehaviour runBehaviour = new AnimalDefaultBehaviour();
    protected EatBehaviour eatBehaviour = new AnimalDefaultBehaviour();

    public void fly() {
        flyBehaviour.fly();
    }

    public void run() {
        runBehaviour.run();
    }

    public void eat() {
        eatBehaviour.eat();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setRunBehaviour(RunBehaviour runBehaviour) {
        this.runBehaviour = runBehaviour;
    }

    public void setEatBehaviour(EatBehaviour eatBehaviour) {
        this.eatBehaviour = eatBehaviour;
    }
}
