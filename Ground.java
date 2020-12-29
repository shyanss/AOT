public class Ground {

	private String[][] ground = new String[10][19];

	// ground
	public void setGround() {
		for (int i = 0; i < ground.length; i++) {
			for (int j = 0; j < ground[i].length; j++) {
				if (j % 2 == 0)
					ground[i][j] = "AA";
				else
					ground[i][j] = " ";
			}
		}
	}

	//print row index + ground
	public void printGround() {
		System.out.println("Row");
		for (int i=0 ; i<ground.length ; i++) {
			System.out.print(i + "   ");
			for (int j=0 ; j<ground[i].length ; j++) {
				System.out.print(ground[i][j]);
			}
			System.out.println();
		}
	}

}
