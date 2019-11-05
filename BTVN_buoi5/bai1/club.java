package buoi5;

import java.util.Scanner;

public class club {
	public static void main(String[] args) {
		String a = "HIT";
		
		System.out.print("nhập n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Member []Club = new Member[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("nhập SV " + (i+1));
			Club[i] = new Member();
			Club[i].inputInfo();
			System.out.println("-----------------------");
		}
		for(int i=0; i<n; i++) {
			if(Club[i].getName().equals(a) == true) {
				System.out.println("SV " + (i+1));
				Club[i].showInfo();
				System.out.println("-----------------------");
			}
		}
	}
}
