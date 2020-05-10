package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Begin the tests");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("tests are finished");
    }
    @Before
    public void beforeTest() {
        testCounter++;
        System.out.println("Executing test number #" + testCounter);
    }
    @Test
    public void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector(new Circle());

        shapeCollector.addFigure(new Circle());

        Assert.assertEquals(1, shapeCollector.shapes.size());
    }
    @Test
    public void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector(new Circle());
        shapeCollector.addFigure(new Circle());

        shapeCollector.removeFigure(shapeCollector.shapes.get(0));

        Assert.assertEquals(0, shapeCollector.shapes.size());
    }
    @Test
    public void testGetFigure() {
        ShapeCollector shapeCollector = new ShapeCollector(new Circle());
        shapeCollector.addFigure(new Circle());

        String result = shapeCollector.getFigure(0);

        Assert.assertEquals("Circle", result);
    }
    @Test
    public void testShowFigures() {
        ShapeCollector shapeCollector = new ShapeCollector(new Circle());
        shapeCollector.addFigure(new Circle());
        shapeCollector.addFigure(new Triangle());
        shapeCollector.addFigure(new Square());

        String result = shapeCollector.showFigures();

        Assert.assertEquals("Circle Triangle Square ", result);
    }
}
