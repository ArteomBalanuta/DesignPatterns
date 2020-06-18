package ab.design.decorator.decoratorImpl;

import ab.design.decorator.Decorator;
import ab.design.decorator.Order;

public class Milk extends Decorator {
    Order order;
    private float cost = 3;

    public Milk(Order order) {
        this.order = order;
    }

    public Milk() {
    }

    @Override
    public float cost() {
        if (order != null) {
            return this.cost + order.cost();
        }
        return this.cost;
    }
}
