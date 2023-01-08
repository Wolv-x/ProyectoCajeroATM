package ec.edu.epn;

public class Cajero {

    public static void imprimirRecibo() {
        Teclado ingreso = new Teclado();
        String respuestaRecibo;

        System.out.println("¿Quiere que su recibo sea impreso?\n" +
                "1. Si\n" +
                "2. No");
        respuestaRecibo = ingreso.getEntrada();
        System.out.println("----------------------------");
        if (!respuestaRecibo.equals("2")) {
            System.out.println("Imprimiendo recibo...");
        }
    }

    public static String menu() {
        System.out.println("----------------------------");
        Teclado ingreso = new Teclado();
        String opcion;
        System.out.println("Escoja el monto ha retirar\n" +
                "¿Qué monto quiere retirar del cajero?");

        System.out.println("1. 10");
        System.out.println("2. 50");
        System.out.println("3. 100");
        System.out.println("4. 150");
        System.out.println("5. 200");
        opcion = ingreso.getEntrada();
        return opcion;
    }

    public static boolean saldoDisponible(String numeroTarjeta, float monto) {
        System.out.println("----------------------------");
        float saldoNuevo;

        for (Cuenta cuenta : BaseDeDatos.cuentas) {

            if (cuenta.tarjeta.equals(numeroTarjeta) && cuenta.saldo >= monto) {
                System.out.println("Su saldo anterior es: " + cuenta.saldo);
                saldoNuevo = cuenta.saldo - monto;

                System.out.println("Su saldo actual es: " + saldoNuevo);
                BaseDeDatos.setSaldo( numeroTarjeta,saldoNuevo);
                return true;
            }
        }
        System.out.println("Saldo insuficiente");
        return false;

    }

    public static void montoARetirarCajero(String numeroTarjeta) {
        Teclado ingreso = new Teclado();

        String opcion;
        float monto;
        float montoMaximoDiario = 0;
        String respuestaRetirarDinero;
        System.out.println("----------------------------");
        System.out.println("¿Quiere retirar dinero?\n" +
                "1. Si\n" +
                "2. No");

        respuestaRetirarDinero = ingreso.getEntrada();

        if (respuestaRetirarDinero.equals("1") && Teclado.isNumeric(respuestaRetirarDinero)) {
            System.out.println("----------------------------");
            Tarjeta.consultarSaldo(numeroTarjeta);

            if (montoMaximoDiario <= 500F) {
                opcion = menu();
                switch (opcion) {
                    case "1":
                        monto = 10F;
                        saldoDisponible(numeroTarjeta, monto);
                        montoMaximoDiario += 10F;
                        break;
                    case "2":
                        monto = 50F;
                        saldoDisponible(numeroTarjeta, monto);
                        montoMaximoDiario += 50F;
                        break;
                    case "3":
                        monto = 100F;
                        saldoDisponible(numeroTarjeta, monto);
                        montoMaximoDiario += 100F;
                        break;
                    case "4":
                        monto = 150F;
                        saldoDisponible(numeroTarjeta, monto);
                        montoMaximoDiario += 150F;
                        break;
                    case "5":
                        monto = 200F;
                        saldoDisponible(numeroTarjeta, monto);
                        montoMaximoDiario += 200F;
                        break;
                    default:
                        System.out.println("Escoja una opcion de retiro válida");
                        break;
                }
            }
        }
        imprimirRecibo();
    }

}

