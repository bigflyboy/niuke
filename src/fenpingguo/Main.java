package fenpingguo;

import java.util.Scanner;

public class Main {
	private static int n = 0;
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			n = cin.nextInt();
			int[] nums = new int[n];
			for(int i =0;i<nums.length;i++){
				nums[i] = cin.nextInt();
			}
			int sum = 0;
			for(int i =0;i<nums.length;i++){
				sum = sum+nums[i];
			}
			if(sum%n!=0){
				System.out.println(-1);
				continue;
			}
			int avg = sum/n;
			int count = 0;
			boolean flag = true;
			for(int i=0;i<n;i++){
				if((nums[i]-avg)%2!=0){
					flag=false;
					break;
				}
				count+=(Math.abs(nums[i]-avg)/2);
			}
			if(flag){
				System.out.println(count/2);
			}else{
				System.out.println(-1);
			}
		}

	}

}
