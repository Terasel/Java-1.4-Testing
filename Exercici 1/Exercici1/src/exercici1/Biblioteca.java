package exercici1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
	
	private List<String> llibres;

    public Biblioteca() {
        this.llibres = new ArrayList<>();
    }

    public void afegirLlibre(String titol) {
        if (!llibres.contains(titol)) {
            llibres.add(titol);
            ordenarAlfabeticament();
        }
    }

    public List<String> getLlibres() {
        return new ArrayList<>(llibres);
    }

    public String obtenirLlibrePerPosicio(int posicio) {
        if (posicio >= 0 && posicio < llibres.size()) {
            return llibres.get(posicio);
        }
        throw new IndexOutOfBoundsException("Posició no vàlida");
    }

    public void afegirLlibreEnPosicio(String titol, int posicio) {
        if (!llibres.contains(titol)) {
            if (posicio >= 0 && posicio <= llibres.size()) {
                llibres.add(posicio, titol);
                ordenarAlfabeticament();
            } else {
                throw new IndexOutOfBoundsException("Posició no vàlida");
            }
        }
    }

    public boolean eliminarLlibre(String titol) {
        boolean eliminat = llibres.remove(titol);
        if (eliminat) {
            ordenarAlfabeticament();
        }
        return eliminat;
    }

    private void ordenarAlfabeticament() {
        Collections.sort(llibres, String.CASE_INSENSITIVE_ORDER);
    }

}
