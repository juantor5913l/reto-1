
import java.util.Scanner;

public class reto8 {
    public static void main(String[] args) {
	Scanner lectura = new Scanner(System.in);
        int numeroAleatorio=0;
        int intentos = 0;
        int numeroElegido;

        System.out.println("¡Bienvenido a Adivina El Numero! Tienes 10 intentos para adivinar un número entre 1 y 100.");
	numeroAleatorio= (int) (Math.random() * 100) + 1;
        do {
            System.out.print("Intento #" + (intentos + 1) + ": ");
            numeroElegido = lectura.nextInt();

            if (numeroElegido < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (numeroElegido > numeroAleatorio) {
                System.out.println("El número es menor.");
            }

            intentos++;
        } while (numeroElegido != numeroAleatorio && intentos < 10);

        if (numeroElegido == numeroAleatorio) {
            System.out.println("¡Felicidades, adivinaste el número en " + intentos + " intentos!");
        } else {
            System.out.println("Lo siento, no lograste adivinar el número. Era "  + numeroAleatorio + ".");
        }
        lectura.close();
    }
}
