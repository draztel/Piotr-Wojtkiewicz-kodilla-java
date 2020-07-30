package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Normal")
                .burgers(2)
                .sauce("Ketchup")
                .ingredient("Mushrooms")
                .ingredient("Chilli")
                .ingredient("Onion")
                .build();

        System.out.println(bigmac);

        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String whatBun = bigmac.getBun();
        String whatSauce = bigmac.getSauce();

        Assert.assertEquals(3,howManyIngredients);
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals("Normal", whatBun);
        Assert.assertEquals("Ketchup", whatSauce);
    }
}
