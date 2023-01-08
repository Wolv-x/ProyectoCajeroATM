package ec.edu.epn;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TarjetaTest {

    Tarjeta tarjeta;

    @Before
    public void setUp() {
        tarjeta = new Tarjeta();
    }

    @Test
    public void given_creditCardNumber_when_validLenghtAndValidPassword_then_OK() {
        assertTrue(Tarjeta.validarTarjeta("4271900557374142", "123"));
        System.out.println("Successful test N°1...");
    }

    @Test
    public void given_creditCardNumber_when_validLenghtAndInvalidPassword_then_OK() {
        assertFalse(Tarjeta.validarTarjeta("4271900557374142", "12333123123"));
        System.out.println("Successful test N°2...");
    }

}