package org.adrianbrscode.stringexamples.methods.statics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Join {

    /*
    String.join() es un metodo estático de la clase String que se utiliza para concatenar
    elementos de una coleccion o un arreglo de objetos que implementan la interfaz CharSequence
    (como String, StringBuilder, StringBuffer, etc.). El metodo toma estos elementos y los une
    en una sola cadena, usando un separador entre cada elemento.
     */
    public static void main(String[] args) {
        String[] arrayCadena = {"adrian","penaloza","ortega"};
        System.out.println("arreglo inicial ");
        System.out.println(Arrays.asList(arrayCadena));

        System.out.println("separando el array con un guion (-)");
        System.out.println(joinArray("-",arrayCadena));
        System.out.println("------------------------------------------");
        System.out.println("usando argumentos multiples (String... argumentos)");
        System.out.println(joinMultiplesArgumentos(": ","adrian","andrea", "ronaldo"));

        System.out.println("-------------------------------------------------");
        System.out.println("usando una coleccion");
        ArrayList<String> arrayListAnimales = new ArrayList<>(List.of("perro","gato", "toro"));
        System.out.println(joinArray("_",arrayListAnimales));


    }

    //join(CharSequence delimiter, CharSequence... elements)
    //toma un conjunto de elementos de Strings, y los convierte en una sola cadena
    //separadas por un delimitador
    //parametros:
    //  CharSequence delimiter: delimitador
    //  CharSequence... elements: conjunto de elementos de String
    //EJEMPLO1:  Dado un arreglo String[] retorna una cadena
    //          delimitando cada cadena del String[] con un guion(-)
    public static String joinArray(String delimiter, String[] elements ){
        String cadenaJoin = String.join("-",elements);
        return cadenaJoin;
    }

    //EJEMPLO2:  recibe varios argumentos tipo String, y retorna una cadena
    //          que una todos esos argumentos separados por (": ")
    public static String joinMultiplesArgumentos(String delimiter, String... argumentos){
        String cadenaJoin = String.join(delimiter,argumentos);
        return cadenaJoin;
    }


    //join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
    //Unir colecciones de CharSequence en una cadena con un delimitador entre los elementos.
    //Trabaja con colecciones como List, Set, Queue, etc.
    //parametros:
    //  CharSequence delimiter: delimitador
    //  Iterable<? extends CharSequence> elements: es la coleccion
    //EJEMPLO1:  Dado un ArrayList<String> retorna una cadena con toda la informacion
    //          delimitando con un guion al piso (_)
    public static String joinArray(String delimiter, ArrayList<String> elements){
        String cadenaJoin = String.join("_",elements);
        return cadenaJoin;
    }


}
