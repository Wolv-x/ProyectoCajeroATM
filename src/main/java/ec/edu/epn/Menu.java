package ec.edu.epn;
public class Menu {
    private Teclado ingreso;

    public Menu() {
        this.ingreso = new Teclado();
    }

    public void iniciarMenu(Cuenta cuenta) {
        ingreso = new Teclado();
        System.out.println("Ingrese su número de tarjeta: ");
        String numero = ingreso.getEntrada();
        System.out.println("Ingrese su clave: ");
        String clave = ingreso.getEntrada();
        if (BaseDeDatos.validarTarjeta(numero, clave)) {
            String opc;

            do {
                System.out.println("\tMENU");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Cambiar clave");
                //nueva funcionalidad
                System.out.println("3. Retirar dinero");
                System.out.println("4. Salir");
                opc = ingreso.getEntrada();
                /*
                if (Teclado.isNumeric(opc)) {
                    switch (Integer.parseInt(opc)) {
                        case 1 -> System.out.println(cuenta.consultarSaldo(numero));
                        case 2 -> tarjeta.cambiarClave(numero, clave);
                        case 3 -> System.out.println(cuenta.retirarDinero(numero));
                        case 4 -> System.out.println("\tGracias por usar nuestros servicios");
                        default -> System.out.println("Ingrese una opcion valida");
                    }
                }
                */

            } while (Integer.parseInt(opc) != 4);
        } else {
            System.out.println("Credenciales erroneas");
            System.out.println("\tGracias por usar nuestros servicios");
            ingreso.cerrarTeclado();
        }
    }
}
