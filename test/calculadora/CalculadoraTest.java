/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;

/**
 *
 * @author Oscar Ardila
 */
public class CalculadoraTest {
    static Calculadora calc;
   static int a,b,c;

    @Parameterized.Parameters
    public static Iterable<Object[]>getData(){
        List<Object[]> obj= new ArrayList<>();
        obj.add(new Object[] {2,8,10} );
        //obj.add(new Object[] {1,4,6} );
        return  obj;
    }
    
     public CalculadoraTest(int a , int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
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
    
    @Test 
    public void testSumaP(){
        System.out.println("testSuma()");
        
        int resultado = calc.suma(a,b);
        int esperado=c;
        assertEquals(esperado,resultado);
    }
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
    @Test
        public void testObj() {
        System.out.println("Double");
        Calculadora a= new Calculadora();
        Calculadora b= new Calculadora();
        assertEquals(a,b);
       
    }
        @Test
    public void testDouble() {
        System.out.println("Double");
        double a= 3.0002;
        double b= 3.0000000;
        double expResult =6.0002;
        double result = calc.div2(a, b);
        double delta= 0.30;
            assertEquals(delta, delta, delta);
        assertEquals(expResult, result,0.1);
        }
    

    
    
}
