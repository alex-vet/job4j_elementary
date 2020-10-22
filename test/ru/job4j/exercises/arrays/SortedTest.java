package ru.job4j.exercises.arrays;

import org.junit.Test;
import ru.job4j.exercises.arrays.Sorted;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortedTest {
    @Test
    public void whenSorted() {
        assertThat(
                Sorted.isSorted(
                        new int[] {1, 2, 3}
                ),
                is(true)
        );
    }

    @Test
    public void whenNotSorted() {
        assertThat(
                Sorted.isSorted(
                        new int[] {1, 3, 2}
                ),
                is(false)
        );
    }
}