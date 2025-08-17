package org.adrianbrscode.stringexamples.methods.statics;

import javax.swing.*;

public class CopyValueOf {


    public static void main(String[] args) {
        char [] data = {'h','o','l','a',' ','m','u','n','d','o'};
        System.out.println("ejemplo1(data) = " + ejemplo1(data));

        System.out.println("ejemplo2(data,3,5) = " + ejemplo2(data,3,5));
    }

    //sirve para convertir un arreglo de chars en un String.

    //ejemplo1
    //convierte un char[] en un String
    public static String ejemplo1 (char[] arrayChar){
        return String.copyValueOf(arrayChar);
    }

    //tambien puedes proporcionar 2 parametros mas que son offset && count
    //offset    ->  desde que posicion vas a tomar
    //count     ->  cantidad que vas a tomar

    //ejemplo2
    //convierte solo una parte del char[] en un String
    public static String ejemplo2 (char[] arrayChar, int offset, int count){
        return String.copyValueOf(arrayChar, offset, count);
    }



}
