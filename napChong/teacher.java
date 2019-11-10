package khoaPham;

import java.util.Calendar;

public class teacher extends person{
	private double salary; 
	
	public teacher(){
		super();
		this.salary = 0;
	}
	
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
