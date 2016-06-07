package com;

import com.hunting.Hunter;
import com.hunting.Gun;
import com.hunting.Animal;
	
public class Hunting {
	public static void main(String[] args) {
		Hunter Ben = new Hunter();
		Ben.skill = 10;
		Ben.bag  = 20;
		
		Gun MP153 = new Gun();
		MP153.accuracy = 50;
		
		Animal duck = new Animal();
		duck.speed = 20;
		duck.weight = 3;
		
		Animal boar = new Animal();
		boar.speed = 15;
		boar.weight = 30;
		
		
		if (duck.Hunt(Ben,MP153)) {
			System.out.println("Бэн поймал утку!");
		}else {
				System.out.println("Бэн не поймал утку!");
		}
		if (duck.weight > Ben.bag) {
			System.out.println("Бэну пора идти домой, сумка с добычей полна!");
		}
	}
}
