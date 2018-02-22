package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(1)
                .ingredient(Bigmac.Ingredients.BACON)
                .ingredient(Bigmac.Ingredients.CHEESE)
                .ingredient(Bigmac.Ingredients.ORION)
                .sauce("spicy")
                .roll("with sesame")
                .build();
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
    }
}

