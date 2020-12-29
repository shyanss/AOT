public class Coin {
	
	private int coin;
	
	public void addCoin(int amount) {
		if(amount>0 && amount<10) {
			coin += amount;
			getBalance();
		} else {
			System.out.println("Invalid coin");
		}
	}
	
	public void getBalance() {
		System.out.println("Current balance: " + coin);
	}
	
	public void spendCoin(int amount) {
		if(amount>0 && amount<coin) {
			coin -= amount;
			getBalance();
		} else {
			System.out.println("Negative!");
		}
	}
	
}