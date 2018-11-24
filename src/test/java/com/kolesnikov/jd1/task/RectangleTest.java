package com.kolesnikov.jd1.task;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void rectangleArea() throws Exception {
        assertEquals(12, new Rectangle(new Point(0, 0), new Point(3, 4)).rectangleArea());
    }

    @Test
    public void rectangleDiagonal() throws Exception {
        assertEquals(5, new Rectangle(new Point(0, 0), new Point(3, 4)).rectangleDiagonal(), 0.0);
    }
}