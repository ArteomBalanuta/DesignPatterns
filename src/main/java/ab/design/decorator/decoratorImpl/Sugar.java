package ab.design.decorator.decoratorImpl;

import ab.design.decorator.Decorator;
import ab.design.decorator.Order;

public class Sugar extends Decorator {
    Order order;
    private float cost = 1;

    public Sugar(Order order) {
        this.order = order;
    }

    public Sugar() {
    }

    @Override
    public float cost() {
        if (order != null) {
            return this.cost + order.cost();
        }
        return this.cost;
    }
}
