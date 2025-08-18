package org.adrianbrscode.stringexamples.methods.instance;

public class Contains {

    //devuelve un boolean si la cadena contiene una secuencia de caracteres (CharSequence)

    public static void main(String[] args) {
        String cadena = "hola mundo desde java";
        String buscar1 = "mundo de";
        String buscar2 = "karen";
        boolean contiene1 = cadena.contains(buscar1);
        boolean contiene2 = cadena.contains(buscar2);

        System.out.printf("la cadena \"%s\" contiene \"%s\": %b\n",cadena,buscar1,contiene1);
        System.out.printf("la cadena \"%s\" contiene \"%s\": %b",cadena,buscar2,contiene2);
    }

}
