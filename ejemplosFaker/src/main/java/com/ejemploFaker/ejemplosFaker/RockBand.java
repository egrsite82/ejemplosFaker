package com.ejemploFaker.ejemplosFaker;

public class RockBand {

	private	String	name;
	
	//Constructor de la Superclase
	public RockBand() {
		super();
		// TODO Esbozo de constructor generado automáticamente
	}

	
	//Constructor 
	protected RockBand(String name) {
		super();
		this.name = name;
	}

	
	//Getters y Setters

	/**
	 * @return el name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name el name a establecer
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
