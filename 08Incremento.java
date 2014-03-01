/* 05 - VideotutorialJava
http://www.youtube.com/watch?v=KY8qkUhDk-c&list=PLUeHzPBdeXoG6yFDA79d-1wyr4Pri1GhN*/
class Incremento {
    public static void main(String[] args){
        //Incremento ++ y Decremento --
        int x=3;
        int valorx = ++x * 10;
            System.out.println("El resultado de: valorx = ++x * 10 es igual a:");        
            System.out.println(valorx);
            System.out.println("primero se hace el ++x (prefijo) y luego la multiplicacion");
        int y=3;
        int valory = y++ * 10;
            System.out.println("El resultado de: valory = y++ * 10 es igual a:");
            System.out.println(valory);
            System.out.println("primero se hace la multiplicación y luego el y++ (sufijo)");
    }
}
