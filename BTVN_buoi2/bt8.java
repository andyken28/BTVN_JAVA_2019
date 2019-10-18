package learn1;

import java.util.Scanner;

public class bt8 {

	public static void main(String[] args) {
		
		float x, y, z;
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextFloat();
		y = sc.nextFloat();
		z = sc.nextFloat();
		
		float max = x;
		float min = x;
		if(x<=y) {
			max = y;
		}else
			min = y;
		if(x<=z) {
			max = z;
		}else
			min = z;
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}

}
