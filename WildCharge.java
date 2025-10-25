package mymoves.growlithe;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class WildCharge extends PhysicalMove{
	public WildCharge(double pow, double acc) {
		super(Type.ELECTRIC, pow, acc);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) 
	{
		super.applyOppEffects(p);
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}
