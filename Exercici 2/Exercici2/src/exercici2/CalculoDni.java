package exercici2;

public class CalculoDni {
	
	private static final char[] LLETRES_DNI = {
	        'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 
	        'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 
	        'C', 'K', 'E'
	    };

	    public static char calcularLletra(int numeroDni) {
	        if (numeroDni < 0 || numeroDni > 99999999) {
	            throw new IllegalArgumentException("Número de DNI invàlid: ha d'estar entre 0 i 99999999");
	        }
	        int residu = numeroDni % 23;
	        return LLETRES_DNI[residu];
	    }

}
