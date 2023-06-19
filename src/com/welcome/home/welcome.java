package com.welcome.home;
import java.util.Random;

public class welcome {
	

	public static void main(String[] args) {
		  int edad = 25;
		System.out.println("Welcome, user!");
		System.out.println("La edad es "+ edad + ", Felicitaciones!");
		
		int cantidad = 100;
		int divisor = 3;
		
		double resultado = (double) cantidad /divisor;
		System.out.println(resultado);
		
		String caracter = String.valueOf(cantidad) + divisor;
		System.out.println(caracter);
		

		//generar un numero random
		Random random = new Random();
		int randomNumber = random.nextInt(10);
		int randomNumberbyMath = 10 + (int)  (Math.random() * 20);

		System.out.println(randomNumber + " number by random");
		System.out.println(randomNumberbyMath + " number by math");
		
		if(randomNumberbyMath > 20 ) {
			System.out.println("This number "+ randomNumberbyMath +" is bigger than 20");
		}else if(randomNumber < 10) {
			System.out.println("This number "+ randomNumber  +" is smaller than 10");
		} else if(randomNumber == 7 && randomNumberbyMath == 19) {
			System.out.println("OMG What a casuality! The number "+ randomNumber  +" is equal to 7 and the number "
					+  randomNumberbyMath + " is equal to 19");
		} 


	}

}
