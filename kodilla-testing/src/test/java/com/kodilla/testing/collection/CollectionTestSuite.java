package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import static org.junit.Assert.assertArrayEquals;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: begin");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        int result = exterminator.numbers.size();
        System.out.println("Testing " + result);

        Assert.assertEquals(0, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        exterminator.numbers.add(2);
        exterminator.numbers.add(3);
        exterminator.exterminate(exterminator.numbers);

        int result = exterminator.numbers.size();
        System.out.println("Testing" + result);

        Assert.assertEquals(1, result);
    }
}
