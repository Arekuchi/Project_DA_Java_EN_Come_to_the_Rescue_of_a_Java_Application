package com.hemebiotech.imprimerresultat;

import java.util.List;
import java.util.Map;

public interface Iimprimer {

	void Imprimer(List<String> symptomes, Map<String, Integer> myMap) throws Exception;
}
