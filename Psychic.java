package mymoves.poliwag;

import Laba2.Programm;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Psychic extends SpecialMove{
	public Psychic(double pow, double acc) {
		super(Type.PSYCHIC, pow, acc);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) 
	{		
		if(Programm.chance(0.1)) {
			Effect e =new Effect().stat(Stat.ATTACK, 1);
			p.addEffect(e);
		}
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}
