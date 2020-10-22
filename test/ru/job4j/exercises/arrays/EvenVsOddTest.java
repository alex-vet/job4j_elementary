package ru.job4j.exercises.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenVsOddTest {

    @Test
    public void whenWinOdd() {
        assertEquals(2, EvenVsOdd.whoWin(new int[] {5, 10, 4, 3}));
    }

    @Test
    public void whenWinEven() {
        assertEquals(1, EvenVsOdd.whoWin(new int[] {10, 5, 4, 3}));
    }

    @Test
    public void whenNobody() {
        assertEquals(0, EvenVsOdd.whoWin(new int[] {6, 5, 4, 5}));
    }
}