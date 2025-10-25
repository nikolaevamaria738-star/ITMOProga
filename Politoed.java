package mypokemons;

import mymoves.politoed.*;

public class Politoed extends Poliwhirl{
	public Politoed(String name, int level) {
		super(name,level);
		
		setStats(90, 75, 75, 90, 100, 70);
		Waterfall waterfall = new Waterfall(80, 100);
		
		super.setMove(waterfall);
		
	}



}
