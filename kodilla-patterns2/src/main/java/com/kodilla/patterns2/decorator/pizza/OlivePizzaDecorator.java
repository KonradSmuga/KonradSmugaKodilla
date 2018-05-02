package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class OlivePizzaDecorator extends AbstractPizzaDecorator {
    public OlivePizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(3));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " with black olive";
    }
}
