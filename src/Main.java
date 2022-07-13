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
                    condicionales1();
                    break;
                case 2:
                    feature/conditional2();
                    break;
                case 3:
                    feature/conditional3();
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
