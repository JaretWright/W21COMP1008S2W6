import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle(10);
    }

    @Test
    void getArea() {
        //formula to calculate the area of a circle with radius 10 = 3.14159 * 10 * 10
        //expected result = 314.159
        assertEquals(314.159,circle.getArea(),0.001);
    }

    @Test
    void setRadius() {
        circle.setRadius(12);
        assertEquals(12, circle.getRadius());
    }

    @Test
    void setRadiusInvalid()
    {
        assertThrows(IllegalArgumentException.class, ()-> {
            circle.setRadius(0);
        });
    }

    @Test
    void testToString() {
        //client asked for "Circle with radius 10"
        assertEquals("Circle with radius 10", circle.toString());
    }
}