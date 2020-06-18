package ab.design.decorator;

import ab.design.decorator.decoratorImpl.Milk;
import ab.design.decorator.decoratorImpl.Sugar;
import ab.design.decorator.drink.Coffee;
import ab.design.decorator.drink.Tea;

public class DecoratorEP {
    public static void main(String[] args) {
        Sugar sugar = new Sugar();
        Milk milk = new Milk();

        Order coffee = new Coffee();
        Order coffeeWithSugar = new Sugar(coffee);
        Order coffeeWithSugarAndMilk = new Milk(coffeeWithSugar);

        Order tea = new Tea();
        Order teaWithSugar = new Sugar(tea);

        System.out.println("Coffee cost: " + coffee.cost());
        System.out.println("Tea cost: " + tea.cost());

        System.out.println("Sugar cost: " + sugar.cost());
        System.out.println("Milk cost: " + milk.cost());

        System.out.println("Coffee cost: " + coffee.cost());

        System.out.println("Coffee cost with sugar: " + coffeeWithSugar.cost());
        System.out.println("Coffee cost with sugar and milk: " + coffeeWithSugarAndMilk.cost());

        System.out.println("Tea cost: " + tea.cost());

        System.out.println("Tea with sugar cost: " + teaWithSugar.cost());
    }
}
