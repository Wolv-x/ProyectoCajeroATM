package ec.edu.epn;

import junit.framework.TestCase;
import org.junit.*;

public class MenuTest extends TestCase {

    Menu menu;
    public static void setUpClass() {
        System.out.println("setUpClass");
    }

    @Before
    public void setUp() {
        System.out.println("setUp()");
        menu = new Menu();
    }

    @Test
    public void given_one_String_when_addValidValue_then_ok() {
        System.out.println("Test 1");

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