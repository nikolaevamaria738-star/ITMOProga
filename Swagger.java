package mymoves.poliwag;

import Laba2.Programm;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Swagger extends StatusMove{
	public Swagger(double pow, double acc) {
		super(Type.NORMAL, pow, acc);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) 
	{
        Effect e =new Effect().stat(Stat.ATTACK, 2);
		p.addEffect(e);
		
		if(Programm.chance(0.33)) {
			Effect.confuse(p);
		}
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}
