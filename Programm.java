package Laba2;

import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Programm {

	public static void main(String[] args) {
		Battle b = new Battle();
		
		
		Arcanine p1 = new Arcanine("Apple",1);
		Growlithe p2 = new Growlithe("Banana",1);
		Margeana p3 = new Margeana("Pineaple",1);
		Politoed p4 = new Politoed("Coconut",1);
		Poliwag p5 = new Poliwag("Orenge",1);
		Poliwhirl p6 = new Poliwhirl("Plum",1);
		
		
		
		b.addAlly(p1);
		b.addAlly(p3);
		b.addAlly(p5);
		
		b.addFoe(p2);
		b.addFoe(p4);
		b.addFoe(p6);
		
		b.go();

	}
	
	public static boolean chance(double d) {
		return d>Math.random();
	}
	
}
