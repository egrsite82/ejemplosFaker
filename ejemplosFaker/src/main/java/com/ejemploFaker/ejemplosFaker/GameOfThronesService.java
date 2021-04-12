package com.ejemploFaker.ejemplosFaker;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

@Service
public class GameOfThronesService {

	static	ArrayList<GameOfThrones> fakegameofthrones = new ArrayList<GameOfThrones>();
	
	public	ArrayList<GameOfThrones> queryGameOfThrones() {
		
		int i = 0;
		Faker	newgameofthrones = new Faker();
		
		while (i < 20) {
			
			String character = newgameofthrones.gameOfThrones().character();
			String city = newgameofthrones.gameOfThrones().city();
			String dragon = newgameofthrones.gameOfThrones().dragon();
			String house = newgameofthrones.gameOfThrones().house();
			String quote = newgameofthrones.gameOfThrones().quote();
			
			fakegameofthrones.add(new GameOfThrones(character, city, dragon, house, quote));
			i++;
		}
		
		return fakegameofthrones;
		
	}
	
}
