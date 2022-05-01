package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    @Test
    public void when00and50Then5() {
        Point first = new Point(0, 0);
        Point second = new Point(5, 0);
        double rsl = first.distance(second);
        double expected = 5;
        Assert.assertEquals(expected, rsl, 0.001);
    }

    @Test
    public void when00and40and05Then5() {
        Point first = new Point(0, 4, 0);
        Point second = new Point(0, 0, 5);
        double rsl = first.distance3d(second);
        double expected = 6.403;
        Assert.assertEquals(expected, rsl, 0.001);
    }
}