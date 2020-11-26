package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5To1Then5() {
        int result = Max.max(5, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax3To3Then3() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax4To2To6Then6() {
        int result = Max.max(4, 2, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax3To3To1To2Then3() {
        int result = Max.max(3, 3, 1, 2);
        assertThat(result, is(3));
    }
}