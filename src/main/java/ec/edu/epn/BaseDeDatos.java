package ec.edu.epn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BaseDeDatos {
    public  List<Cuenta> cuentas;
    //public Cuenta[] cuentas;

    public BaseDeDatos() {
        /*
        cuentas = new Cuenta[3];
        cuentas[0] = new Cuenta("4271900557374142", "123", 12F);
        cuentas[1] = new Cuenta("4716050069748111", "672", 2F);
        cuentas[2] = new Cuenta("4271900557374142", "345", 21F);
        cuentas[3] = new Cuenta("4716050069748111", "987", 43F);
                */
        cuentas = new ArrayList<>();
        cuentas.add(0, new Cuenta("4271900557374142", "123", 12F));
        cuentas.add(1, new Cuenta("4716050069748111", "672", 2F));
        cuentas.add(2, new Cuenta("4271900557374142", "345", 21F));
        cuentas.add(3, new Cuenta("4716050069748112", "987", 43F));


    }

    @Override
    public String toString() {
        String retorno="";
        retorno+=cuentas.get(0);
        for(Cuenta cuenta:cuentas){
            System.out.println(cuenta);
            retorno+=cuenta+"\n";
        }
        return retorno;

    }
}