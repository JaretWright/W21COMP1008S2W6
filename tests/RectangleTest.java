import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangle;
    private Rectangle square;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(10,20);
        square = new Rectangle(20,20);
    }

    @Test
    void getPerimeter() {
        //Rectangle is 10x20
        //perimeter is 10+20+10+20 = 60
        assertEquals(60,rectangle.getPerimeter());
    }

    @Test
    void getArea() {
        //Rectangle 10x20 -> the area = 10*20 = 200
        assertEquals(200, rectangle.getArea());
    }

    @Test
    void setLength() {
        //what's the lowest value allowed for length?
        //what's the max value for length?
        rectangle.setLength(50);
        assertEquals(50,rectangle.getLength());
    }

    @Test
    void setLengthInvalidLow() {
        //what's the lowest value allowed for length? Greater than 0
        try {
            rectangle.setLength(0);
            fail("length of 0 should have triggered an exception");
        } catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void setLengthInvalidLow2()
    {
        assertThrows(IllegalArgumentException.class, ()-> {
            rectangle.setLength(-1);
        });
    }

    @Test
    void setWidth() {
    }
}