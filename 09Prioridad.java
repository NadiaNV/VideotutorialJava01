/* 05 - VideotutorialJava
http://www.youtube.com/watch?v=KY8qkUhDk-c&list=PLUeHzPBdeXoG6yFDA79d-1wyr4Pri1GhN */

class Prioridad {
    public static void main (String[] args) {
        int y= 21;
        int x = y*3+5;
            System.out.println("Declaración de variables: ");
            System.out.println("y = " + y);
            System.out.println("x = y*3+5");
            System.out.println("Valor de x = " + x);
            System.out.println("Primero multiplicación y luego la suma");

        int v = 7;
        int z = v++ * 6 + 4 *10 /2;
            System.out.println("Declaración de variables: ");
            System.out.println("v = " + v);
            System.out.println("z = v++ *6 +4 *10 /2");
            System.out.println("Valor de z = " + z);
            System.out.println("Se sustituye la variable v por 7 y se multiplica por 6. Luego 4*10 (40) y se divide (40 / 2)");        
            System.out.println("Nos quedaria: 42 + 20 que es 62");        
            System.out.println(" y v coje el valor de v++ = " + v);        
        
        int s= 21;
        int t = s*(3+5);
            System.out.println("Declaración de variables: ");
            System.out.println("s = " + s);
            System.out.println("t = s*(3+5)  Tiene preferencia la opercaión entre paréntesis");
            System.out.println("Valor de t = " + t);
            System.out.println("Primero multiplicación y luego la suma");
    }
}
