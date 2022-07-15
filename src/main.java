import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int opc = 0;
        do {


            System.out.println("\n[1]  mayor o menor , ");
            System.out.println("[2] Formas de pago de la empresa ");
            System.out.println("[3] promedio del alumno , ");
            System.out.println("[4] iterativas 1: foo");
            System.out.println("[5] recorrido del 1 al 10");
            System.out.println("[6] forma con puntos");
            System.out.println("[7] para Salir ");
            System.out.println("Ingrese la opción deseada ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    numbers(args);
                    break;
                case 2:
                    company(args);
                    break;
                case 3:
                    school(args);
                    break;
                case 4:
                    foo(args);
                    break;
                case 5:
                    ten(args);
                    break;
                case 6:
                    points(args);
                    break;
            }
        } while (opc != 7);
    }

    public static void numbers(String[] args) {
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

    public static void company(String[] args) {

        Scanner scanner = new Scanner(System.in);
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
        if (paymentMethod == 1) {
            System.out.println("Tiene descuento de un 15% " + i * 0.85);
            System.out.println((i * 0.85));
        } else if (paymentMethod == 2) {
            System.out.println("tiene el mismo precio de compra ");
            System.out.println(i);
        } else if (paymentMethod == 3) {
            System.out.println("tiene un 10% de recargo " + i * 0.10 + i);
            System.out.println(i * 0.10 + i);
        }
        System.out.println("nombre del producto " + NomProd);
    }

    public static void school(String[] args) {
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
        if (A < 1 || A > 10 && B < 1 || B > 10 && C < 1 || C > 10) {
            System.out.println("Numero ingresados incorrectos");
        } else if (Prom <= 10 && Prom >= 6) {
            System.out.println("Aprobado " + Prom);
        } else if (Prom < 6 && Prom >= 1) {
            System.out.println("Desaprobado " + Prom);

        }

    }

    public static void foo(String[] args) {
        String foo = "foo";
        for (int i = 0; i < 10; i++) {
            System.out.println(foo);
        }

    }

    public static void ten(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(+i);

        }

    }

    public static void points(String[] args) {
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                System.out.println("*");
            } else if (i == 1) {
                System.out.println("**");
            } else if (i == 2) {
                System.out.println("***");
            } else if (i == 3) {
                System.out.println("****");
            } else if (i == 4) {
                System.out.println("*****");
            } else if (i == 5) {
                System.out.println("******");
            } else if (i == 6) {
                System.out.println("*******");
            }

        }
        System.out.println();

        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                System.out.println("*******");
            } else if (i == 1) {
                System.out.println("******");
            } else if (i == 2) {
                System.out.println("*****");
            } else if (i == 3) {
                System.out.println("****");
            } else if (i == 4) {
                System.out.println("***");
            } else if (i == 5) {
                System.out.println("**");
            } else if (i == 6) {
                System.out.println("*");
            }

        }
        System.out.println();
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                System.out.println("                      *");
            } else if (i == 1) {
                System.out.println("                     **");
            } else if (i == 2) {
                System.out.println("                    ***");
            } else if (i == 3) {
                System.out.println("                   ****");
            } else if (i == 4) {
                System.out.println("                  *****");
            } else if (i == 5) {
                System.out.println("                 ******");
            } else if (i == 6) {
                System.out.println("                *******");
            }

        }


    }
}
