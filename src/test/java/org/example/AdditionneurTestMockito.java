package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class AdditionneurTestMockito {

    @Test
    void testAddWithMockito() {
        // Create the mock
        IAddition mockAdd = mock(IAddition.class);

        // Define behavior
        when(mockAdd.add(10, 20)).thenReturn(30);

        // Call method
        int result = mockAdd.add(10, 20);

        // Verify result
        assertEquals(30, result);

        // Verify method invocation
        verify(mockAdd).add(10, 20);
    }
}

