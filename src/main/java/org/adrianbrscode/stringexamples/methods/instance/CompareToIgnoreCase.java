package org.adrianbrscode.stringexamples.methods.instance;

public class CompareToIgnoreCase {

    //revisar clase CompareTo para entender para que funciona este metodo

    //funciona igual que CompareTo pero con la caracteristica de que en este caso
    //las mayusculas y minusculas las va a tratar igual

    public static void main(String[] args) {
        //en este ejemplo abordaremos diferencia entre CompareTo y CompareToIgnoreCase
        String cadena1 = "karen";
        String cadena2 = "KaReN";

        //diferentes longitudes pero sin patron inicial
        System.out.println("--------con compareTo--------");
        System.out.println("cadena1 = " + cadena1);
        System.out.println("cadena2 = " + cadena2);
        System.out.printf("k-K -> %d - %d = %d\n",(int)'k',(int)'K',(int)'k'-(int)'K');
        System.out.println("cadena1.compareTo(cadena2) = " + cadena1.compareTo(cadena2));


        //diferentes longitudes pero sin patron inicial
        System.out.println("--------con compareToIgnoreCase--------");
        System.out.println("cadena1 = " + cadena1);
        System.out.println("cadena2 = " + cadena2);
        System.out.printf("k-K -> %d - %d = %d\n",(int)'k',(int)'K',(int)'k'-(int)'K');
        System.out.println("cadena1.compareTo(cadena2) = " + cadena1.compareToIgnoreCase(cadena2));



    }

}
