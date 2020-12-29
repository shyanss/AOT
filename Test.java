public class Test {
	public static void main(String[] args) {
		
		Ground g = new Ground();
		g.setGround();
		g.printGround();
		
		
		Weapon wp = new Weapon("**");
		wp.setHighestLevel(3);
		wp.upgradeWeapon(1);
		wp.printWeapon();
		
		Wall w = new Wall();
		w.printWall();
	}
}
