package khoaPham;

public class main {
	public static void main(String[] args) {
		
		student []student = new khoaPham.student[5];
		for(int i=0; i<5; i++) {
			System.out.println("student " + (i+1));
			student[i] = new student();
			student[i].inputInfo();
			System.out.println("----------------");
			student[i].showInfo();
			System.out.println("----------------");
		}
	}
}
