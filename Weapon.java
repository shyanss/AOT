import java.util.*;

public class Weapon {

    protected String symbol;
    private Map<Integer, Integer> weapon = new HashMap<Integer, Integer>();
    private int highestLevel;
    
    public Weapon(String symbol) {
        this.symbol = symbol;

        for(int i=0 ; i<10 ; i++) {
            weapon.put(i,0);
        }
    }
    
    public void setHighestLevel(int x) {
    	highestLevel = x;
    }
    
    Wall w = new Wall();
    
    public void upgradeWeapon(Integer wallIndex) {
    	int currentLevel = weapon.get(wallIndex);
    	if(currentLevel<highestLevel) {
    		weapon.replace(wallIndex, currentLevel+1);
    	} else {
    		System.out.println("Cannot perform upgrade");
    	}
    }
    
    public void printWeapon() {
    	for(int level=highestLevel ; level>=0 ; level--) {
    		System.out.print("    ");
    		for(int wall=0 ; wall<10 ; wall++) {
    			if(weapon.containsValue(level)) {
    				System.out.print(symbol + " ");
    			}
    		}
    		System.out.println();
    	}
    }

}
