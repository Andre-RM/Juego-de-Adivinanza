import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        int numeroAleatorio=(int)(Math.random()*101);
        int intentos=1;
        int intentosMax=5;

        System.out.println("Adivina el numero entre 0 - 100");
        System.out.println(String.format("Solo tiene %d intentos.",intentosMax));
        System.out.println("*******************************");
        System.out.print("Ingrese un numero: ");
        int numero=entrada.nextInt();



        while(numero!=numeroAleatorio){

            if(intentos==intentosMax){
                if(numero>numeroAleatorio){
                    System.out.println(String.format("El numero aleatorio es menor que %d",numero));
                } else {
                    System.out.println(String.format("El numero aleatorio es mayor que %d",numero));
                }
                System.out.println("Se quedo sin intentos. Juego finalizado");
                System.out.println(String.format("El numero aleatorio era: %d",numeroAleatorio));
                break;

            }else {
                if(numero>numeroAleatorio){
                    System.out.println(String.format("El numero aleatorio es menor que %d",numero));
                } else {
                    System.out.println(String.format("El numero aleatorio es mayor que %d",numero));
                }
                System.out.print("Ingrese otro numero: ");
                numero=entrada.nextInt();
                intentos++;
            }

        }
        if (numero==numeroAleatorio){
            System.out.println("Encontro el numero aleatorio Felicidades!!");
        }
    }
}