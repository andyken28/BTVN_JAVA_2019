package buoi7_b3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;



public class Class {
	private String MaLop;
	private String tenLop;
	private String ngayMo;
	Student [] sinhVien;
	public static int n;
	private String giaoVien;
	
	
	
	public String getMaLop() {
		return MaLop;
	}
	public void setMaLop(String maLop) {
		MaLop = maLop;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public String getNgayMo() {
		return ngayMo;
	}
	public void setNgayMo(String ngayMo) {
		this.ngayMo = ngayMo;
	}
	public Student[] getSinhVien() {
		return sinhVien;
	}
	public void setSinhVien(Student[] sinhVien) {
		this.sinhVien = sinhVien;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public String getGiaoVien() {
		return giaoVien;
	}
	public void setGiaoVien(String giaoVien) {
		this.giaoVien = giaoVien;
	}
	
	public void InputInfo() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nhâp thông tin lop hoc:");
		
		System.out.print("\tMã lop: ");
		this.setMaLop(sc.nextLine());
		System.out.print("\tTên lop: ");
		this.setTenLop(sc.nextLine());
		System.out.print("\tNgày mo: ");
		this.setNgayMo(sc.nextLine());
		System.out.print("\tGiáo viên: ");
		this.setGiaoVien(sc.nextLine());
		System.out.print("Nhâp so luong sinh viên n: ");
		this.setN(Integer.parseInt(sc.nextLine()));
		sinhVien = new Student[this.getN()];
		
		for(int i=0; i<n; i++) {
			System.out.println("\tsinh viên: " + (i+1));
			sinhVien[i] = new Student();
			sinhVien[i].InputInfo();
			
		}
		
	}
	
	public void ShowInfo() {
		System.out.println("-------------------");
		System.out.println("Thông tin lop: ");
		System.out.println("\tMã lop: " + getMaLop());
		System.out.println("\tTên lop: " + getTenLop());
		System.out.println("\tNgày mo: " + getNgayMo());
		System.out.println("\tGiáo viên: " + getGiaoVien());
		System.out.println("\tdanh sách Sinh vien trong lop: \n");
		System.out.println("STT\tTên\tNgày Sinh\tQuê quán\tMã SV\t Ngành\t Khóa hoc");
		for(int i=0; i<n; i++) {
			System.out.print((i+1));
			sinhVien[i].ShowInfo();
		}
	}
	
	public void ShowTheoKhoa(int khoaHoc) {
		System.out.println("\n-------------------");
		System.out.println("\tdanh sách Sinh vien khóa 11: \n");
		int dem=0;
		System.out.println("STT\tTên\tNgày Sinh\tQuê quán\tMã SV\t Ngành\t Khóa hoc");
		for(int i=0; i<n; i++) {
			if(sinhVien[i].getKhoaHoc() == khoaHoc) {
				dem++;
				System.out.print((i+1));
				sinhVien[i].ShowInfo();
			}
		}
		if(dem==0) {
			System.out.println("\tNull !!!");
		}else {
			System.out.println("\n- có "+ dem +" sinh vien khoa "+ khoaHoc);
		}
	}
	
//	private void MySwap(Student sinhVien1, Student sinhVien2){
//		Student temp = new Student();
//		temp = sinhVien1;
//		sinhVien1 = sinhVien2;
//		sinhVien2 = temp;
//	}

	public void ShowTheoKhoa() {
		for(int i=0; i<sinhVien.length-1; i++) {
			for(int j=i+1; j<sinhVien.length; j++) {
				if(sinhVien[i].getKhoaHoc() > sinhVien[j].getKhoaHoc()) {
//					MySwap(sinhVien[i], sinhVien[j]);
					Student temp = new Student();
					temp = this.sinhVien[i];
					this.sinhVien[i] = this.sinhVien[2];
					this.sinhVien[2] = temp;
				}
			}
		}
		System.out.println("\n-------------------");
		System.out.println("\tdanh sách Sinh viên sáp xêp: \n");
		System.out.println("STT\tTên\tNgày Sinh\tQuê quán\tMã SV\t Ngành\t Khóa hoc");
		 for(int i=0; i<n; i++) {
			System.out.print((i+1));
			sinhVien[i].ShowInfo();
		 }
	}

	
}

