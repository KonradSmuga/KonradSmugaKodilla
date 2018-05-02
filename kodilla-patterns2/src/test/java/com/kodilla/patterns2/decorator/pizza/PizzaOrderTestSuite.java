package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testAbstractPizzaGetPrice() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder() {
        };

        //When
        BigDecimal price = pizzaOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(15), price);
    }

    @Test
    public void testAbstractPizzaGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        String description = pizzaOrder.getPizzaDescription();

        //Then
        assertEquals("Basic Pizza with chesse and tomato sauce", description);
    }

    @Test
    public void testOlivePizzaGetPrice() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new OlivePizzaDecorator(pizzaOrder);

        //When
        BigDecimal price = pizzaOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(18), price);
    }

    @Test
    public void testOlivePizzaGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new OlivePizzaDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getPizzaDescription();
        //Then
        assertEquals("Basic Pizza with chesse and tomato sauce + black olive", description);
    }

    @Test
    public void testAdditionalChessePrice() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);

        //When
        BigDecimal price = pizzaOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(20), price);
    }

    @Test
    public void testAdditionalChesseDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getPizzaDescription();
        //Then
        assertEquals("Basic Pizza with chesse and tomato sauce with additional cheese", description);
    }

    @Test
    public void testPineapplePizzagetPrice() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PineapplePizzaDecorator(pizzaOrder);

        //When
        BigDecimal price = pizzaOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(21), price);
    }

    @Test
    public void testPinapplePizzaGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PineapplePizzaDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getPizzaDescription();
        //Then
        assertEquals("Basic Pizza with chesse and tomato sauce + pineapple", description);
    }

    @Test
    public void testSalamiPizzagetPrice() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiPizzaDecorator(pizzaOrder);

        //When
        BigDecimal price = pizzaOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(19), price);
    }

    @Test
    public void testSalamiPizzaGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiPizzaDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getPizzaDescription();
        //Then
        assertEquals("Basic Pizza with chesse and tomato sauce + salami", description);
    }

    @Test
    public void testSalamiAndPineapplePizzaGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiPizzaDecorator(pizzaOrder);
        pizzaOrder = new PineapplePizzaDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getPizzaDescription();
        //Then
        assertEquals("Basic Pizza with chesse and tomato sauce + salami + pineapple", description);
    }
    @Test
    public void testSalamiAndPineapplePizzagetPrice() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiPizzaDecorator(pizzaOrder);
        pizzaOrder = new PineapplePizzaDecorator(pizzaOrder);
        //When
        BigDecimal price = pizzaOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(25), price);
    }
}