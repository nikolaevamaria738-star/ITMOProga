package mypokemons;

import mymoves.arcanine.*;

public class Arcanine extends Growlithe{
	public Arcanine(String name, int level) {
		super(name,level);
		
		setStats(90, 110, 80, 100, 80, 95);
		ExtremeSpeed extremespeed = new ExtremeSpeed(80,100,5,+2);
		
		super.setMove(extremespeed);
		
	}


}
