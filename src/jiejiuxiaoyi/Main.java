package jiejiuxiaoyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		ArrayList<ZuoBiao> nums = new ArrayList<>();
		int n = cin.nextInt();
		for(int i =0;i<n;i++){
			ZuoBiao zuoBiao = new ZuoBiao();
			zuoBiao.x = cin.nextInt();
			nums.add(zuoBiao);
		}
		for(int i = 0;i<n;i++){
			nums.get(i).y = cin.nextInt();
		}
		int[] count = new int[n];
		for(int i=0;i<n;i++){
			count[i] = nums.get(i).x-1+nums.get(i).y-1;
		}
		Arrays.sort(count);
		System.out.println(count[0]);
	}
	public static class ZuoBiao{
		public int x;
		public int y;
	}
}
