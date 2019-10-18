package learn1;

import java.util.Scanner;

public class bt6 {

	public static void main(String[] args) {
		int n1,m1;
		float n2,m2;
		
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		m1 = sc.nextInt();
		
		n2 = sc.nextFloat();
		m2 = sc.nextFloat();
		
		System.out.println("tông 2 số nguyên: " + (n1 + m1));
		System.out.println("tông 2 số thực: " + (n2 + m2));
		System.out.println("tông n1 n2: " + (n1 + n2));
	}

}
