package com.wangyi.xiachufang;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChuFang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		while(cin.hasNextLine()){
			String tmp = cin.nextLine();
			String[] foods = tmp.split(" ");
			for(int i = 0; i<foods.length;i++){
				map.put(foods[i], 1);
			}
		}
		System.out.println(map.size());
	}

}
