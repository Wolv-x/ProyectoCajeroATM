package ec.edu.epn;

public class Tarjeta {

        public static boolean validarTarjeta(String numeroTarjeta, String clave) {

        if (Teclado.isNumeric(numeroTarjeta) && Teclado.isNumeric(clave)) {
            if (numeroTarjeta.length() == 16 && clave.length() == 3) {
                for (int i = 0; i < BaseDeDatos.cuentas.size(); i++) {
                    if (BaseDeDatos.cuentas.get(i).tarjeta.equals(numeroTarjeta) && BaseDeDatos.cuentas.get(i).clave.equals(clave)) {
                        return true;
                    }
                }
            } else {
                System.out.println("fallo no cumple las lognitudes");
            }
        } else {
            System.out.println("fallo no es numerico");
        }
        return false;
    }

    public void cambiarClave(String numeroTarjeta, String clave) {
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        Teclado ingreso = new Teclado();
        System.out.println("Para cambiar su clave, ingrese su clave actual: ");
        String claveActual = ingreso.getEntrada();

        for (int i = 0; i < BaseDeDatos.cuentas.size(); i++) {

            if (BaseDeDatos.cuentas.get(i).tarjeta.equals(numeroTarjeta) && !(BaseDeDatos.cuentas.get(i).clave.equals(claveActual))) {
                System.out.println("No se ha realizado ningún cambio. Saliendo del sistema...."); // print("No se ha realizado ningún cambio);
                System.exit(0);
            }

            if (BaseDeDatos.cuentas.get(i).tarjeta.equals(numeroTarjeta) && BaseDeDatos.cuentas.get(i).clave.equals(clave)) {
                System.out.println("Ingrese su nueva clave:");
                String claveNueva = ingreso.getEntrada();
                System.out.println("Ingrese nuevamente su nueva clave:");
                String claveNuevamenteIngresada = ingreso.getEntrada();

                if (claveNueva.equals(claveNuevamenteIngresada)) {
                    if (claveNueva.length() == 3 && Teclado.isNumeric(claveNueva)) {
                        if (!(clave.equals(claveNueva))) {

                            BaseDeDatos.cuentas.get(i).setClave(claveNueva);
                            System.out.println("\nHa cambiado satisfactoriamente su clave");
                            System.out.println("Clave nueva:");
                            System.out.println(BaseDeDatos.cuentas.get(i).getClave());
                            System.out.println("----------------------------");
                        } else {
                            System.out.println("La clave ingresada es la misma que la clave actual.");
                        }
                    } else {
                        System.out.println("No se ha cambiado la clave");
                    }
                } else {
                    System.out.println("Las contraseñas no coinciden. Saliendo del sistema...."); //Para más elegancia se puso ese print, pero se puede eliminar
                    System.exit(0);
                }
            }
        }
    }

    public static void consultarSaldo(String numeroTarjeta) {
        for (int i = 0; i < BaseDeDatos.cuentas.size(); i++) {
            if(BaseDeDatos.cuentas.get(i).tarjeta.equals(numeroTarjeta)){
                System.out.println("Su saldo disponible es:" +  BaseDeDatos.cuentas.get(i).getSaldo());
                break;
            }
        }
    }

}


