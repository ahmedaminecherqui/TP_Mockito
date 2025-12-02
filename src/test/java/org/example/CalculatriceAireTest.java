package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class CalculatriceAireTest {

    List<IForme> formes = Arrays.asList(
            new Cercle(2.0),
            new Rectangle(2, 4)
    );

    @Test
    void testAire() {
        List<IForme> formes = Arrays.asList(
                new Cercle(2.0),       // aire = 12.56
                new Rectangle(2, 4)    // aire = 8
        );

        assertEquals(20.56, CalculatriceAire.aire(formes), 0.01);
    }

    @Test
    void testAireCarreAvecMockito() {
        // Mock de IForme (simule un carré)
        IForme carre = Mockito.mock(IForme.class);

        // Comportement attendu : aire = 4
        Mockito.when(carre.aire()).thenReturn(4.0);

        // Calcul
        List<IForme> formes = Arrays.asList(carre);
        double resultat = CalculatriceAire.aire(formes);

        // Vérification du résultat
        assertEquals(4.0, resultat, 0.01);

        // Vérifier que la méthode aire() a été appelée
        Mockito.verify(carre).aire();
    }


}
