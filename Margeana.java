package mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymoves.margeana.*;

public class Margeana extends Pokemon{
	public Margeana(String name, int level) {
		super(name,level);
		
		setType(Type.STEEL, Type.FAIRY);
		setStats(80, 95, 115, 130, 115, 65);
		PsychoCut psychocut = new PsychoCut(70,100);
		Rest rest = new Rest(0,0);
		Confusion confusion = new Confusion(50,100);
		RockSlide rockslide = new RockSlide(75,90);
		
		super.setMove(psychocut, rest, confusion, rockslide);
		
	}

}