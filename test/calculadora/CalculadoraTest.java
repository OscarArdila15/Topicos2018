/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oscar Ardila
 */
public class CalculadoraTest {
    static Calculadora calc;
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        calc =new Calculadora(); 
    
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
     @Test
    public void testSuma(){
        System.out.println("testSuma()");
        
        int resultado = calc.suma(2,3);
        int esperado=5;
        assertEquals(esperado,resultado);
    }
    @Test
    public void testResta(){
        System.out.println("testResta()");
        
        int resultado = calc.resta(3,2);
        int esperado=1;
        assertEquals(esperado,resultado);
    }
    
    @Test
    public void testDiv(){
        System.out.println("testDIv()");
        
        int resultado = calc.div(3,2);
        
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDiv0(){
        System.out.println("testDIv0()");
        
        calc.div(3,0);
        
    }
    
    @Test
    public void testAnsSuma(){
        System.out.println("AnsSuma()");
        calc.suma(3, 2);
        int resultado=calc.ans();
        int esperado=5;
        assertEquals(esperado,resultado);
       
                
    }
    
    @Test(timeout=3001)
    public void testOptimo(){
        System.out.println("testoptimo()");
        calc.optima();
        
    }
    //modificacion afterclass
    @AfterClass
    public static void Afterclass(){
        System.out.println("Afterclass()");
        
    }
}
