package KiemTra;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		String tr;
		char a[];
		int dem = 0;
		int S = 0;
		Scanner sc = new Scanner(System.in);
		tr = sc.nextLine();
		
		a = new char[tr.length()];
		
		for(int i=0; i<tr.length(); i++) {
			if(tr.charAt(i) >=48 && tr.charAt(i)<=57) {
				if((tr.charAt(i)-48)%2==0) {
					dem++;
					S +=(tr.charAt(i)-48);
				}
			}
		}
		System.out.println("các số chẳn: "+ dem);
		System.out.println("tổng các số chẳn: "+ S);
	}
}
