package org.adrianbrscode.stringexamples.methods.instance;

public class CharAt {

    //captura un caracter especifico de una cadena informando la posicion
    //los caracteres se cuentan de 0

    public static void main(String[] args) {
        String cadena1 = "0123456789";
        char x1 = cadena1.charAt(3); //return '3'
        System.out.println(x1);

        String cadena2 = "hola mundo";
        char x2 = cadena2.charAt(6); //return 'u'
        System.out.println(x2);
    }


}
