package tianchong;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int width = cin.nextInt();
		int height = cin.nextInt();
		if(width%4==0&&width%4==0){
			System.out.println(width*height/2);
		}else if(width%2==0&&height%2==0){
			System.out.println((width*height/4+1)*2);
		}else{
			System.out.println(width*height/2+1);
		}
	}

}
