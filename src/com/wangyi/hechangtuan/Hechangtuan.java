package com.wangyi.hechangtuan;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Hechangtuan {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = 0, k = 0, d = 0;
		int[] array = null;
		n = cin.nextInt();
		array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = cin.nextInt();
		}
		k = cin.nextInt();
		d = cin.nextInt();
		System.out.println(hechang(n, array, k, d));
	}

	public static long hechang(int n, int[] nums, int k, int d) {
		long[][] max = new long[k][n];
		long[][] min = new long[k][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// min[i][j]=Integer.MIN_VALUE;
				max[i][j] = 1;
				if (i == 0) {
					min[i][j] = nums[j];
					max[i][j] = nums[j];
				}
			}
		}

		for (int i = 1; i < k; i++) {
			for (int j = 0; j < n; j++) {
				for (int m = 1; m <= d; m++) {
					if (j - m >= 0) {
						if (nums[j] > 0) {
							min[i][j] = Math.min(min[i][j], min[i - 1][j - m] * nums[j]);
							max[i][j] = Math.max(max[i][j], max[i - 1][j - m] * nums[j]);
						} else {
							min[i][j]=Math.min(min[i][j], max[i-1][j-m]*nums[j]);
							max[i][j]=Math.max(max[i][j], min[i-1][j-m]*nums[j]);
						}
					}
				}
			}
		}
		long Max = 0;
		for(int i=0;i<n;i++)
			Max = Math.max(Max, max[k-1][i]);
		return Max;

	}

}
