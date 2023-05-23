package co.edu.uniquindio.concesionariouq.util;

import java.security.SecureRandom;

public class Utility {
	public static String crearCodigoRandomAlfaNumerico(int tam) {
		SecureRandom secureRandom = new SecureRandom();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < tam; i++) {
			final int num = secureRandom.nextInt('Z' - 'A' + 1 + 10);
			builder.append(num < 10 ? num : String.valueOf((char) ('A' + num - 10)));
		}
		return builder.toString();
	}
}
