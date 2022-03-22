/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package hdt6;

import java.io.File;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jsken
 */
public class ControladorTest {
    
    public ControladorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getCollection method, of class Controlador.
     */
    @Test
    public void testGetCollection() {
        System.out.println("getCollection");
        Controlador instance = new Controlador();
        IMap<String, List<String>> expResult = null;
        IMap<String, List<String>> result = instance.getCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInventary method, of class Controlador.
     */
    @Test
    public void testGetInventary() {
        System.out.println("getInventary");
        Controlador instance = new Controlador();
        IMap<String, List<String>> expResult = null;
        IMap<String, List<String>> result = instance.getInventary();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newOperation method, of class Controlador.
     */
    @Test
    public void testNewOperation() throws Exception {
        System.out.println("newOperation");
        File datos = null;
        Controlador instance = new Controlador();
        instance.newOperation(datos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Factory method, of class Controlador.
     */
    @Test
    public void testFactory() throws Exception {
        System.out.println("Factory");
        Controlador instance = new Controlador();
        instance.Factory();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerOperaciones method, of class Controlador.
     */
    @Test
    public void testLeerOperaciones() throws Exception {
        System.out.println("leerOperaciones");
        File Datos = null;
        Controlador instance = new Controlador();
        instance.leerOperaciones(Datos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProductToCollection method, of class Controlador.
     */
    @Test
    public void testAddProductToCollection() throws Exception {
        System.out.println("addProductToCollection");
        Controlador instance = new Controlador();
        instance.addProductToCollection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showIMAP method, of class Controlador.
     */
    @Test
    public void testShowIMAP() {
        System.out.println("showIMAP");
        IMap<String, List<String>> tempList = null;
        Boolean isSort = null;
        Controlador instance = new Controlador();
        instance.showIMAP(tempList, isSort);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showCategoryOfAProduct method, of class Controlador.
     */
    @Test
    public void testShowCategoryOfAProduct() throws Exception {
        System.out.println("showCategoryOfAProduct");
        Controlador instance = new Controlador();
        instance.showCategoryOfAProduct();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
