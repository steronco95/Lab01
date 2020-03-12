package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
		
	private List<String> elencoParole = new LinkedList<>();
	
	
	public Parole() {
		//TODO
	}
	
	public void addParola(String p) {
		elencoParole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(elencoParole);
		
		return elencoParole;
	}
	
	public void reset() {
		
		elencoParole.clear();
	}

}
