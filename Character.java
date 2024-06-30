public class Character {
	
	private int health;
	private int maxHealth;
	private int dmg;
	private int def;
	private int[] inventory;
	private int curency;
	
	
	public Character(int choice) {
		switch(choice){
			case 1:
				this.health = 20;
				this.maxHealth = 20;
				this.dmg = 5;
				this.def = 2;
				this.inventory = new int[10];
				this.curency = 0;
				break;
			case 2:
				this.health = 15;
				this.maxHealth = 15;
				this.dmg = 4;
				this.def = 2;
				this.inventory = new int[8];
				this.curency = 0;
				break;
			case 3:
				this.health = 10;
				this.maxHealth = 10;
				this.dmg = 3;
				this.def = 1;
				this.inventory = new int[6];
				this.curency = 0;
				break;
		}
	}
	
	public int health() {
		return this.health;
	}
	
}