package com.kodilla.testing.shape;


import org.junit.*;



public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();


        //When

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        //Then
        Assert.assertEquals(circle, shapeCollector.figures.get(0));
        Assert.assertEquals(triangle, shapeCollector.figures.get(1));
        Assert.assertEquals(square, shapeCollector.figures.get(2));
    }

    @Test
    public void testRemoveFigure() {
        //Given

        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();
        Shape square1 = new Square();

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(square1);

        //When
        shapeCollector.removeFigure(circle);
        System.out.println(shapeCollector.figures.size());
        shapeCollector.removeFigure(triangle);
        shapeCollector.removeFigure(square);
        shapeCollector.removeFigure(square1);
        System.out.println(shapeCollector.figures.size());

        //Then
        Assert.assertEquals(0, shapeCollector.figures.size());

    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        //Then

        Assert.assertEquals(circle, shapeCollector.getFigure(0));

    }
}