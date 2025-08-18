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
        System.out.printf("la cadena \"%s\" contiene \"%s\": %b\n",cadena,buscar2,contiene2);

        System.out.println("--------------ejemplo con StringBuilder--------------");
        StringBuilder sb = new StringBuilder("hola mundo");
        boolean contiene3 = ejemplo1(cadena,sb);
        System.out.printf("la cadena \"%s\" contiene \"%s\": %b\n",cadena,sb,contiene3);
        System.out.println("--------------ejemplo con CharSequence--------------");
        CharSequence secuenciaChar = "desde java";
        boolean contiene4 = ejemplo2(cadena,secuenciaChar);
        System.out.printf("la cadena \"%s\" contiene \"%s\": %b\n",cadena,secuenciaChar,contiene4);
        //como el metodo es generico podriamos recibir un String, StringBuilder, o cualquier clase
        //que implemente la interface CharSequence

        //usando StringBuilder
        boolean contiene5 = ejemplo2(cadena,sb);
        System.out.printf("la cadena \"%s\" contiene \"%s\": %b\n",cadena,sb,contiene5);

        //usando String
        boolean contiene6 = ejemplo2(cadena,buscar1);
        System.out.printf("la cadena \"%s\" contiene \"%s\": %b\n",cadena,buscar1,contiene6);


    }

    //como recibe un CharSequence puede buscarse otra cosa que no sea un String, como un StringBuilder,
    //StringBuffer, los cuales son clases que implementan la interface CharSequence
    public static boolean ejemplo1 (String cadena, StringBuilder sb){
        return cadena.contains(sb);
    }

    //se podria recibir tambien un CharSequence y tendriamos un metodo que podria recibir cualquier
    //objeto de una clase que implemente la interface CharSequence
    public static boolean ejemplo2 (String cadena, CharSequence cs){
        return cadena.contains(cs);
    }


}
