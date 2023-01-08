package ec.edu.epn;

import java.util.ArrayList;

import java.util.List;

public class BaseDeDatos {
    static List<Cuenta> cuentas;
    //public Cuenta[] cuentas;


    public static void llenado() {
        cuentas = new ArrayList<>();
        cuentas.add(0, new Cuenta("4271900557374142", "123", 12F));
        cuentas.add(1, new Cuenta("4716050069748111", "672", 2F));
        cuentas.add(2, new Cuenta("4271900557374149", "345", 21F));
        cuentas.add(3, new Cuenta("4716050069748112", "987", 43F));
    }


    public static int getCuenta(String numeroTarjeta){
        for(int i=0; i< cuentas.size();i++){
            if(cuentas.get(i).tarjeta.equals(numeroTarjeta)){
                return i;
            }
        }
        return -1;
    }

    public static void setSaldo(String numeroTarjeta, float saldo){
        cuentas.get(getCuenta(numeroTarjeta)).setSaldo(saldo);
    }

}