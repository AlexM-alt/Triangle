package data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class TriangleTest {


    @Test
    void getTriangleTypeEquilateral() {
        assertEquals("equilateral",new Triangle(6,6,6).getType());
    }

    @Test
    void getTriangleTypeIsosceles() {
        assertEquals("isosceles",new Triangle(5,2,5).getType());
        assertEquals("isosceles",new Triangle(7,7,1).getType());
    }

    @Test
    void getTriangleTypeScalane() {
        Triangle first = new Triangle(2,3,4);
        Triangle second = new Triangle(4,5,7);
    }
}
