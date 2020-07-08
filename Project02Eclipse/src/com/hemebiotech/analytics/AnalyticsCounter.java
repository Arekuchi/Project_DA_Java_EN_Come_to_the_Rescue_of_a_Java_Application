package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	private static int headacheCount = 0; // initialize to 0
	private static int rashCount = 0; // initialize to 0
	private static int pupilCount = 0; // initialize to 0
	public static Map<String, Integer> myMap = new HashMap<>();

	public static void main(String args[]) throws Exception {
		// 1ere etape : savoir ouvrir le fichier txt en java (symptoms.txt)
		// 2e etape : parcourir le fichier (methode pour recuperer chaque ligne)
		// 3e etape : Compter les sympt�mes (hashmap Java / treemap)
		// 4e etape : on range dans l'ordre Alphab�tique les sympt�mes compter
		// 5e etape : sortir/ecrire un fichier result.out
		// 6e etape : pusher dans une branche hotfix
		// 7e etape : basculer vers une branche d�velop
		// 8e etape : cr�e une branche features/refactor
		// 9e etape : faire des packages et classes into m�thode de classe, nettoyer la
		// m�thode main
		// Faire un push apr�s chaque package

		// first get input
		BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
		String line = reader.readLine();

		int i = 0; // set i to 0
		int headCount = 0; // counts headaches
		while (line != null) {
			if (myMap.containsKey(line)) {
				myMap.put(line, myMap.get(line) + 1);
			} else {
				myMap.put(line, 1);
			}

			line = reader.readLine(); // get another symptom
		}

		List<String> symptomes = new ArrayList<>(myMap.keySet());
		Collections.sort(symptomes);

		// next generate output
		FileWriter writer = new FileWriter("result.out");
		for (String symptome : symptomes) {
			writer.write(symptome + " = " + myMap.get(symptome) + "\n");
		}
		writer.close();
	}
}
