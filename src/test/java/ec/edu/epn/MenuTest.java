package ec.edu.epn;

import junit.framework.TestCase;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import org.junit.runners.Parameterized;

public class MenuTest extends TestCase {

    Menu menu=null;

    @Before
    public void setUp() {
        menu = new Menu();
        System.out.println("setUp()");
    }

    @Test
    public void given_one_String_when_addValidValue_then_ok() {
        System.out.println("Test 1");

    }

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<>();

        return objects;
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