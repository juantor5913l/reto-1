import java.util.Scanner;

public class reto6 {
    public static void main(String[] args) {
       
        int prod1,prod2,prod3,prod4,prod5,totalCompra,iva;
        String nombre1,nombre2,nombre3,nombre4,nombre5;
        
        Scanner lectura =new Scanner (System.in);


        System.out.println("Ingrese el nombre de su primer producto");
        nombre1=lectura.nextLine();
        System.out.println("Ingrese el valor de su primer producto a llevar");
        prod1=lectura.nextInt();
        System.out.println("Ingrese el nombre de su segundo producto");
        nombre2=lectura.next();
        System.out.println("Ingrese el valor de su segundo producto a llevar");
        prod2=lectura.nextInt();
        System.out.println("Ingrese el nombre de su tercer producto");
        nombre3=lectura.next();
        System.out.println("Ingrese el valor de su tercer producto a llevar");
        prod3=lectura.nextInt();
        System.out.println("Ingrese el nombre de su cuarto producto");
        nombre4=lectura.next();
        System.out.println("Ingrese el valor de su cuarto producto a llevar");
        prod4=lectura.nextInt();
        System.out.println("Ingrese el nombre de su quinto producto");
        nombre5=lectura.next();
        System.out.println("Ingrese el valor de su quinto producto a llevar");
        prod5=lectura.nextInt();

        totalCompra=prod1+prod2+prod3+prod4+prod5;
        iva=(totalCompra*19)/100;
        totalCompra=totalCompra+iva;
        
        System.out.println("Sus productos fueron "+nombre1+prod1+",  "+nombre2+prod2+",  "+nombre3+prod3+",  "+nombre4+prod4+",   "+nombre5+prod5+ " Con un total de "+totalCompra);
        lectura.close();
    }
}


