package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.AggresivePredictor;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTestSuite {
    @Test
    public void testDefaultInvestingStrategy() {
        Customer steven = new IndividualCustomer("Steven links");
        Customer john = new IndividualYoungCustomer("John Hemerald");
        Customer kodilla = new CorporateCustomer("Kodilla");

        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " + stevenShouldBuy);
        String johnShouldBuy = john.predict();
        System.out.println("John should: " + johnShouldBuy);
        String kodillaShouldBuy = kodilla.predict();
        System.out.println("Kodilla should: " + kodillaShouldBuy);

        Assert.assertEquals("[Conservative predictor] Buy debentures of XYZ", stevenShouldBuy);
        Assert.assertEquals("[Aggressive predictor] Buy stock of XYZ", johnShouldBuy);
        Assert.assertEquals("[Balanced predictor] Buy shared units of Fund XYZ", kodillaShouldBuy);
    }

    @Test
    public void testIndividualInvestingStrategy() {
        //Given
        Customer steven = new IndividualCustomer("Steven Links");

        //When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " + stevenShouldBuy);
        steven.setBuyingStrategy(new AggresivePredictor());
        stevenShouldBuy = steven.predict();

        //Then
        Assert.assertEquals("[Aggressive predictor] Buy stock of XYZ", stevenShouldBuy);
    }
}

