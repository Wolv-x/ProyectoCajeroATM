package ec.edu.epn;

public class Main {
    public static void main(String[] args) {

        Teclado.isNumeric("4271900557374142");
        //Tarjeta.consultarSaldo("4271900557374142");
        //Tarjeta.validarTarjeta("4271900557374142", "123");
        //Cajero.saldoDisponible("4271900557374142",10F);
       // Cajero.saldoDisponible("4271900557374142",100F);
        Tarjeta.validarTarjeta("4271900557374142", "12333123123");

        /*
        Menu menu = new Menu();
        menu.iniciarMenu();*/
    }
}
