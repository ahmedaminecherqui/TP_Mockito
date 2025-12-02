package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdditionneurTest {

    @Test
    void testAddReal() {
        IAddition additionneur = new Additionneur();

        int result = additionneur.add(10, 20);

        assertEquals(30, result);
    }
}
