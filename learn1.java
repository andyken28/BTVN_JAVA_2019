package learn1;

import java.util.Scanner;

//baitap1
public class learn1 {
	public static void main(String[] args) {
		int [] a;
		a = new int[5];

		java.util.Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			a[i] = sc.nextInt();
		}
		//tìm giá trị nhỏ nhất min
		int min=a[0];
		for(int i=0; i<5; i++) {
			if(min>a[i])
				min=a[i];
		}
		//tìm gia trị lớn nhất max1
		int max1=a[0];
		for(int i=0; i<5; i++) {
			if(max1<=a[i])
				max1=a[i];
		}
		if(min == max1) {
			System.out.print("null");
		}
		else {
			//tìm gia trị lớn thứ 2 max2
			int max2=min;
			for(int i=0; i<5; i++) {
				if(max2<=a[i] && a[i] != max1)
					max2=a[i];
			}
			if(min == max2) {
				System.out.print("null");
			}
			else {
				//tìm gia trị lớn thứ 3 max3
				int max3=min;
				for(int i=0; i<5; i++) {
					if(max3<=a[i] && a[i] != max1 && a[i] != max2)
						max3=a[i];
				}
				System.out.print(max3);
			}
		}
	}
}