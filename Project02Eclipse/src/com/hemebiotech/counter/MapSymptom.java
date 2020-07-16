package com.hemebiotech.counter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSymptom implements IMapSymptom {

	@Override
	public Map<String, Integer> count(List<String> symptoms) {
		Map<String, Integer> myMap = new HashMap<>();
		for (String symptom : symptoms) {
			if (myMap.containsKey(symptom)) {
				myMap.put(symptom, myMap.get(symptom) + 1);
			} else {
				myMap.put(symptom, 1);
			}

		}
		return myMap;
	}

}
