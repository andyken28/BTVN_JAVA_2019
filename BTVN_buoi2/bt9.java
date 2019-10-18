package learn1;

import java.util.Scanner;

public class bt9 {

	public static void main(String[] args) {
		float a, b;
		
		System.out.println("nhâp hệ số pt ax+b=0: " );
		Scanner sc = new Scanner(System.in);
		System.out.print("a= ");
		a = sc.nextFloat();
		System.out.print("b= ");
		b = sc.nextFloat();
		System.out.print("x= " + (-b/a));
		
	}
}
