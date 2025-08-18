package org.adrianbrscode.stringexamples.methods.instance;

public class CompareTo {

    //compara 2 cadenas por orden lexicográfico (codigo UNICODE)
    //retorno: valor entero int
    //SI:
    //  int=0 -> son iguales las cadenas
    //  int>0 -> la cadena 1 es mayor a la cadena 2
    //  int<0 -> la cadena 1 es menor a la cadena 2

    //procedimiento:
    //se toman 2 cadenas y se empieza a calcular la resta entre 2 caracteres
    //de cada posicion, si la resta da distinto de 0, ese sera el valor retornado.
    //Si uno de los char se compara con un char vacio ('') el resultado sera
    //la longitud de la cadena1 - longitud de la cadena2

    public static void main(String[] args) {
        String cadena1 = "mariale";
        String cadena2 = "marta";
        String cadena3 = "martaaaaa";
        String cadena4 = "marto";

        //diferentes longitudes pero sin patron inicial
        System.out.println("---------EJEMPLO1---------");
        System.out.println("cadena1 = " + cadena1);
        System.out.println("cadena2 = " + cadena2);
        System.out.printf("i-t -> %d - %d = %d\n",(int)'i',(int)'t',(int)'i'-(int)'t');
        System.out.println("cadena1.compareTo(cadena2) = " + cadena1.compareTo(cadena2));

        //diferentes longitudes pero con patron inicial
        System.out.println("---------EJEMPLO2---------");
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena3 = " + cadena3);
        System.out.printf("i-t -> %d - %d = %d\n",cadena2.length(),cadena3.length(),cadena2.length()-cadena3.length());
        System.out.println("cadena1.compareTo(cadena2) = " + cadena2.compareTo(cadena3));

        //mismas longitudes pero con patron inicial
        System.out.println("---------EJEMPLO3---------");
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena4 = " + cadena4);
        System.out.printf("i-t -> %d - %d = %d\n",(int)'a',(int)'o',(int)'a'-(int)'o');
        System.out.println("cadena1.compareTo(cadena2) = " + cadena2.compareTo(cadena4));

    }







}
