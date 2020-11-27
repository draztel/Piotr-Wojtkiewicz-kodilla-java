package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PizzaOrderTest {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String description = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals("Pizza with tomato sauce + cheese", description);
    }

    @Test
    public void testBasicPizzaOrderWithCheeseBaconCornTomatoGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new BaconDecorator(pizzaOrder);
        pizzaOrder = new CornDecorator(pizzaOrder);
        pizzaOrder = new TomatoDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getCost());
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(33), theCost);
    }

    @Test
    public void testBasicPizzaOrderWithCheeseBaconCornTomatoGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new BaconDecorator(pizzaOrder);
        pizzaOrder = new CornDecorator(pizzaOrder);
        pizzaOrder = new TomatoDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getDescription());
        //When
        String description = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals("Pizza with tomato sauce + cheese + cheese + bacon + corn + tomato", description);
    }

    @Test
    public void testBasicPizzaOrderWithGarlicSauceMushroomsGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new GarlicSauceDecorator(pizzaOrder);
        pizzaOrder = new MushroomDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getCost());
        //When
        BigDecimal getCost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(22), getCost);
    }

    @Test
    public void testBasicPizzaOrderWithGarlicSauceMushroomsGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new GarlicSauceDecorator(pizzaOrder);
        pizzaOrder = new MushroomDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getDescription());
        //When
        String description = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals("Pizza with tomato sauce + cheese + garlic sauce + mushrooms", description);
    }
}
