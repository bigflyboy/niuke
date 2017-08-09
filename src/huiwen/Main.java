package huiwen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        String A = s.next();
        String B = s.next();
 
        char[] chA = A.toCharArray();
        int count = 0;
        for (int i = 0; i < chA.length + 1; i++) {
            String chs = new String(chA, 0, i) + B + new String(chA, i, chA.length - i);
            if (isHuiWen(chs)) {
                count++;
            }
        }
        System.out.println(count);
    }
	
	public static boolean isHuiWen(String str){
		int i = 0;
		int j = str.length()-1;
		char[] cha = str.toCharArray();
		while(i<j){
			if(cha[i]==cha[j]){
				i++;
				j--;
			}else{
				return false;
			}
		}
		return true;
	}
	
}
