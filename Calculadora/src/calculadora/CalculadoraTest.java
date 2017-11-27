package calculadora;

import static org.junit.Assert.*;
import org.junit.*;

import org.junit.Test;

public class CalculadoraTest {
		Calculadora calc;
		
		@Before 
		public void before(){
			System.out.println("before()");
			calc = new Calculadora();
		}
		@After
		public void after(){
			System.out.println("chau");
			calc.clear();
		}
		@Test
		public void testSuma() {
			Calculadora calc = new Calculadora();
			int resultado = calc.add(3, 2);
			int esperado = 5; //2+3=5
			assertEquals(esperado, resultado);
			System.out.println("se ejecuto el test de la suma");
		}
		
		@Test
		public void testAnsSum(){
			Calculadora calc = new Calculadora();
			calc.add(3, 2);
			int resultado =  calc.ans();
			int esperado = 5; //3+2=5
			assertEquals(esperado, resultado);
			System.out.println("se ejecuto el test de la resta");
		}
		@Test 
		public void testDividir(){
			calc.div(5, 2);
		}
		@Test(expected = ArithmeticException.class) 
		public void TestDivCero(){
			calc.div(5, 0);
		}
}
