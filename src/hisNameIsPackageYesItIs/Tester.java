package hisNameIsPackageYesItIs;

import java.util.Scanner;

public class Tester {
	
	public static int prInput;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Number to test: ");
		prInput = s.nextInt() ;
		
		Number n = new Number(prInput);
		if (n.isPrime())
		{
			System.out.println(prInput + " is prime");
		}
		else
		{
			System.out.println(prInput + " is NOT prime");
		}
	}

}
