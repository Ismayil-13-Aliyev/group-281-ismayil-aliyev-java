package classwork_12;

public class GameCharacter {
	int name;
	int health = 100;
	int level = 1;
	
	public void takeDamage(int damage) {
		health = Math.max(0, health - damage);
	}
	
	public void heal(int amount) {
		health = Math.max(0, health + amount);
	}
	
	public boolean isAlive() {
		if(health > 0) {
			return true;
		} else {
			return false;
		}
 	}
	
	public void levelUp() {
		level += 1;
	}
}
