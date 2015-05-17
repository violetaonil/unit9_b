package unit9_b.unit9_b;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
* Práctica 2 - unit9
* @author Violeta Feliciano
* El primer if no puede obtener un 100% en ramas porque en el momento que el String nif es diferente de 9 ya devuelve false y no hace falta probar que sea nulo.
*/
public class Alumno {
	
	 public boolean validaNif(String nif) {
		 if (nif.length() != 9 || nif == null) { 
			 	return false;
		 } 
		 String dni = nif.substring(0, 8);
		 char letra = nif.charAt(8);
		 Pattern pattern = Pattern.compile("[0-9]{8,8}");
		 Matcher matcher = pattern.matcher(dni);
		 String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		 long ldni = 0;
		 try {
			 ldni = Long.parseLong(dni);
		 } catch (NumberFormatException e) {
			 return false;
		 }
		 int indice = (int) (ldni % 23);
		 char letraEsperada = letras.charAt(indice);
		 return matcher.matches() && letra == letraEsperada;
	 }
	 
	 public float calculaTasaMatricula(int edad, boolean familiaNumerosa, boolean repetidor) {
		 float tasa = 500.00f;
		 if ((edad < 25) && (!familiaNumerosa) && (repetidor)) {
			 	tasa = tasa + 1500.00f;
		 } else {
			 if ((familiaNumerosa) || (edad >= 65)) {
				 	tasa = tasa / 2;
			 }
			 if ((edad > 50) && (edad < 65)) {
				 	tasa = tasa - 100.00f;
			 }
		 }
		 return tasa;
	 }
}

