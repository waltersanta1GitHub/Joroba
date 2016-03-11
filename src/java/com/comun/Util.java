package com.comun;

public class Util {

    public static String getCamello(String palabraActual) {

        StringBuilder contruyeCadena = new StringBuilder();
        boolean esMayuscula = false;

        for (int i = 0; i < palabraActual.length(); i++) {

            if (i == 0) {
                contruyeCadena.append(palabraActual.toUpperCase().charAt(i));
            } else {
                if (esMayuscula) {
                    contruyeCadena.append(palabraActual.toUpperCase().charAt(i));
                    esMayuscula = false;
                } else {
                    contruyeCadena.append(palabraActual.toLowerCase().charAt(i));
                    esMayuscula = true;
                }
            }

        }
        return contruyeCadena.toString();

    }

}
