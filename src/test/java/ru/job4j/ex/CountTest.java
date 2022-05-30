package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CountTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenStartGreaterThenFinish() {
        Count.add(5, 3);
    }

    @Test
    public void when0to3then3() {
        int rsl = Count.add(0, 3);
        assertThat(rsl, is(3));
    }
}