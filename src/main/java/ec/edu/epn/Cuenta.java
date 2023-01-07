package ec.edu.epn;

public class Cuenta {

    final String tarjeta;

    String clave;
    float saldo;

    public Cuenta(String tarjeta, String clave, float saldo) {
        this.tarjeta = tarjeta;
        this.clave = clave;
        this.saldo = saldo;
    }

    public String getClave() {
        return clave;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setClave(String clave){
        this.clave = clave;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "tarjeta: " + tarjeta + ", clave: " + clave + ",saldo: " + saldo;
    }

}
