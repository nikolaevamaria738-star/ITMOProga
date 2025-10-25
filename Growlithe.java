package mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymoves.growlithe.*;

public class Growlithe extends Pokemon{
	public Growlithe(String name, int level) {
		super(name,level);
		
		setType(Type.FIRE);
		setStats(55, 70, 45, 70, 50, 60);
		WillOWisp willowisp = new WillOWisp(0,85);
		DoubleTeam doubleteam = new DoubleTeam(0,0);
		WildCharge wildcharge = new WildCharge(90,100);
		
		super.setMove(willowisp, doubleteam, wildcharge);
		
	}

}