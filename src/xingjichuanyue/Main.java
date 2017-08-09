package xingjichuanyue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		long n = cin.nextLong();
		long i = (long)Math.sqrt(n)-1;
		while(i+i*i<=n){
			i++;
		}
		cin.close();
		System.out.println(i-1);
	}

}
