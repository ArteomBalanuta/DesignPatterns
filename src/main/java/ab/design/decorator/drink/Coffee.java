package ab.design.decorator.drink;

import ab.design.decorator.Order;

public class Coffee extends Order {
    private float cost = 12.5F;

    public Coffee() {
    }

    @Override
    public float cost() {
        return this.cost;
    }
}
