package com.hemebiotech.imprimerresultat;

import java.io.FileWriter;
import java.util.List;
import java.util.Map;

public class ImprimeResult implements IImprimer {
	private String filePath;

	public ImprimeResult(String filepath) {
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
