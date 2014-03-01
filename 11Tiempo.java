/* 05 - VideotutorialJava
http://www.youtube.com/watch?v=KY8qkUhDk-c&list=PLUeHzPBdeXoG6yFDA79d-1wyr4Pri1GhN */

class Tiempo {
    //Usamos una única declaración de bloque main()
    public static void main (String[] args) {
        //Para convertir de Fahrenheit a Celsius        
        float fah = 86;
        System.out.println( fah + " grados Fahrenheit son . . ."); 
        //Empezamos por restar 32
        fah = fah - 32;
        //Dividimos el resultado por 9
        fah = fah / 9;
        //Multiplicamos el resultado por 5
        fah = fah * 5;
        //Resultado (\n dentro de la cadena hace un salto de linia)
        System.out.println( fah + " grados Celsius\n"); 
        
        //Para convertir de Celsius a Fahrenheit        
        float cel = 33;
        System.out.println( cel + " grados Celsius son . . ."); 
        //Empezamos por dividir entre 9
        cel = cel * 9;
        //Dividimos el resultado por 5
        cel = cel / 5;
        //Añadimos 32 al resultado
        cel = cel + 32;
        System.out.println( cel + " grados Fahrenheit"); 
    }
}
