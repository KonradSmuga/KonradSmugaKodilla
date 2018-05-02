package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PineapplePizzaDecorator extends AbstractPizzaDecorator {
    public PineapplePizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(6));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription()+ " + pineapple";
    }
}
