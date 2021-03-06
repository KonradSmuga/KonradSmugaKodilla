package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SalamiPizzaDecorator extends AbstractPizzaDecorator {

    public SalamiPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " + salami";
    }
}
