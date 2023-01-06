package ec.edu.epn;

public class Tarjeta {
    //operaciones generales en la cuenta


    public static boolean validarTarjeta(String numeroTarjeta, String clave) {
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        if (Teclado.isNumeric(numeroTarjeta) && Teclado.isNumeric(clave)) {
            if (numeroTarjeta.length() == 16 && clave.length() == 3) {
                System.out.println(baseDeDatos.cuentas.size());
                for (int i = 0; i < baseDeDatos.cuentas.size(); i++) {
                    System.out.println(baseDeDatos);
                    if (baseDeDatos.cuentas.get(i).tarjeta.equals(numeroTarjeta) && baseDeDatos.cuentas.get(i).clave.equals(clave)) {
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
        System.out.println("Ingrese su nueva clave");
        String claveNueva = ingreso.getEntrada();

        System.out.println("Ingrese nuevamente su nueva clave");
        String claveNuevaNueva = ingreso.getEntrada();

        if (claveNueva.equals(claveNuevaNueva)) {
            if (claveNueva.length() == 3 && Teclado.isNumeric(claveNueva)) {
                if (!(clave.equals(claveNueva))) {

                    System.out.println("#################");
                    for (int i = 0; i < baseDeDatos.cuentas.size(); i++) {
                        if (baseDeDatos.cuentas.get(i).tarjeta.equals(numeroTarjeta) && baseDeDatos.cuentas.get(i).clave.equals(clave)) {
                            System.out.println("CUENTA:----");
                            System.out.println(baseDeDatos.cuentas.get(i));
                            System.out.println("TARJETA-----");
                            System.out.printf(baseDeDatos.cuentas.get(i).tarjeta);
                            System.out.println("\nCLAVE-----");
                            System.out.println(baseDeDatos.cuentas.get(i).clave);
                            baseDeDatos.cuentas.get(i).setClave(claveNueva);
                            System.out.println("\nHa cambiado satisfactoriamente su clave"); //NO BORRAR
                            System.out.println("CLAVE NUEVA-----");
                            System.out.println(baseDeDatos.cuentas.get(i).getClave());
                            System.out.println("Sus datos son:");
                            System.out.println(baseDeDatos.cuentas.get(i));
                        }
                    }
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                } else {
                    System.out.println("La clave ingresada es la misma.");
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


