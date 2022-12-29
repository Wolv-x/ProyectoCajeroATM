package ec.edu.epn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BaseDeDatos {
    static List<Cuenta> cuentas = new ArrayList<Cuenta>();

    public void iniciarMenu() {
        cuentas.add(new Cuenta("4271900557374142", "123", 12F));
        cuentas.add(new Cuenta("4716050069748111", "672", 2F));
        cuentas.add(new Cuenta("4271900557374142", "345", 21F));
        cuentas.add(new Cuenta("4716050069748111", "987", 43F));
    }

    public static boolean validarTarjeta(String numeroTarjeta, String clave) {
        if (numeroTarjeta.length() != 16) {
            return false;
        } else {
            if (clave.length() != 3) {
                return false;
            } else {
                if (Teclado.isNumeric(numeroTarjeta) && Teclado.isNumeric(clave)) {

                    for (Cuenta cuenta : cuentas) {
                        if (cuenta.tarjeta.equals(numeroTarjeta) && cuenta.clave.equals(clave)) {
                            return true;
                        } else {
                            return false;
                        }

                    }

                }
            }
        }
        return false;
    }
}