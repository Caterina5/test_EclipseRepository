package it.unical.ingsw2020.PrimeGenerator;

import java.util.ArrayList;
import java.util.List;

public class MyMath {


	public boolean isPrime(int n) {
		if(n<2)
			return false;
		if (n==2)
			return true;
		int i=2;
		while(i<n){
			if(n%i==0)
				return false;
			i++;
		}		
		return true;	
	}

	public List<Integer> primeNumberGenerator(int n) {
		List<Integer> numberPrime = new ArrayList<Integer>();
				for(int i=0; i<=n; i++)
					if(isPrime(i))
						numberPrime.add(i);
			return numberPrime;	
	}
	
	
}
