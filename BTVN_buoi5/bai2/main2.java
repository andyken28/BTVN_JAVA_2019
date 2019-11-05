package buoi5;

public class main2 {

	public static void main(String[] args) {
		Knight knightOne = new Knight("knightOne", 100, 200);

		int k = knightOne.getMP()/50;
		for(int i=0; i<k; i++) {
			knightOne.Heal();
			knightOne.Show();
		}

	}

}
