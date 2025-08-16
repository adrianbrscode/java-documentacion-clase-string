package org.adrianbrscode.stringexamples.methods.statics;


public class Format {
    //Devuelve una cadena formateada utilizando la cadena de formato y los argumentos especificados.
    //los formatos pueden se los siguientes:
        /*
        %d  	    byte, short, int, long	Entero decimal con signo.
        %o	        byte, short, int, long	Entero en base octal.
        %x / %X	    byte, short, int, long	Entero en hexadecimal (minúsculas / mayúsculas).
        %f	        float, double	Número de punto flotante decimal.
        %e / %E	    float, double	Notación científica (minúsculas / mayúsculas).
        %g / %G	    float, double	Usa %f o %e automáticamente, según convenga.
        %a / %A	    float, double	Notación hexadecimal para punto flotante (IEEE 754).
        %c	        char o código Unicode (int)	Un solo carácter.
        %s	        String o cualquier objeto	Cadena de texto. Si no es String, se usa toString().
        %b / %B	    Cualquier tipo	Valor booleano: true, false, o false si es null.
        %h / %H	    Cualquier tipo	Código hash en hexadecimal (hashCode()).
        %%	        Ninguno	Imprime el símbolo %.
        %n	        Ninguno	Nueva línea, independiente del sistema operativo (\n en Unix, \r\n en Windows).

        LOS MAS IMPORTANTES PUEDEN SER %d, %f
         */
    public static void main(String[] args) {
        System.out.println(ejemplo7(154));
        System.out.println(ejemplo8(154.1119));
        System.out.println(ejemplo9(154.12312561256));
        System.out.println(ejemplo10(1458));
    }

    //EJEMPLO 1 USANDO %s
    //retorna la cadena mi nombre es <nombre>
    public static String ejemplo1 (String nombre){
        return String.format("mi nombre es %s",nombre);
    }

    //EJEMPLO 2 USANDO %d
    //suma 2 numeros enteros int y retorna "<num1>+<num2>=<suma>
    public static String ejemplo2 (int num1, int num2){
        int suma = num1+num2;
        return String.format("%d+%d=%d",num1,num2,suma);
    }

    //EJEMPLO 3 USANDO %o (base octal)
    //recibe un numero por parametro, y retorna en una cadena
    //el numero pero en base octal
    public static String ejemplo3 (int num){
        return String.format("%o",num);
    }

    //EJEMPLO 4 USANDO %f
    //recibe un numero real, e imprime "el numero real es <num>"
    //el numero pero en base octal
    public static String ejemplo4 (double num){
        return String.format("el numero real es %f",num);
    }

    //LA IDEA ES QUE PONES UN %<ID>, es como decir aca va un int, double, String, etc, y al final
    //colocas las variables que se reemplazaran.


    //tambien puedes tener una especificacion adicional en cada cadena de formato
    //estructura: %[argument_index$][flags][width][.precision]conversion
    /*donde:
        [argument_index$] es el argumento que queremos seleccionar (ver ejemplo5)
        [flags] puede ser un + o nada, si agregas un mas los numeros positivos se acompanaran
                siempre de un + (ver ejemplo6)
        [width] es el ancho minimo del numero (ver ejemplo7)
        [.precision] cantidad de decimales que se quieren mostrar (no aplica para enteros) (ver ejemplo8)
        conversion es la letra o especificador, para int es d, para double es f, etc
    El ejemplo9 y 10 combina estas caracteristicas juntas
     */

    //EJEMPLO 5
    //suma 2 numeros iguales y retorna "<num1>+<num1>=<num1+num1>
    public static String ejemplo5 (int num1){
        return String.format("%1d+%1d=%2d",num1,num1+num1);
    }

    //EJEMPLO 6
    //retorna una cadena, con su signo correspondiente, si es positivo, \
    // retorna +(num) si es negativo -num
    public static String ejemplo6 (int num){
        return String.format("%+d",num);
    }

    //EJEMPLO 7
    //recibe un entero, si el numero es menor a 10 digitos rellena de 0 al inicio y retorna la cadena
    public static String ejemplo7 (int num){
        return String.format("%010d",num);
    }

    //EJEMPLO 7.1
    //recibe un entero, si el numero es menor a 10 digitos rellena con espacios al inicio y retorna la cadena
    public static String ejemplo7_1 (int num){
        return String.format("%10d",num);
    }

    //EJEMPLO 8
    //recibe un decimal double, y solo retorna el numero con 3 decimales
    public static String ejemplo8 (double num){
        return String.format("%.3f",num);
    }

    //EJEMPLO 9 con DOUBLE COMPLETO
    //recibe un decimal double, y devuelve una cadena con la siguientes condiciones
    //  -repetir un numero recibido por parametro 5 veces separado por un espacio cada 1
    //  -se debe adicionar el signo negativo o positivo
    //  -si el numero es menor a 10 digitos adicionar 0 al inicio hasta completar 10 digitos incluido el signo + o - y el punto .
    //  -solo se deben imprimir 3 numeros .decimal del numero
    public static String ejemplo9 (double num){
        return String.format("%1$+010.03f %1$+010.03f %1$+010.03f %1$+010.03f %1$+010.03f",num);
    }

    //EJEMPLO 10 con INT COMPLETO
    //recibe un entero, y devuelve una cadena con la siguientes condiciones
    //  -repetir un numero recibido por parametro 3 veces separado por un espacio cada 1
    //  -se debe adicionar el signo negativo o positivo
    //  -si el numero es menor a 10 digitos adicionar 0 al inicio hasta completar 10 digitos incluido el signo + o -
    //  OJO no se aplica en este caso [.precision] porque un entero no tiene punto decimal
    public static String ejemplo10 (int num){
        return String.format("%1$+010d %1$+010d %1$+010d ",num);
    }





}
