package ab.design.decorator.drink;

import ab.design.decorator.Order;

public class Tea extends Order {
    private float cost = 3.5F;

    public Tea() {
    }

    @Override
    public float cost() {
        return this.cost;
    }
}
