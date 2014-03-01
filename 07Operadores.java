/* 05 - VideotutorialJava
http://www.youtube.com/watch?v=KY8qkUhDk-c&list=PLUeHzPBdeXoG6yFDA79d-1wyr4Pri1GhN */

class Operadores {
    public static void main(String[ ] args) {
        //los operadores son: + - * / %
        //suma +
        int suma = 123;
        suma = suma+10;
        System.out.println(suma
            );
        //resta -
        int resta = 123;
        resta = resta-10;
        System.out.println(resta
            );
        //multiplicacion *
        int multiplicacion = 123;
        multiplicacion = multiplicacion*10;
        System.out.println(multiplicacion
            ); 
        //division /
        float division = 123;
        division = division/10;
        System.out.println(division
            ); 
        //modulus %
        float modulo = 123;
        modulo = modulo%7;
        System.out.println(modulo
            );
        //Combinacion de operadores
        int puntuacion = 12;
        int total = 325 + (puntuacion*22);
        System.out.println(total
            );
    }
}
