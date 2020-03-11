package junitdemo;

public class Calculator {

	public static void main(String[] args) {

		Calculator obj = new Calculator();
		System.out.println(obj.add(1, 2));
		System.out.println(obj.subtract(1, 2));
		System.out.println(obj.multiply(1, 2));
		System.out.println(obj.divide(5, 5));

	}

	public double add(double a, double b) {
		return (a + b);
	}

	public double subtract(double a, double b) {
		return (a - b);
	}

	public double multiply(double a, double b) {
		return (a * b);
	}

	public double divide(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException("Error: Attempting to dividew by zero");
		}
		return (a / b);
	}

}
