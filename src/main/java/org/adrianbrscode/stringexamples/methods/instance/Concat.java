package org.adrianbrscode.stringexamples.methods.instance;

public class Concat {

    //une 2 cadenas, es decir concatena 2 cadenas
    //en lugar de hacer un A+B puedes hacer A.concat(B);

    public static void main(String[] args) {
        String cadenaA = "hola";
        String cadenaB = "Mundo";
        String cadenaAB1;
        String cadenaAB2;
        //manera clasica

        cadenaAB1 = cadenaA + cadenaB;
        System.out.println("A+B = " + cadenaAB1);

        //manera concat
        cadenaAB2 = cadenaA.concat(cadenaB);
        System.out.println("A.concat(b) = " + cadenaAB2);

    }

}
