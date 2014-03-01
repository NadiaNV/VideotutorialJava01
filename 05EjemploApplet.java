/* 03 - VideotutorialJava
http://www.youtube.com/watch?v=miHnua6wmZ0&list=PLUeHzPBdeXoG6yFDA79d-1wyr4Pri1GhN
*/

import java. awt. *;

public class EjemploApplet extends javax.swing. JApplet {
    int numero;
    
    //substituido por main
    public void init() {
        numero = 317;
    }
    //subtituido por println
    public void paint(Graphics screen) {
        Graphics2D screen2D = (Graphics2D) screen;
        screen2D. drawString("La raiz cuadrada de " +
                numero +
                " es " +
                Math. sqrt(numero), 5, 50);
    }
} 
