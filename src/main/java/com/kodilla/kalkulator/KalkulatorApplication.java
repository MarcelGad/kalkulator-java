package com.kodilla.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		int sum;
        sum = calculator.add(10,8);
        System.out.println(sum);

		int diffrence = calculator.substract(18,4);
		System.out.println(diffrence);
	}
}
