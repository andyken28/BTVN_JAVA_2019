package buoi7_b3;

import java.util.Scanner;

public class Student extends PERSON{
	private String MaSV;
	private String nganh;
	private int khoaHoc;
	
	public Student() {
		super();
		this.MaSV = "MaSV";
		this.nganh = "nganh";
		this.khoaHoc = 0;
	}
	
	public Student(String maSV, String nganh, int khoaHoc) {
		super();
		MaSV = maSV;
		this.nganh = nganh;
		this.khoaHoc = khoaHoc;
	}
//	
	public String getMaSV() {
		return MaSV;
	}
	public void setMaSV(String maSV) {
		MaSV = maSV;
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public int getKhoaHoc() {
		return khoaHoc;
	}
	public void setKhoaHoc(int khoaHoc) {
		this.khoaHoc = khoaHoc;
	}
	
	@Override
	public void InputInfo() {
		super.InputInfo();
		Scanner scanner = new Scanner(System.in);
		System.out.print("\t\tMã sinh viên : ");
		this.setMaSV(scanner.nextLine());
		System.out.print("\t\tNgành : ");
		this.setNganh(scanner.nextLine());
		System.out.print("\t\tKhóa hoc : ");
		this.setKhoaHoc(Integer.parseInt(scanner.nextLine()));
	}
	
	@Override
	public void ShowInfo() {
		super.ShowInfo();
		System.out.print("\t\t"+ this.getMaSV());
		System.out.print("\t " + getNganh());
		System.out.println("\t " + getKhoaHoc());
	}
}
