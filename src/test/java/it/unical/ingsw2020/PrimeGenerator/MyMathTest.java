package it.unical.ingsw2020.PrimeGenerator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MyMathTest {

	private MyMath math;
	
	@Before  
	public void prepare() {
		System.out.println("Before");
		math = new MyMath();
	}
	
	@Test
	public void primeNumberGeneratorWokr() {
		assertEquals(new ArrayList<Integer>(), math.primeNumberGenerator(1));
		assertEquals(Arrays.asList(2,3,5,7,11,13,17,19), math.primeNumberGenerator(20));
	}
	
	@Test
	public void isPrimeWork() {
		assertFalse(math.isPrime(9));		
		assertTrue(math.isPrime(2));
		assertFalse(math.isPrime(9));
		List <Integer> primes= Arrays.asList(11,13,17,23,31,41,101,83);
			for( int i : primes)
				assertTrue(math.isPrime(i));
	}
}
