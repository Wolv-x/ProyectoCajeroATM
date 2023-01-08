package ec.edu.epn;
public class Menu {
    private Teclado ingreso;

    public Menu() {
        this.ingreso = new Teclado();
    }

    public void iniciarMenu() {
        //ingreso de datos
        Tarjeta tarjeta = new Tarjeta();
        ingreso = new Teclado();
        System.out.println("Ingrese su número de tarjeta: ");
        String numero = ingreso.getEntrada();
        System.out.println("Ingrese su clave: ");
        String clave = ingreso.getEntrada();
        if (Tarjeta.validarTarjeta(numero, clave)) {
            String opc;

            do {
                System.out.println("\tMENU");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Cambiar clave");
                System.out.println("3. Retirar dinero");
                System.out.println("4. Salir");
                opc = ingreso.getEntrada();

                if (Teclado.isNumeric(opc)){
                    switch (Integer.parseInt(opc)){
                        case 1:
                            tarjeta.consultarSaldo(numero);
                             break;
                        case 2:
                            tarjeta.cambiarClave(numero,clave);
                            break;
                        case 3:
                            Cajero.montoHaRetirarCajero(numero);
                            break;
                        case 4:
                            System.out.println("\tGracias por usar nuestros servicios");
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                            break;
                    }
                }
            } while (Integer.parseInt(opc) != 4);
        } else {
            System.out.println("Credenciales erroneas");
            System.out.println("\tGracias por usar nuestros servicios");
            ingreso.cerrarTeclado();
        }
    }




}
