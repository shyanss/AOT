import java.util.*;

public class Wall {

	// contains wall index & hp
	private Map<Integer, Integer> wall = new HashMap<Integer, Integer>();

	public Wall() {
		for (int i = 0; i < 10; i++) {
			wall.put(i, 50);
		}
	}
	
	public boolean checkWallIndex(Integer index) {
		return wall.containsKey(index);
	}
	
	Coin coin = new Coin();
	int balance = coin.getBalance();
	
	public void addHP(Integer wallIndex, Integer amount) {
		if(amount>0 && amount<100 && balance>amount) {
			wall.replace(wallIndex, amount);
		}
	}

	public void printWall() {
		
		System.out.print("    ");
		for(int col=0 ; col<10 ; col++) {
			System.out.print("-- ");
		}
		System.out.println();
			
		System.out.print("    ");
		for(int col=0 ; col<10 ; col++) {
			System.out.printf("%2d ", col);
		}
		System.out.println();
			
		System.out.print("    ");
		for(int col=0 ; col<10 ; col++) {
			System.out.printf("%2d ", wall.get(col));
		}
		System.out.println();
			
		System.out.print("    ");
		for(int col=0 ; col<10 ; col++) {
			System.out.print("-- ");
		}
	}

}
