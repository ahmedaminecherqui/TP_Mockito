package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class CalculatriceAireTest {

    List<IForme> formes = Arrays.asList(
            new Cercle(2.0),
            new Rectangle(2, 4)
    );

    @Test
    void testAire() {
        assertEquals(20.56, CalculatriceAire.aire(formes), 0.01);
    }
}
