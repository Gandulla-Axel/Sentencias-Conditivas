
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nombre del cursante");
        String NomProd = scanner.next();
        System.out.println("Ingrese notas ");
        Scanner notaA = new Scanner(System.in);
        int A = notaA.nextInt();
        Scanner notaB = new Scanner(System.in);
        int B = notaB.nextInt();
        Scanner notaC = new Scanner(System.in);
        int C = notaC.nextInt();
        int Prom = (A + B + C) / 3;
        if (A <1 || A >10 && B <1 || B >10  && C <1 || C >10 ){
            System.out.println("Numero ingresados incorrectos");
        } else if (Prom <= 10 && Prom >= 6) {
            System.out.println("Aprobado " + Prom);
        } else if    (Prom < 6 && Prom >= 1) {
            System.out.println("Desaprobado " + Prom);

        }

    }
}