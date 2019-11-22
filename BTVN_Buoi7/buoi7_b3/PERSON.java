package buoi7_b3;

import java.util.Scanner;

public class PERSON {
	private String name;
	private String birthDay;
	private String homeTown;
	
	
	
	public PERSON() {
		super();

		this.name = "name";
		this.birthDay = "birthDay";
		this.homeTown = "homeTown";
	}
	
	
	public PERSON(String name, String birthDay, String homeTown) {
		super();
		this.name = name;
		this.birthDay = birthDay;
		this.homeTown = homeTown;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	
	public void InputInfo() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\t\tTên : ");
		this.setName(scanner.nextLine());
		System.out.print("\t\tNgày sinh : ");
		this.setBirthDay(scanner.nextLine());
		System.out.print("\t\tQuê quán : ");
		this.setHomeTown(scanner.nextLine());
	}
	
	public void ShowInfo() {
		System.out.print("\t" + this.getName());
		System.out.print("\t" + getBirthDay());
		System.out.print("\t\t" + getHomeTown());
	}
	
}
