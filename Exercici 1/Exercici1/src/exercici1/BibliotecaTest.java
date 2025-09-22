package exercici1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

class BibliotecaTest {

	 private Biblioteca biblioteca;
	 
	 @BeforeEach
	    void testSetup() {
	        biblioteca = new Biblioteca();
	    }
	 
	 @Test
	    void testLlistaNoNula() {
	        assertNotNull(biblioteca.getLlibres());
	    }
	 
	 @Test
	    void testMidaDespresAfegir() {
	        biblioteca.afegirLlibre("Last Flight");
	        biblioteca.afegirLlibre("The Stolen Throne");
	        biblioteca.afegirLlibre("The Masked Empire");
	        biblioteca.afegirLlibre("The Fires of Heaven");
	        biblioteca.afegirLlibre("Lord of Chaos");
	        assertEquals(5, biblioteca.getLlibres().size());
	    }
	 
	 @Test
	    void testContingutPosicio() {
	        biblioteca.afegirLlibre("Tevinter Nights");
	        biblioteca.afegirLlibre("The Calling");
	        biblioteca.afegirLlibre("Asunder");
	        biblioteca.afegirLlibre("A Crown of Swords");
	        biblioteca.afegirLlibre("The Path of Daggers");

	        List<String> llista = biblioteca.getLlibres();
	        assertEquals("A Crown of Swords", llista.get(0));
	    }
	 
	 @Test
	    void testNoDuplicats() {
	        biblioteca.afegirLlibre("The Darkness That Comes Before");
	        biblioteca.afegirLlibre("The Darkness That Comes Before");
	        assertEquals(1, biblioteca.getLlibres().size());
	    }
	 
	 @Test
	    void testObtenirLlibrePerPosicio() {
	        biblioteca.afegirLlibre("The Warrior Prophet");
	        biblioteca.afegirLlibre("The Thousandfold Thought");
	        biblioteca.afegirLlibre("Winter's Heart");

	        String titol = biblioteca.obtenirLlibrePerPosicio(0);
	        assertNotNull(titol);
	        assertEquals("The Thousandfold Thought", titol);
	    }
	 
	 @Test
	    void testAfegirPosicioModificaLlista() {
	        biblioteca.afegirLlibre("The Judging Eye");
	        biblioteca.afegirLlibre("Crossroads of Twilight");
	        biblioteca.afegirLlibre("Knife of Dreams");
	        biblioteca.afegirLlibreEnPosicio("The White-Luck Warrior", 0);

	        List<String> llista = biblioteca.getLlibres();
	        assertTrue(llista.contains("The White-Luck Warrior"));
	        assertTrue(llista.contains("The Judging Eye"));
	        assertTrue(llista.contains("Crossroads of Twilight"));
	        assertTrue(llista.contains("Knife of Dreams"));
	        assertEquals(4, llista.size());
	    }
	 
	 @Test
	    void testEliminarDisminueixMida() {
	        biblioteca.afegirLlibre("The Unholy Consult");
	        biblioteca.afegirLlibre("The Eye of The World");
	        biblioteca.afegirLlibre("The Gathering Storm");
	        biblioteca.eliminarLlibre("The Eye of The World");

	        assertEquals(2, biblioteca.getLlibres().size());
	        assertFalse(biblioteca.getLlibres().contains("The Eye of The World"));
	    }
	 
	 @Test
	    void testLlistaOrdenadaAlfabeticament() {
	        biblioteca.afegirLlibre("The Great Hunt");
	        biblioteca.afegirLlibre("The Dragon Reborn");
	        biblioteca.afegirLlibre("The Shadow Rising");
	        biblioteca.afegirLlibre("Towers of Midnight");
	        biblioteca.afegirLlibre("A Memory of Light");

	        List<String> llista = biblioteca.getLlibres();
	        assertEquals(List.of("A Memory of Light", "The Dragon Reborn", "The Great Hunt", "The Shadow Rising", "Towers of Midnight"), llista);
	    }

}
