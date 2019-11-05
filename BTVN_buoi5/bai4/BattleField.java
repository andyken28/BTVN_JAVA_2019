package buoi5;

public class BattleField {

	public static void main(String[] args) {
		System.out.println("Khởi tạo: ");
		
		//construcsor để nhập hp và dmg
		
		Human humanOne = new Human("humanOne" , 300, 200);
		Human humanTwo = new Human("humanTwo" , 599, 200);
		
		humanOne.showInfo();
		humanTwo.showInfo();
		
		while(true) {
			humanOne.Attack(humanTwo);
			humanTwo.showInfo();
			if(humanTwo.getHP() <= 0) {
				System.out.println("  *******************");
				System.out.println("  * " + humanTwo.getName() + " DIED!! *");
				System.out.println("  *******************");
				System.out.println("\n **** " + humanOne.getName() + " WIN ****");
				break;
			}
			humanTwo.Attack(humanOne);
			humanOne.showInfo();
			if(humanOne.getHP() <= 0) {
				System.out.println("  *******************");
				System.out.println("  * " + humanOne.getName() + " DIED!! *");
				System.out.println("  *******************");
				System.out.println("\n **** " + humanTwo.getName() + " WIN ****");
				break;
			}
		}
//		for(int i=0; i<4; i++) {
//			humanOne.Attack(humanTwo);
//			humanTwo.showInfo();
//		}
//		for(int i=0; i<5; i++) {
//			humanTwo.Attack(humanTwo);
//			humanOne.showInfo();
//		}
//		if(humanOne.getHP() > humanTwo.getHP()) {
//			System.out.println("\n **** " + humanOne.getName() + " WIN ****");
//		}else if(humanTwo.getHP() > humanOne.getHP()) {
//			System.out.println("\n **** " + humanTwo.getName() + " WIN ****");
//		}else {
//			System.out.println("\n **** Bất phân thắng bại ****");
//		}
		
	}

}