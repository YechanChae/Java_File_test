package models;

public class Hero extends Character {
	public Hero(String name) {
		setName(name);
	}
	private boolean isFlying;

	public boolean isFlying() {
		return isFlying;
	}

	public void setFlying(boolean isFlying) {
		this.isFlying = isFlying;
	}
	
	
	public void attack(Hero hero) {
		System.out.println(this.getName() + "은 " + hero.getName() + "과 싸움을 했다.");
	}
}
