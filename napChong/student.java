package khoaPham;

import java.util.Scanner;

public class student extends person {
	private float score;
	
	public student() {
		this.score = 0;
	}

	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	@Override
	public void inputInfo() {
		super.inputInfo();
		Scanner scanner = new Scanner(System.in);
		System.out.print("score \t: ");
		this.score = scanner.nextFloat();
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("-score \t\t: "+this.getScore());
	}
}
