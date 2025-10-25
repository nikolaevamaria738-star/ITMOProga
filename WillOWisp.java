package mymoves.growlithe;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class WillOWisp extends StatusMove{
	
	public WillOWisp(double pow, double acc) {
		super(Type.FIRE, pow, acc);
	}
	
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}
