import java.util.Scanner;
import java.util.Random;
public class reto4{
public static void main(String[] args) {
    //DECLARAR VARIABLES
    int n1,n2,apuesta,perdida,victoria;
    String nombre;
    //INSTANCIAR CLASE
    Random r1 = new Random();
    n1=r1.nextInt(3);
    Scanner lectura = new Scanner(System.in);
    //SOLICITAR DATOS
    System.out.println("Ingrese su nombre");
    nombre=lectura.nextLine();
    System.out.println("Seleccione 0 PIEDRA 1 PAPEL 2 TIJERA ");
    n2=lectura.nextInt();
    System.out.println("Ingrese valor de su apuesta");
    apuesta=lectura.nextInt();
    perdida=apuesta-apuesta;
    victoria=apuesta*2;
    //CREAR LA CONDICION
    if ((n2== 0) &&(n1==0) ) {
        System.out.println(nombre+"EMPATE AMBOS HAN SACADO PIEDRA"+" no has ganado "+apuesta);
    }else if ((n2==1)&&(n1==1)) {
        System.out.println(nombre+"EMPATE AMBOS HAN SACADO PAPEL"+" no has ganado "+apuesta);
    }else if ((n2==2)&&(n1==2)) {
        System.out.println(nombre+"EMPATE AMBOS HAN SACDO TIJERA"+" no has ganado "+apuesta);
    }
    else if ((n2==0)&&(n1==1)){
        System.out.println(nombre+"PERDISTE GANA PAPEL"+" Dinero de apuesta "+perdida);
    }else if ((n2==1)&&(n1==2)){
    System.out.println(nombre+"PERDISTE GANA TIJERA"+" Dinero de apuesta "+perdida);
    }else if ((n2==2)&&(n1==0)){
    System.out.println(nombre+"PERDISTE GANA PIEDRA"+" Dinero de apuesta "+perdida);
    }
    else if ((n2==0)&&(n1==2)){
        System.out.println(nombre+"HAS GANADO PIEDRA GANA A TIJERAS"+" Dinero ganado "+victoria);
    }else if ((n2==1)&&(n1==0)){
    System.out.println(nombre+"HAS GANADO PAPEL GANA A PIEDRA"+" Dinero ganado "+victoria);
    }else if ((n2==2)&&(n1==1)){
    System.out.println(nombre+"HAS GANADO TIJERA GANA A PAPEL"+" Dinero ganado "+victoria);
    }
    lectura.close();
}
}