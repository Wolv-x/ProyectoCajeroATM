package ec.edu.epn.cajero;

public class Cuenta {
    static String tarjeta;
    static String clave;
    static float saldo;

    public Cuenta(String tarjeta, String clave, float saldo) {
        this.tarjeta = tarjeta;
        this.clave = clave;
        this.saldo = saldo;
    }
}
