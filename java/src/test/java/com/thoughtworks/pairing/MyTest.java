package com.thoughtworks.pairing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyTest {

    @Test
    public void myFirstTest() {
        MyClass x = new MyClass();
        assertEquals(5, x.sum(2,3));
    }
}
