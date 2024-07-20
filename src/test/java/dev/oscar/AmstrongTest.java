package dev.oscar;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AmstrongTest {
       @Test
    public void testNumberArmstrong() {
        assertTrue(Amstrong.isNumberAmstrong(371));
       
    }

    @Test
    public void testIsNotNumberArmstrong() {
        assertFalse(Amstrong.isNumberAmstrong(123));
       
    }
}
