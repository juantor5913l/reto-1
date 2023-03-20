import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) { 
        Scanner lectura = new Scanner(System.in); 
    Double celcius;
    Double kelvin;
    Double fahrenheit; /* DECLARE VARIABLES*/
        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        fahrenheit = lectura.nextDouble(); 

        celcius=(fahrenheit-32) * 5 / 9; 
        kelvin=celcius+ 273.15; 

        System.out.println("La temperatura en grados Kelvin es: " + kelvin );
        lectura.close();
    }
}
