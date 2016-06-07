package com.hunting;

public class Animal {

	public String type;
	public int NeedSkill;
	public int speed;
	public int weight;
	
	
	public void setType(String type) {
		this.type = type;
	}
	
	public boolean Hunt(Hunter hunter, Gun gun) {
		return (speed + weight) < (hunter.skill + gun.accuracy);
	}
}
