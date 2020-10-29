package it.unical.ingsw2020.PrimeGenerator;

import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

	private static MyMath math;
	
	@BeforeClass
	public static void prepare() {
		System.out.println("Before");
		math = new MyMath();
	}
	
	@Test
	public void primeNumberGeneratorWokr() {
	}
}
