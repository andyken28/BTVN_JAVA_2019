package khoaPham;

import java.util.Calendar;
import java.util.Scanner;

public class person {
	private String name;
	private String code;
	private int birthDay;
	
	public person() {
		super();
		this.name = "SV Name";
		this.code = "SV Code";
		this.birthDay = Calendar.getInstance().get(Calendar.YEAR);
	}
	
	public person(String name, String code, int birthDay) {
		super();
		this.name = name;
		this.code = code;
		this.birthDay = birthDay;
	}
	
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	public int getAge() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.YEAR) - this.getBirthDay();
		
	}
	public void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Info: ");
		System.out.print("name \t: ");
		this.name = scanner.nextLine();
		System.out.print("code \t: ");
		this.code = scanner.nextLine();
		System.out.print("birthday: ");
		this.birthDay = scanner.nextInt();
	}
	public void showInfo() {
		System.out.println("Show Info: ");
		System.out.println("-name \t\t: "+ this.getName());
		System.out.println("-code \t\t: "+ this.getCode());
		System.out.println("-birthday \t: "+this.getBirthDay());
		System.out.println("-age \t\t: "+this.getAge());
	}
}

