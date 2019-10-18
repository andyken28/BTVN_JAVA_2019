package learn1;

import java.util.Scanner;

//baitap2
public class learn2 {
	public static void main(String[] args) {
		String chuoi;
		int s=0;
		Scanner sc = new Scanner(System.in);
		chuoi = sc.nextLine();
		
		for(int i=0; i<chuoi.length(); i++) {
			if((int)chuoi.charAt(i) >= 48 && (int)chuoi.charAt(i) <= 57) {
				s += chuoi.charAt(i)-48;
			}
		}
		System.out.print(s);
	}
}