package learn1;

import java.util.Scanner;

//baitap4
public class learn4 {
	public static void main(String[] args) {
		String chuoi;
		char [] a;
		int k=0;
		int dd=0;
		Scanner scanner = new Scanner(System.in);
		chuoi = scanner.nextLine();
		a = new char[chuoi.length()];
		
		for(int i=0; i<chuoi.length(); i++) {
			if(chuoi.charAt(i) == 104 || chuoi.charAt(i) == 101 || chuoi.charAt(i) == 108 || chuoi.charAt(i) == 111 ) {
				a[k] = chuoi.charAt(i);
				k++;
			}
		}
		for(int h=0; h<k; h++) {
			if(a[h] == 104) {
				for(int e=h+1; e<k; e++) {
					if(a[e] == 101) {
						for(int l1=e+1; l1<k; l1++) {
							if(a[l1] == 108) {
								for(int l2=l1+1; l2<k; l2++) {
									if(a[l2] == 108) {
										for(int o=l2+1; o<k; o++) {
											if(a[o] == 111) {
												System.out.println("Yes");
												dd=1;
												break;
											}
										}
										break;
									}
								}
								break;
							}
						}
						break;
					}
				}
				break;
			}
		}
		if(dd == 0) {
			System.out.println("No");
		}
	}
}