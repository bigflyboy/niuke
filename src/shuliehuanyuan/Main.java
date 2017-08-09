package shuliehuanyuan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int RES = 0;
			int n = cin.nextInt();
			int k = cin.nextInt();
			int[] nums = new int[n];
			boolean[] flag = new boolean[n + 1];
			ArrayList<Integer> list = new ArrayList<>();
			ArrayList<ArrayList<Integer>> perm = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				nums[i] = cin.nextInt();
				if (nums[i] != 0) {
					flag[nums[i]] = true;
				}
			}
			for (int i = 1; i <= n; i++) {
				if (flag[i] == false)
					list.add(i);
			}
			calperm(perm, list, 0);
			int cv = 0;
			for (int i = 0; i < n; i++) {
				if (nums[i] != 0) {
					for (int j = i + 1; j < n; j++) {
						if (nums[j] != 0 && nums[i] < nums[j])
							cv++;
					}
				}
			}

			for (ArrayList<Integer> tem : perm) {
				int val = cv;
				int[] tmpA = Arrays.copyOf(nums, n);
				val += calvalue(tem, tmpA);
				if (val == k)
					RES++;
			}
			System.out.println(RES);
		}

	}

	// 计算排列的顺序对
	public static int calvalue(List<Integer> list, int[] A) {
		int val = 0;
		int j = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				A[i] = list.get(j++);
				for (int k = 0; k < i; k++) {
					if (A[k] != 0 && A[k] < A[i])
						val++;
				}
				for (int k = i + 1; k < A.length; k++) {
					if (A[k] != 0 && A[k] > A[i])
						val++;
				}
			}
		}
		return val;
	}

	// 计算全排列
	public static void calperm(List<ArrayList<Integer>> perm, ArrayList<Integer> list, int n) {
		if (n == list.size()) {
			perm.add(new ArrayList<Integer>(list));
		} else {
			for (int i = n; i < list.size(); i++) {
				Collections.swap(list, i, n);
				calperm(perm, list, n + 1);
				Collections.swap(list, i, n);
			}
		}
	}
}
