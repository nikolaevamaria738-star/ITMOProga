package mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymoves.arcanine.*;
import mymoves.growlithe.*;

public class Arcanine extends Pokemon{
	public Arcanine(String name, int level) {
		super(name,level);
		
		setType(Type.FIRE);
		setStats(90, 110, 80, 100, 80, 95);
		WillOWisp willowisp = new WillOWisp(0,85);
		DoubleTeam doubleteam = new DoubleTeam(0,0);
		WildCharge wildcharge = new WildCharge(90,100);
		ExtremeSpeed extremespeed = new ExtremeSpeed(80,100,5,+2);
		
		super.setMove(willowisp, doubleteam, wildcharge, extremespeed);
		
	}

}