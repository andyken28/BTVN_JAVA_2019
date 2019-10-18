package learn1;

import java.util.Scanner;

public class bt7 {

	public static void main(String[] args) {

		float n, m;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextFloat();
		m = sc.nextFloat();
		
		if(m>=n) {
			System.out.println("max: " + m);
			System.out.println("min: " + n);
		}else {
			System.out.println("max: " + n);
			System.out.println("min: " + m);
		}
	}

}
