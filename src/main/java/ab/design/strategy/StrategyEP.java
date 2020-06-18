package ab.design.strategy;

import ab.design.strategy.behaviour.EatBehaviour;
import ab.design.strategy.behaviour.impl.ElephantEatBehaviour;
import ab.design.strategy.models.Animal;
import ab.design.strategy.models.Elephant;

public class StrategyEP {
    public static void main(String[] args) {
        Animal elephant = new Elephant();
        elephant.eat();
        elephant.setEatBehaviour(new ElephantEatBehaviour());
        elephant.eat();
    }
}
