[Back to main Page](./../../../README.md)

# Modelieren und Implementieren
Bei Resources handelt es sich um einen Folder. Aus diesem Gründen ist er nicht von GithubPages aus erreichbar. Um das ganze Projekt zu sehen muss es auf Github geöffnet werden.

### Main
```java
package dev.bbzbl.m320;

public class Main {

	public static void main(String... args) {
		Fight fight = new Fight();
		
		fight.setParticipan(new Character("Zenturo"));
		fight.setParticipan(new Character("Valarian"));

		fight.fight();
		
	}

}
```

### Character
```java
package dev.bbzbl.m320;

public class Character {
	
	private String name;
	
	private int ap = 15;
	
	private int hp = 100;
	
	public Character(String name) {
		this.name = name;
	}
	
	public boolean death() {
		return this.hp <= 0;
	}
	
	//Getter and Setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAp() {
		return ap;
	}

	public void setAp(int ap) {
		this.ap += ap;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp -= hp;
		if(this.hp < 0 ) {
			this.hp = 0;
		}
	}
}	
```

### Fight
```java
public class Fight {

	private List<Character> participan = new ArrayList<Character>();

	private List<Weapon> weapons = new ArrayList<Weapon>();

	public Fight() {
		this.weapons.add(new Weapon("sword", 3));
		this.weapons.add(new Weapon("pistle", 4));
		this.weapons.add(new Weapon("kick", 1));
		this.weapons.add(new Weapon("AK-47", 5));
	}

	public boolean ready() {
		return this.participan.size() >= 2;
	}

	public void fight() {

		Random random = new Random();

		if (this.participan.size() < 2) {
			System.err.println("You need at minimum 2 Participants to star a game");
		}

		while (ready()) {
			int posFighterA = random.nextInt(this.participan.size());
			int posFighterB;
			do {
				posFighterB = random.nextInt(this.participan.size());
			} while (posFighterA == posFighterB);

			Character fighterA = this.participan.get(posFighterA);
			Character fighterB = this.participan.get(posFighterB);

			Weapon weapon;
			int damage;
			while (!fighterA.death() && !fighterB.death()) {
				weapon = this.weapons.get(random.nextInt(this.weapons.size()));
				damage = weapon.getDamage() * random.nextInt(fighterA.getAp());
				
				fighterB.setHp(damage);
				
				System.out.println("*********");
				System.out.println(String.format("%s hit %s with a %s and made %s damage", fighterA.getName(),
						fighterB.getName(), weapon.getName(), damage));
				System.out.println(fighterA.getName()  + " : " + fighterA.getHp());
				System.out.println(fighterB.getName()  + " : " + fighterB.getHp());
				System.out.println("*********");

				if(fighterB.death()) {
					System.out.println(fighterB.getName()  +  " is death");
					this.participan.remove(posFighterB);
					continue;
				}
				
				weapon = this.weapons.get(random.nextInt(this.weapons.size()));
				damage = weapon.getDamage() * random.nextInt(fighterB.getAp());
				fighterA.setHp(damage);
				System.out.println("*********");
				System.out.println(String.format("%s hit %s with a %s and made %s damage", fighterB.getName(),
						fighterA.getName(), weapon.getName(), damage));
				System.out.println(fighterA.getName()  + " : " + fighterA.getHp());
				System.out.println(fighterB.getName()  + " : " + fighterB.getHp());
				System.out.println("*********");
				if(fighterA.death()) {
					System.out.println(fighterA.getName()  +  " is death");
					this.participan.remove(posFighterA);
				}
			}

			
			
		}
		
		System.out.println("The Winner is " + this.participan.get(0).getName());

	}

	// Getter and Setter

	public List<Character> getParticipan() {
		return participan;
	}

	public List<Weapon> getWeapons() {
		return weapons;
	}

	public void setWeapons(Weapon weapon) {
		this.weapons.add(weapon);
	}

	public void setWeapons(List<Weapon> weapons) {
		this.weapons = weapons;
	}

	public void setParticipan(List<Character> participan) {
		this.participan = participan;
	}

	public void setParticipan(Character character) {
		this.participan.add(character);
	}

}
```

### Weapon
```java
package dev.bbzbl.m320;

public class Weapon {
	
	
	private String name;
	
	private int damage;

	
	public Weapon(String name, int damage) {
		this.name = name;
		this.damage = damage;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
}

```
