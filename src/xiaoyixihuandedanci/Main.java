package xiaoyixihuandedanci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String string = cin.next();
		char[] chr = string.toCharArray();
		boolean one = false;
		boolean two = false;
		boolean three = false;
		for(int i =0;i<chr.length;i++){
			if((int)chr[i]>90&&(int)chr[i]<65){
				one = true;
				break;
			}
		}
		for(int i =0;i<chr.length-1;i++){
			if(chr[i]==chr[i+1]){
				two = true;
				break;
			}
		}
		if(chr.length>3){
			for(int i =0;i<chr.length;i++){
				for(int j=i+1;j<chr.length;j++){
					for(int m =j+1;m<chr.length;m++){
						for(int n=m+1;n<chr.length;n++){
							if(chr[i]==chr[m]&&chr[j]==chr[n]){
								three = true;
								break;
							}
						}
						if(three)
							break;
					}
					if(three)
						break;
				}
				if(three)
					break;
			}
		}
		if(one||two||three){
			System.out.println("Dislike");
		}else{
			System.out.println("Likes");
		}
		
	}

}
