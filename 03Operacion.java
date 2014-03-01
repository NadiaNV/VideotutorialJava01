/* 03 - VideotutorialJava
http://www.youtube.com/watch?v=miHnua6wmZ0&list=PLUeHzPBdeXoG6yFDA79d-1wyr4Pri1GhN
*/

//Declarar una clase (el nombre de la clase coincide con el nombre de archivo)
class Operacion {
    //Declaración (statement) de main (punto de partida del programa)
    public static void main(String[]args) {
        //declarar variable numero del tipo int con valor 357
        int numero = 357;
            System.out.println ("La raíz cuadrada de " 
                    +numero
                    +" es "
                    //Math = operacion matematica //sqrt = raiz cuadrada
                    +Math.sqrt(numero)
                    );               
    }
}    
