package com.kodilla.patterns.builder.bigmac;

import com.sun.org.apache.bcel.internal.generic.SALOAD;
import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(1)
                .ingredient(String.valueOf(Bigmac.Ingredients.BACON))
                .ingredient(String.valueOf(Bigmac.Ingredients.ORION))
                .ingredient(String.valueOf(Bigmac.Ingredients.CHILLI))
                .sauce("spicy")
                .roll("with sesame")
                .build();
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
    }
}

