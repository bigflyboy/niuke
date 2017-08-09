package liangzhongpaixu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		boolean lengthFlag = true;
		boolean dicFlag = true;
		String[] strings = new String[n];
		for(int i =0;i<n;i++){
			strings[i] = cin.next();
		}
		for(int i =1;i<n;i++){
			if(!(strings[i-1].length()<=strings[i].length())){
				lengthFlag = false;
				break;
			}
		}
		for(int i = 0;i<n-1;i++){
			if(strings[i].compareTo(strings[i+1])>0){
				dicFlag = false;
				break;
			}
		}
		if(lengthFlag&&dicFlag){
			System.out.println("both");
		}else if(lengthFlag){
			System.out.println("lengths");
		}else if(dicFlag){
			System.out.println("lexicographically");
		}else{
			System.out.println("none");
		}
	}

}
