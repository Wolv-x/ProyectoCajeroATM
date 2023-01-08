package ec.edu.epn;

public class Cajero {

    public static void imprimirRecibo() {
        Teclado ingreso = new Teclado();
        String respuestaRecibo;

        System.out.println("¿Quiere que su recibo sea impreso?\n" +
                "1. Si\n" +
                "2. No");
        respuestaRecibo = ingreso.getEntrada();

        if (!respuestaRecibo.equals("2")) {
            System.out.println("Imprimiendo recibo...");
        }
    }

    public static String menu() {
        Teclado ingreso = new Teclado();
        String opcion;
        System.out.println("Escoja el monto ha retirar\n" +
                "¿Qué monto quiere retirar del cajero?");

        //System.out.println("Su saldo disponible es de: ");

        System.out.println("1. 10");
        System.out.println("2. 50");
        System.out.println("3. 100");
        System.out.println("4. 150");
        System.out.println("5. 200");
        opcion = ingreso.getEntrada();
        return opcion;
    }

    public static void saldoDisponible(String numeroTarjeta, BaseDeDatos baseDeDatos, float monto) {
        float saldoNuevo;
        for (int i = 0; i < baseDeDatos.cuentas.size(); i++) {
            if (baseDeDatos.cuentas.get(i).tarjeta.equals(numeroTarjeta) && (baseDeDatos.cuentas.get(i).saldo >= 0) &&
                    (baseDeDatos.cuentas.get(i).saldo >= monto)) {
                System.out.println("Su saldo anterior es: " + baseDeDatos.cuentas.get(i).saldo);
                saldoNuevo = baseDeDatos.cuentas.get(i).saldo - monto;
                System.out.println("Su saldo actual es: " + saldoNuevo);
                baseDeDatos.cuentas.get(i).setSaldo(saldoNuevo);
            } else {
                if (baseDeDatos.cuentas.get(i).tarjeta.equals(numeroTarjeta) && !(baseDeDatos.cuentas.get(i).saldo >= monto)) {
                    System.out.println("Saldo insuficiente");
                }
            }
        }
    }

    public static void montoHaRetirarCajero(String numeroTarjeta) {
        Teclado ingreso = new Teclado();
        BaseDeDatos baseDeDatos = new BaseDeDatos();

        String opcion;
        float monto;
        float montoMaximoDiario = 0;
        String respuestaRetirarDinero;

        do {

            System.out.println("¿Quiere retirar dinero?\n" +
                    "1. Si\n" +
                    "2. No");
            respuestaRetirarDinero = ingreso.getEntrada();


            for (int i = 0; i < baseDeDatos.cuentas.size(); i++) {
                if (baseDeDatos.cuentas.get(i).tarjeta.equals(numeroTarjeta)) {
                    System.out.println("----------------------------");
                    System.out.println("Saldo actual: " + baseDeDatos.cuentas.get(i).saldo);
                }
            }

            if (respuestaRetirarDinero.equals("1") && Teclado.isNumeric(respuestaRetirarDinero)) {
                if (montoMaximoDiario <= 500F) {
                    opcion = menu();
                    switch (opcion) {
                        case "1":
                            monto = 10F;
                            saldoDisponible(numeroTarjeta, baseDeDatos, monto);
                            montoMaximoDiario += 10F;
                            break;
                        case "2":
                            monto = 50F;
                            saldoDisponible(numeroTarjeta, baseDeDatos, monto);
                            montoMaximoDiario += 50F;
                            break;
                        case "3":
                            monto = 100F;
                            saldoDisponible(numeroTarjeta, baseDeDatos, monto);
                            montoMaximoDiario += 100F;
                            break;
                        case "4":
                            monto = 150F;
                            saldoDisponible(numeroTarjeta, baseDeDatos, monto);
                            montoMaximoDiario += 150F;
                            break;
                        case "5":
                            monto = 200F;
                            saldoDisponible(numeroTarjeta, baseDeDatos, monto);
                            montoMaximoDiario += 200F;
                            break;
                        default:
                            break;
                    }
                }
            }
        } while (!respuestaRetirarDinero.equals("2"));
        imprimirRecibo();
    }

}

