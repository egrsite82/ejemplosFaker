package com.ejemploFaker.ejemplosFaker;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

@Service
public class RockBandService {

	static ArrayList<RockBand> fakerockband = new ArrayList<RockBand>();
	
	
	
	public ArrayList<RockBand> queryFakeRockBand()	{
		
	int i = 0;
	Faker newfakerockband = new Faker();
	
	while (i < 20) {
		
		String name = newfakerockband.rockBand().name();
		
		fakerockband.add(new RockBand(name));
		i++;
		
	}
	return fakerockband;
		
	}
	
	
}
