package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(7, 4, 2);
        assertThat(result, is(7));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenAllEquals() {
        int result = MultiMax.max(5, 5, 5);
        assertThat(result, is(5));
    }
}