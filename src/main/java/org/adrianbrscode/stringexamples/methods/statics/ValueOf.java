package org.adrianbrscode.stringexamples.methods.statics;

import java.util.Arrays;
import java.util.Scanner;

public class ValueOf {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
            System.out.println("ingrese una opcion");
            System.out.println("""
                    1.  valueOf(boolean b)
                    2. 	valueOf(char c)
                    3.  valueOf(char[] data)
                    4.  valueOf(char[] data, int offset, int count)
                    5. 	valueOf(double d)
                    6. 	valueOf(float f)
                    7. 	valueOf(int i)
                    8.  valueOf(long l)
                    9.	valueOf(Object obj)
                    """);
            int op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    System.out.println("ingrese true o false");
                    boolean b = sc.nextBoolean();
                    sc.nextLine();
                    System.out.println(valueOfBoolean(b));
                    break;
                case 2:
                    System.out.println("ingresa un char (solo 1)");
                    char c = sc.nextLine().charAt(0);
                    System.out.println("char convertido a String: "+valueOfChar(c));
                    break;
                case 3:
                    char[] arrayChar = {'K','A','R','E','N'};
                    System.out.println("el arreglo de char inicial es: "+ Arrays.toString(arrayChar));
                    System.out.println(valueOfArrayChar(arrayChar));
                    break;
                case 4:
                    char[] arrayChar4 = {'X','I','M','E','N','A'};
                    System.out.println("el arreglo de char inicial es: "+ Arrays.toString(arrayChar4));
                    System.out.println("ingresa en que posicion quieres empezar a obtener la subCadena");
                    System.out.println("Ejemplo: 0="+arrayChar4[0]+", 1="+arrayChar4[1]);
                    int posInit = sc.nextInt();
                    System.out.println("ingrese cuantos caracteres desea obtener");
                    int cant = sc.nextInt();
                    System.out.println(valueOfSubArrayChar(arrayChar4,posInit,cant));
                    break;
                case 5:
                    System.out.println("ingrese un numero double");
                    double d = sc.nextDouble();
                    System.out.println("el numero double ahora es una cadena: "+valueOfDouble(d));
                    break;
                case 6:
                    System.out.println("ingrese un numero float");
                    float f = sc.nextFloat();
                    System.out.println("el numero float ahora es una cadena: "+valueOfFloat(f));
                    break;
                case 7:
                    System.out.println("ingrese un numero int");
                    int i = sc.nextInt();
                    System.out.println("el numero int ahora es una cadena: "+valueOfInt(i));
                    break;
                case 8:
                    System.out.println("ingrese un numero long");
                    long l = sc.nextLong();
                    System.out.println("el numero long ahora es una cadena: "+valueOfLong(l));
                    break;
                case 9:
                    System.out.println(valueOfObject(new ValueOf()));

                    break;
                default:
                    System.out.println("caso no existe...");
            }
    }

    //valueOf(boolean b);
    //convierte un boolean a una cadena;
    //EJEMPLO:  convierte un valor booleano (true o false) a una cadena
    //          y retorna "la cadena es <booleano> usando concat"
    public static String valueOfBoolean(boolean b){
        String cadenaBooleana = String.valueOf(b);
        return "la cadena es: ".concat(cadenaBooleana);
    }


    //valueOf(char c);
    //convierte un caracter(char) a una cadena;
    //EJEMPLO:  convierte un caracter (char) a una cadena
    //          y retorna la cadena;
    public static String valueOfChar(char caracter){
        String cadenaChar = String.valueOf(caracter);
        return cadenaChar;
    }


    //valueOf(char[] data);
    //convierte un Array de chars a una cadena;
    //EJEMPLO:  convierte un Array de caracteres (char[]) a una cadena
    //          y retorna "la cadena es: <cadenaArray>"
    public static String valueOfArrayChar(char[] array){
        String cadenaArray = String.valueOf(array);
        return "la cadena es: "+cadenaArray;
    }


    //valueOf(char[] data, int offset, int count);
    //toma un Array de chars, y selecciona una fraccion de el, y lo convierte a una cadena;
    //char[] array: array de caracteres     int offset: donde empezar       int count: cuantos tomar
    //EJEMPLO:  "Convierte una parte del arreglo de caracteres en una cadena,
    //          empezando en <offset> y tomando <count> caracteres."
    public static String valueOfSubArrayChar(char[] array, int offset, int count){
        String cadenaArray = String.valueOf(array,offset,count);
        return cadenaArray;
    }


    //valueOf(double d);
    //toma un numero double (d) y lo convierte a una cadena
    //EJEMPLO:  "Convierte un numero double a una cadena"
    public static String valueOfDouble(double d){
        String cadenaDouble = String.valueOf(d);
        return cadenaDouble;
    }

    //valueOf(float f);
    //toma un numero float (f) y lo convierte a una cadena
    //EJEMPLO:  "Convierte un numero float a una cadena"
    public static String valueOfFloat(float f){
        String cadenaFloat = String.valueOf(f);
        return cadenaFloat;
    }


    //valueOf(int i);
    //toma un numero int (i) y lo convierte a una cadena
    //EJEMPLO:  "Convierte un numero int a una cadena"
    public static String valueOfInt(int i){
        String cadenaInt = String.valueOf(i);
        return cadenaInt;
    }


    //valueOf(long l);
    //toma un numero long (l) y lo convierte a una cadena
    //EJEMPLO:  "Convierte un numero int a una cadena"
    public static String valueOfLong(long l){
        String cadenaLong = String.valueOf(l);
        return cadenaLong;
    }

    //valueOf(Object obj)
    //toma un Objeto y retornar su metodo toString\
    //si retorna null, valueOf retorna una cadena con "null"
    public static String valueOfObject(Object obj){
        String cadenaObject = String.valueOf(obj);
        return cadenaObject;
    }

    //sobreescribimos el metodo toString de esta clase para
    //probarlo en     //valueOf(Object obj)
    @Override
    public String toString() {
        return "estoy sobreescribiendo el metodo :)";
    }
}
