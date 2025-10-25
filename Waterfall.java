package mymoves.politoed;

import Laba2.Programm;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Waterfall extends PhysicalMove{
	public Waterfall(double pow, double acc) {
		super(Type.WATER, pow, acc);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) 
	{		
		if(Programm.chance(0.2)) {
			Effect.flinch(p);
		}
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}
