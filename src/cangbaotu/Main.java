package cangbaotu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String strs01 = sin.nextLine();
        String strs02 = sin.nextLine();
        char[] strs02Char = strs02.toCharArray();
        String result = "Yes";
        int m = 0;
        for(int i=0;i<strs02Char.length;i++){
            m = strs01.indexOf(strs02Char[i]);
            if(m!=-1){
                strs01 = strs01.substring(m+1);
                continue;
            }
            result = "No";
             
        }
        System.out.println(result);
         
    }
}
