import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese nombre del producto");
        String NomProd = scanner.next();
        Scanner PrProd = new Scanner(System.in);
        System.out.println("Ingrese precio del producto");
        int i = PrProd.nextInt();
        System.out.println("Indique forma de pago");
        System.out.println("1) Efectivo ");
        System.out.println("2) Debito ");
        System.out.println("3) Tarjeta ");
        int paymentMethod = scanner.nextInt();
        if (paymentMethod ==1) {
            System.out.println("Tiene descuento de un 15% "+i*0.85);
            System.out.println((i*0.85));
        } else if (paymentMethod==2) {
            System.out.println("tiene el mismo precio de compra ");
            System.out.println(i);
        } else if (paymentMethod==3){
            System.out.println("tiene un 10% de recargo "+i*0.10+i);
            System.out.println(i*0.10+i);
        }
        System.out.println(NomProd);
    }
}