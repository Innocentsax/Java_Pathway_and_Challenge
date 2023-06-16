package org.example;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.Test
    void addingValues() {
        Student man = new Student();
        assertEquals(4,man.addingValues(2,2));
    }

    @org.junit.jupiter.api.Test
    void testAddingValues() {
        Student man = new Student();
        assertEquals(6, man.addingValues(2,2,2));
    }

    @org.junit.jupiter.api.Test
    void testAddingValues1() {
        Student inno = new Student();
        assertEquals(8, inno.addingValues(2,2,2,2));
    }
}