package mymoves.arcanine;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class ExtremeSpeed extends PhysicalMove{
	public ExtremeSpeed(double pow, double acc, int pp, int priority) {
		super(Type.NORMAL, pow, acc, pp, priority);
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}
