package com.epi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.epi.Stacks.Stack;

public class StacksTest {
    private Stacks stacks;
    @Before
    public void setup() {
        stacks = new Stacks();
    }

    @Test
    public void stackWithMaxAPI() {
        var s = new Stack<Integer>();
        s.push(10);
        s.push(80);
        s.push(2);
        s.push(13);
        s.push(30);
        final Integer expected = 80;
        final Integer actual = s.max();
        Assert.assertEquals(expected, actual);
    }
}