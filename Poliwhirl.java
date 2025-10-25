package mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymoves.poliwag.*;
import mymoves.poliwhirl.*;

public class Poliwhirl extends Pokemon{
	public Poliwhirl(String name, int level) {
		super(name,level);
		
		setType(Type.WATER);
		setStats(65, 65, 65, 50, 50, 90);
		Psychic psychic = new Psychic(90,100);
		Swagger swagger = new Swagger(0,85);
		HydroPump hydropump = new HydroPump(110, 80);
		
		super.setMove(psychic, swagger, hydropump);
		
	}
}