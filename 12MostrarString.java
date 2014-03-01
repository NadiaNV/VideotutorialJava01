/* 06 - VideotutorialJava
http://www.youtube.com/watch?v=Vu8VQaodaAg&list=PLUeHzPBdeXoG6yFDA79d-1wyr4Pri1GhN */

class MostrarString {
    public static void main (String[] args) {
        // Para poner algo entre comillas: 
        // \' comillas simples
        // \" Comillas dobles
        // \\Barra inclinada
        // \t Tab
        // \b Retroceso (Backspace)
        // \r Retorno de carro
        // \f Salto de linia (Formfeed)
        // \n Nueva linia
        System.out.println("Aquí escribimos nuestro texto");
        //Operador de Concatenación se hace con el signo +
        int numero = 143;
        char  caracter = 'a';
        String valor = "El número es "; 
        String saludo = "";
        //concatenación de variables
        System.out.println(valor + numero);
        //concatenacion de texto y variable
        System.out.println("Hol" + caracter);
        //asignacion a una variable con texto y variable
        saludo = "hol" + caracter;
        System.out.println(saludo);
        //Con el operador += mantenemos el valor original y se añade al final
        String palabra = "";
        palabra += "Videotutorial ";
        palabra += "Java ";
        palabra += "y ";
        palabra += "php";
        System.out.println(palabra);        
    }
}
