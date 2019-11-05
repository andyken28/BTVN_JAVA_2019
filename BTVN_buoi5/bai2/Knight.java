package buoi5;

public class Knight {
	private String Name;
	private int HP;
	private int MP;
	
	public Knight(String name, int hP, int mP) {
		super();
		Name = name;
		HP = hP;
		MP = mP;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getMP() {
		return MP;
	}

	public void setMP(int mP) {
		MP = mP;
	}
	
	public void Heal() {
		this.MP -= 50;
		this.HP += 30;
	}
	
	public void Show() {
		System.out.println("show Knight: ");
		System.out.println("name \t: " + this.getName());
		System.out.println("HP \t: " + this.getHP());
		System.out.println("MP \t: " + this.getMP());
		System.out.println("------------------");
	}

}
