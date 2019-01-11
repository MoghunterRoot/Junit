package tests;
import static org.junit.Assert.*;


import org.junit.jupiter.api.Test;

class CalculatorImplTest   {
	@Test
	public final void add() {
		Calculator calc = new CalculatorImpl();
		int a, b, res;
		a = 5; 
	        b  = 8; 
	        res = a + b;
		assertEquals(res, calc.add(a, b));
		if(res != 13) {
			fail("Res is not correct");
		}
	}
	
	@Test
	public final void divide() {
		Calculator calc1 = new CalculatorImpl();
		int a, b, res;
		a = 10;
			b = 2;
			res = a / b;
		assertEquals(res, calc1.divide(a, b));
		if (res != 5) {
			fail("res is not correct");
		}
	}
		
		@Test
		public final void multiply() {
			Calculator calc2 = new CalculatorImpl();
			int a, b, res;
			a = 10;
				b = 2;
				res = a * b;
			assertEquals(res, calc2.multiply(a, b));
			if (res != 20) {
				fail("res is not correct");
			}
		}
			
		@Test
		public final void substract() {
			Calculator calc3 = new CalculatorImpl();
			int a, b, res;
			a = 10;
				b = 2;
				res = a - b;
			assertEquals(res, calc3.substract(a, b));	
		}
		
}
	
	


