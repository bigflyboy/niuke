package Fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int num = cin.nextInt();
		int one = 0;
		int two = 1;
		int three=0;
		while(three<num){
			three = one+two;
			one = two;
			two = three;
		}
		System.out.println(Math.min(num-one, three-num));
	}

}
