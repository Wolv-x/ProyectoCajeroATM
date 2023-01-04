package ec.edu.epn;

public class Cuenta {
    static String tarjeta;
    static String clave;
    static float saldo;

    public Cuenta(String tarjeta, String clave, float saldo) {
        this.tarjeta = tarjeta;
        this.clave = clave;
        this.saldo = saldo;


    }

    @Override
    public String toString() {
        return "tarjeta: "+tarjeta+", clave: "+clave+",saldo: "+saldo;
    }

    public void imprimir() {
        System.out.println("tarjeta: "+tarjeta+", clave: "+clave+",saldo: "+saldo);
    }
}
