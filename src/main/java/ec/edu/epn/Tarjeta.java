package ec.edu.epn;

public class Tarjeta {
    //operaciones generales en la cuenta
    BaseDeDatos baseDeDatos;



    public static boolean validarTarjeta(String numeroTarjeta, String clave) {
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        if (Teclado.isNumeric(numeroTarjeta) && Teclado.isNumeric(clave)) {

            if (numeroTarjeta.length() == 16 && clave.length() == 3) {
                System.out.println(baseDeDatos.cuentas.size());
                for(int i=0; i<baseDeDatos.cuentas.size();i++){
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


        /*
        if (numeroTarjeta.length() != 16) {
            System.out.println("fallo longitud de la tarjeta");
            return false;
        } else {
            if (clave.length() != 3) {
                System.out.println("fallo longitud de la clave");
                return false;
            } else {
                if (Teclado.isNumeric(numeroTarjeta) && Teclado.isNumeric(clave)) {

                    System.out.println("aqui entra" + BaseDeDatos.cuentas.size());
                for (int i = 0; i < BaseDeDatos.cuentas.size(); i++) {
                    System.out.println("aqui tmbn");
                    if (.equals(numeroTarjeta) && BaseDeDatos.cuentas.get(i).clave.equals(clave)) {
                        return true;
                    } else {
                        System.out.println("fallo no existe en la Base de Datos");
                    }
                }

                }

            }
        }
        */
        return false;
        }


}
