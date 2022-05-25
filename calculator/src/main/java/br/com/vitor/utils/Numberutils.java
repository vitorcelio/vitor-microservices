package br.com.vitor.utils;

public class Numberutils {
	public static boolean isNumeric(String strNumero) {
		if(strNumero == null) return false;
		String numero = strNumero.replaceAll(",", ".");
		return numero.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
	public static Double converteDouble(String strNumero) {
		if(strNumero == null) return 0d;
		String numero = strNumero.replaceAll(",", ".");
		if(isNumeric(numero)) return Double.parseDouble(numero);
		return 0d;
	}
}
