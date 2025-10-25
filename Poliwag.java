package mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymoves.poliwag.*;

public class Poliwag extends Pokemon{
	public Poliwag(String name, int level) {
		super(name,level);
		
		setType(Type.WATER);
		setStats(40, 50, 40, 40, 40, 90);
		Psychic psychic = new Psychic(90,100);
		Swagger swagger = new Swagger(0,85);
		
		super.setMove(psychic, swagger);
		
	}


}
