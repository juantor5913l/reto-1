import java.util.Scanner;

public class reto2{
    public static void main(String[] args) {  
        Scanner lectura = new Scanner(System.in);
String nombreBebe;
String nombreAcudiente;
int edad;
double peso;
double dosisVacuna;
        System.out.print("Ingrese el nombre del bebé: "); 
        nombreBebe= lectura.nextLine(); 
        System.out.print("Ingrese el nombre del acudiente del bebé: "); 
         nombreAcudiente = lectura.nextLine(); 
        System.out.print("Ingrese la edad del bebé (en meses): "); 
        edad = lectura.nextInt(); 

    
        peso = edad * 10 / 8.0; 
        dosisVacuna = peso + 10 / peso * 10 * 8; 

        
        System.out.println("Dosis de la vacuna para " + nombreBebe + " (acudiente: " + nombreAcudiente + ")");
        System.out.println("Edad: " + edad + " meses");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Dosis de la vacuna: " + dosisVacuna + "ml");
        lectura.close();
    }
}
    