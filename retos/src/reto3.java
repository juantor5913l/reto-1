import java.util.Scanner;
import java.util.Random;
public class reto3{
public static void main(String[]args){
		
		Scanner lectura=new Scanner(System.in);
		Random mone= new Random();
	//Atributos
			int eleccion;
			int moneda;

			System.out.println("Elija la opcion que quiera (1) cara o (2) sello");
			eleccion=lectura.nextInt();
			moneda=mone.nextInt(2);
			if(eleccion==moneda){
			System.out.println("Felicidades has ganado");
			}else{
			System.out.println("Lo siento,ha perdido");
			}
			lectura.close();
		}
	  }		