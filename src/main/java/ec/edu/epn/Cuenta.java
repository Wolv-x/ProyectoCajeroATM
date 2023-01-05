package ec.edu.epn;

public class Cuenta {
    final String tarjeta;
    String clave;
    private final float saldo;

    public Cuenta(String tarjeta, String clave, float saldo) {
        this.tarjeta = tarjeta;
        this.clave = clave;
        this.saldo = saldo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave){
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "tarjeta: "+tarjeta+", clave: "+clave+",saldo: "+saldo;
    }


}
