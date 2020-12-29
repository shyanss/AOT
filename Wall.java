import java.util.*;

public class Wall {

	// contains wall index & hp
	private Map<Integer, Integer> wall = new HashMap<Integer, Integer>();

	public Wall() {
		for (int i = 0; i < 10; i++) {
			wall.put(i, 50);
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
