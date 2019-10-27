package KiemTra;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		int n;
		
		
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		float a[] = new float[n+1];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextFloat();
		}
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i] < a[j]) {
					float k = a[i];
					a[i] = a[j];
					a[j] = k;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " " );
		}
		
		int x;
		System.out.print("nhap x: ");
		x = sc.nextInt();
		//6 = 1 +2 +3
		int k = 0;
		int Sum = 0;
		for(int i=1; i<=x/2; i++) {
			if(x%i == 0) {
				k++;
				Sum += i; 
			}
		}
		
		if(x == Sum) {
			a[n] = a[n-1];
			a[n-1]=(float)x;
			for(int i=0; i<n+1; i++) {
				System.out.print(a[i] + " " );
			}
		}else {
			System.out.print("x khong phai la so hoan hao");
		}
		
	}
}
