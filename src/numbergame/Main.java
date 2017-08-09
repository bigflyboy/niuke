package numbergame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		ArrayList<Integer> nums = new ArrayList<>();
		for(int i=0;i<n;i++){
			nums.add(cin.nextInt());
		}
		Collections.sort(nums);
		int sum =0;
		int count =0;
		for(int i=0;i<nums.size();i++){
			if(nums.get(i)>(sum+1)){
				count = sum+1;
				break;
			}else{
				sum+=nums.get(i);
			}
				
		}
		System.out.println(count);
	}

}
