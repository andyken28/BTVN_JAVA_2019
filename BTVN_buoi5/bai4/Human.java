package buoi5;

import java.util.Calendar;
import java.util.Scanner;

public class Human {
	private String name;
	private int HP;
	private int Dmg;
	
	public Human() {
		this.name = "Name Human";
		this.HP = 250;
		this.Dmg = 50;
	}
	public Human(String name) {
		this.name = name;
		this.HP = 250;
		this.Dmg = 50;
	}
	
	public Human(String name, int hP, int dmg) {
		super();
		this.name = name;
		HP = hP;
		Dmg = dmg;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public int getDmg() {
		return Dmg;
	}
	public void setDmg(int dmg) {
		Dmg = dmg;
	}
	
	public void Attack(Human human) {
		System.out.println(this.name + " Attack " + human.name);
		human.HP -= this.Dmg;
	}
	
	
	public void showInfo() {
		System.out.println("\t" + this.getName());
		System.out.println("-HP \t\t: "+ this.getHP());
		System.out.println("-Dmg \t\t: "+this.getDmg());
		System.out.println("-----------------------");
	}
}
