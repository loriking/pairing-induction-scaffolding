package com.thoughtworks.pairing;

import org.junit.Test;

import static org.junit.Assert.*;


public class MyTest {

    @Test
    public void myFirstTest() {

        MyClass x = new MyClass();

        assertEquals(5, x.sum(2,3));
    }
}
