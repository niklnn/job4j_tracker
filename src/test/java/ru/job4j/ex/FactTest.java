package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenNIsLessThan0() {
        new Fact().calc(-2);
    }

    @Test
    public void when3Than6() {
        int rsl = new Fact().calc(3);
        assertThat(rsl, is(6));
    }
}