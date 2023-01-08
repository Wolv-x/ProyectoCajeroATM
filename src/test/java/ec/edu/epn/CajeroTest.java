package ec.edu.epn;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CajeroTest {
    @Before
    public void setUp() {
        BaseDeDatos.llenado();
    }

    @Test
    public void given_creditCardNumberAndAmount_when_haveAvailableCredit_thenTRUE() {
        assertTrue(Cajero.saldoDisponible("4271900557374142",10F));
        System.out.println("Successful test N°1...");
    }

    @Test
    public void  given_creditCardNumberAndAmount_when_NotHaveAvailableCredit_thenFALSE(){
        assertFalse(Cajero.saldoDisponible("4271900557374142",100F));
        System.out.println("Successful test N°2...");
    }
    @After
    public void tearDown() {
        System.out.println("tearDown()");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass()");
    }
}
