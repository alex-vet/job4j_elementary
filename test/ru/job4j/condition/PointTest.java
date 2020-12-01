package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point first = new Point(x1, y1);
        Point second = new Point(x2, y2);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to20then1() {
        int expected = 1;
        int x1 = 1;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point first = new Point(x1, y1);
        Point second = new Point(x2, y2);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to10then1() {
        int expected = 1;
        int x1 = 0;
        int y1 = 0;
        int x2 = 1;
        int y2 = 0;
        Point first = new Point(x1, y1);
        Point second = new Point(x2, y2);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to00then1() {
        int expected = 1;
        int x1 = 1;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        Point first = new Point(x1, y1);
        Point second = new Point(x2, y2);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void on3DWhen00to20then2() {
        double expected = 2.23;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int z1 = 1;
        int z2 = 0;
        Point first = new Point(x1, y1, z1);
        Point second = new Point(x2, y2, z2);
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void on3DWhen100to201then1dot41() {
        double expected = 1.41;
        int x1 = 1;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int z1 = 0;
        int z2 = 1;
        Point first = new Point(x1, y1, z1);
        Point second = new Point(x2, y2, z2);
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void on3DWhen002to100then2dot23() {
        double expected = 2.23;
        int x1 = 0;
        int y1 = 0;
        int x2 = 1;
        int y2 = 0;
        int z1 = 2;
        int z2 = 0;
        Point first = new Point(x1, y1, z1);
        Point second = new Point(x2, y2, z2);
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void on3DWhen100to003then3dot16() {
        double expected = 3.16;
        int x1 = 1;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int z1 = 0;
        int z2 = 3;
        Point first = new Point(x1, y1, z1);
        Point second = new Point(x2, y2, z2);
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}