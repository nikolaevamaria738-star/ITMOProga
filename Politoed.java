package mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymoves.poliwag.*;
import mymoves.poliwhirl.*;
import mymoves.politoed.*;

public class Politoed extends Pokemon{
	public Politoed(String name, int level) {
		super(name,level);
		
		setType(Type.WATER);
		setStats(90, 75, 75, 90, 100, 70);
		Psychic psychic = new Psychic(90,100);
		Swagger swagger = new Swagger(0,85);
		HydroPump hydropump = new HydroPump(110, 80);
		Waterfall waterfall = new Waterfall(80, 100);
		
		super.setMove(psychic, swagger, hydropump, waterfall);
		
	}


}