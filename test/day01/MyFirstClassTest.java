package day01;

import static org.junit.jupiter.api.Assertions.*;

class MyFirstClassTest {

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(4, MyFirstClass.add(2, 2));
    }
}