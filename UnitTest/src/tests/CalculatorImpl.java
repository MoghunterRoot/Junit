package tests;

public  class CalculatorImpl implements Calculator{
	
	  public int add(int a, int b) {
		    int res = a + b;
		    return res; 
		  }
	  
	  public int divide(int a, int b) {
		  int res = a / b;
		  return res;
	  }
	  
	  public int multiply(int a, int b) {
		  int res = a * b;
		  return res;
	  }
	  
	  public int substract(int a, int b) {
		  int res = a - b;
		  return res;
	  }
}

