package ec.edu.epn;



import java.util.Scanner;

public class Cajero {

    public static void imprimirRecibo (){
        //clase teclado
        Scanner scanner = new Scanner(System.in);
        int respuestaRecibo;

        System.out.println("¿Quiere que su recibo sea impreso?\n" +
                "1. Si\n" +
                "2. No\n");
        respuestaRecibo = scanner.nextInt();

        if (respuestaRecibo != 2){
            System.out.println("Imprimiendo recibo...");
        }
    }
    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("Escoja el monto ha retirar\n" +
                "¿Qué monto quiere retirar del cajero?");


        //System.out.println("Su saldo disponible es de: ");

        System.out.println("1. 10");
        System.out.println("2. 50");
        System.out.println("3. 100");
        System.out.println("4. 150");
        System.out.println("5. 200\n");
        opcion = scanner.nextInt();
        scanner.close();
        return opcion;
    }

    public static int montoHaRetirarCajero() {
        //teclado
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int monto = 0;
        int montoMaximoDiario = 0;
        int x;

        do {
            System.out.println("¿Quiere retirar dinero?" +
                    "1. Si\n" +
                    "2. No\n");
            //teclado validar si es numero
            x = scanner.nextInt();

            if (x == 1) {
                if (montoMaximoDiario <= 500) {
                    opcion = menu();
                    switch (opcion) {
                        case 1:
                            monto = 10;
                            montoMaximoDiario += 10;
                            imprimirRecibo();
                            break;
                        case 2:
                            monto = 50;
                            montoMaximoDiario += 50;
                            imprimirRecibo();
                            break;
                        case 3:
                            monto = 100;
                            montoMaximoDiario += 100;
                            imprimirRecibo();
                            break;
                        case 4:
                            monto = 150;
                            montoMaximoDiario += 150;
                            imprimirRecibo();
                            break;
                        case 5:
                            monto = 200;
                            montoMaximoDiario += 200;
                            imprimirRecibo();
                            break;
                        default:
                            break;
                    }
                }
            } else {
                break;
            }
        } while (true);
        scanner.close();
        return monto;
    }

}

