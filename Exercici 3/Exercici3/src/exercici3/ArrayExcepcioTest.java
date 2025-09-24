package exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayExcepcioTest {

	@Test
    public void testArrayIndexOutOfBoundsException() {
        ArrayExcepcio arrayExemple = new ArrayExcepcio();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            arrayExemple.getElement(10);
        });
    }

}
