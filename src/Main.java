import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Scanner(System.in);
        System.out.println("Ingrese Numeros ");
        Scanner Num1 = new Scanner(System.in);
        int i = Num1.nextInt();
        Scanner Num2 = new Scanner(System.in);
        int j = Num2.nextInt();
        if (i > j) {
            System.out.println("" + i + " Es mayor que " + j);
        } else if (j > i) {
            System.out.println("" + j + " Es mayor que " + i);
        }
    }
}