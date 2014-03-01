/* 05 - VideotutorialJava
http://www.youtube.com/watch?v=KY8qkUhDk-c&list=PLUeHzPBdeXoG6yFDA79d-1wyr4Pri1GhN */

class PesoPlaneta {
    //Usamos una única declaración de bloque main()
    public static void main (String[] args) {
        //print no hace salto de línia
        //println hace un salto de línia
        System.out.print("Tu peso en la Tierra es de: ");
        double peso = 72;
        System.out.println(peso); 

        System.out.print("Tu peso en Mercurio es de: ");
        double mercurio = peso * .378;
        System.out.println(mercurio); 
        
        System.out.print("Tu peso en la Luna es de: ");
        double luna = peso * .166;
        System.out.println(luna); 
        
        System.out.print("Tu peso en Jupiter es de: ");
        double jupiter = peso * 2.364;
        System.out.println(jupiter);         
    }
}
