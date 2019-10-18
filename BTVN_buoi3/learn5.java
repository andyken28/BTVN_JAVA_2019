package learn1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class learn5 {
	public static long tinh(int d, long x, long y) {
		long z=0;
		if(d==0) {
			if(x+y>=10) {
				z = (x+y)%10;
				d=1;
			}else {
				z = x+y;
				d=0;
			}
		}else if(d==1) {
			if( x+y >= 9) {
				z = (x+y+1)%10;
				d=1;
			}else {
				z = x+y+1;
				d=0;
			}
		}
		return z;
	}
	public static void main(String[] args) throws IOException {
		long [] a;
		long [] b;
		long [] c;
		int n1,n2,n;
		int d=0;
		
		BufferedReader br = null;
		
   
		br = new BufferedReader(new FileReader("C:\\Users\\5SCOMPUTER\\Desktop\\z.txt")); 
		
		
	            
		
		
		Scanner sc = new Scanner(System.in);
		String chuoia;
		String chuoib;
		
		chuoia = br.readLine();
		chuoib = br.readLine();
		
//		chuoia = sc.nextLine();
//		chuoib = sc.nextLine();
		
		
		//gán số lượng phần tử
		n1 = chuoia.length();
		n2 = chuoib.length();

		if(n2>=n1)
			n = n2;
		else
			n = n1;
		
		a = new long[n];
		b = new long[n];
		c = new long[n];
		
		System.out.println(n);
		
		//gán chuổi a vào mảng a
		int j=0;
		for (int i=n-n1; i<n; i++) { 
			a[i] = (int)chuoia.charAt(j)-48;
			j++;
		}
		//gán chuổi b vào mảng b
		j=0;
		for (int i=n-n2; i<n; i++) {
			b[i] = (int)(chuoib.charAt(j)-48);
			j++;
		}
	
		
		//xuất mảng a
		System.out.println("mang a:");
		for (int i=0; i<n; i++) {
			System.out.print(a[i]);
		}
		//xuất mảng b
		System.out.println("\nmang b:");
		for (int i=0; i<n; i++) {
			System.out.print(b[i]);
		}
		
		for(int i=n-1; i>=0; i--) {
			
			c[i]=tinh(d,a[i],b[i]);
			if(a[i] + b[i] + d >= 10)
				d=1;
			else
				d=0;
		}
		
		//xuất mảng c
		System.out.println("\nmang c:");
		for (int i=0; i<n; i++) {
			System.out.print(c[i]);
		}
	}
}
