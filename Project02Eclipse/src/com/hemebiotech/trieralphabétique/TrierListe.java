package com.hemebiotech.trieralphabétique;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class TrierListe implements ITrierListe {

	@Override
	public List<String> symptoms(Map<String, Integer> myMap) {
		List<String> symptomes = new ArrayList<>(myMap.keySet());
		Collections.sort(symptomes);

		return symptomes;
	}
}