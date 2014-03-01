/* 03 - VideotutorialJava
http://www.youtube.com/watch?v=miHnua6wmZ0&list=PLUeHzPBdeXoG6yFDA79d-1wyr4Pri1GhN
*/

//Declarar una clase (el nombre de la clase coincide con el nombre de archivo)
class ConArgumentos {
    //Declaración (statement) de main (punto de partida del programa)
    public static void main(String[] args) {
        //declarar variable numero del tipo int con valor 357
            System.out.println (
                    /*Los argumentos se añaden en 
                    Run/SetProjectConfiguration/Customize/Arguments
                    El java se ejecuta desde el dibujo del play, no desde Run File*/
                    "Los lenguajes de programación que prefiero son: "
                    + "El primero: " 
                    + args[0]
                    + " El segundo: "        
                    + args[1]
                    + " Y el tercero: "       
                    + args[2]
                    );               
    }
}  
