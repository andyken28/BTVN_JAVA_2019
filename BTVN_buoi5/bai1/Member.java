package buoi5;

import java.util.Calendar;
import java.util.Scanner;

public class Member {
	private String name;
	private String code;
	private String clas;
	private int birthDay;
	
	
	public Member() {
		super();
		this.clas = "SV Class";
		this.name = "SV Name";
		this.code = "SV Code";
		this.birthDay = Calendar.getInstance().get(Calendar.YEAR);
	}
	
	public Member(String clas, String name, String code, int birthDay) {
		super();
		this.clas = clas;
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

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
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
		System.out.print("class \t: ");
		this.clas = scanner.nextLine();
		System.out.print("birthday: ");
		this.birthDay = scanner.nextInt();
	}
	public void showInfo() {
		System.out.println("Show Info: ");
		System.out.println("-name \t\t: "+ this.getName());
		System.out.println("-code \t\t: "+ this.getCode());
		System.out.println("-class \t\t: " + this.getClas());
		System.out.println("-birthday \t: "+ this.getBirthDay());
		System.out.println("-age \t\t: "+this.getAge());
	}
}
