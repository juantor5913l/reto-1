import java.util.Random;
import java.util.Scanner;

public class reto5{
   public static void main(String[] args) {
      Random random = new Random();
      Scanner lectura= new Scanner(System.in);

      int maxIntentos= 10;
      int intentos=0;
      int opcionUsuario;
      int resultadoMoneda;
      String nombre;

      System.out.println("Bienvenido al cara y sello");
      System.out.println("Dijite su nombre");
      nombre=lectura.nextLine();
      System.out.println("Tienes un total de " + maxIntentos + " intentos.");

      while (intentos<maxIntentos) {
         System.out.println("Elija 0 para cara y 1 para sello");
         opcionUsuario= lectura.nextInt();
         resultadoMoneda= random.nextInt(2);
         intentos++;
         if (opcionUsuario == resultadoMoneda) {
            System.out.println("felicidades ganaste");
            
         } else {
            System.out.println("Lo siento "+nombre+ ", has perdido");
         }

         intentos++;
      }

      if (intentos == maxIntentos) {
         System.out.println("Juego terminado,sus intentos se agotaron");
      }

      lectura.close();
   }
}
