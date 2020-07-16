package com.hemebiotech.imprimerresultat;

import java.io.FileWriter;
import java.util.List;
import java.util.Map;

public class Imprimeresult implements Iimprimer {
	private String filePath;

	public Imprimeresult(String filepath) {
		this.filePath = filepath;
	}

	@Override
	public void Imprimer(List<String> symptomes, Map<String, Integer> myMap) throws Exception {
		FileWriter writer = new FileWriter(filePath);
		for (String symptome : symptomes) {
			writer.write(symptome + " = " + myMap.get(symptome) + "\n");
		}
		writer.close();
	}
}
