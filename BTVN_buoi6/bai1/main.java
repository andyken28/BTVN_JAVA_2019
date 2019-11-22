package buoi6;

public class main {
	public static void main(String[] args) {
		ConHeo conHeoOne = new ConHeo();
		ConHeo conHeoTwo = new ConHeo("Heo two", 150.5, 15);
		ConHeo conHeoThree = new ConHeo(19);
		ConHeo conHeoFour = new ConHeo(105.0);
		ConHeo conHeoFire = new ConHeo("Heo fire");
		
		conHeoOne.ShowInfo();
		conHeoTwo.ShowInfo();
		conHeoThree.ShowInfo();
		conHeoFour.ShowInfo();
		conHeoFire.ShowInfo();
	}
}
