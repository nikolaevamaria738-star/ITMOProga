package mypokemons;

import mymoves.poliwhirl.*;

public class Poliwhirl extends Poliwag{
	public Poliwhirl(String name, int level) {
		super(name,level);
		
		setStats(65, 65, 65, 50, 50, 90);
		HydroPump hydropump = new HydroPump(110, 80);
		
		super.setMove(hydropump);
		
	}

}
