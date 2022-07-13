import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner((System.in));
        int opc = 0;
        do {
            System.out.println("Ingrese la opción ");
            System.out.println("[1] condicionales problema 1: mayor o menor");
            System.out.println("[2] condicionales problema 2: empresa");
            System.out.println("[3] condicionales problema 3: promedio del alumno");
            System.out.println("[4] iterativas 1: foo");
            System.out.println("[5] iterativas 2: recorrido del 1 al 10");
            System.out.println("[6] iterativas 3: forma con puntos");
            System.out.println("[7] Salir ");

            opc=sc.nextInt();
            switch (opc){
                case 1:
                    numbers();
                    break;
                case 2:
                    company();
                    break;
                case 3:
                    school();

                case 4:
                    feature/iterative1();
                case 5:
                    feature/iterative2();
                case 6:
                    feature/iterative3();

            }
        }while (opc!=7);
    }
}
public class numbers {
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

public class school {
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