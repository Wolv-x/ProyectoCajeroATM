package ec.edu.epn;

import org.junit.*;

import static org.junit.Assert.*;

public class TecladoTest {
    Teclado teclado;
    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass");
    }

    @Before
    public void setUp() {
        System.out.println("setUp()");
        teclado = new Teclado();
    }

    @Test
    public void given_one_String_when_addValidValue_then_ok() {
        System.out.println("Test 1");
        assertTrue(Teclado.isNumeric("4271900557374142"));
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