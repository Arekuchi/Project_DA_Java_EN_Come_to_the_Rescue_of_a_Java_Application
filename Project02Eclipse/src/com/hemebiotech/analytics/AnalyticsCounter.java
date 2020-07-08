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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	public static Map<String, Integer> myMap = new HashMap<>();
=======
>>>>>>> 3561ac2... hotifx
=======
>>>>>>> 3561ac2... hotifx
=======
>>>>>>> 3561ac2... hotifx

	public static void main(String args[]) throws Exception {
		// 1ere etape : savoir ouvrir le fichier txt en java (symptoms.txt)
		// 2e etape : parcourir le fichier (methode pour recuperer chaque ligne)
		// 3e etape : Compter les symptômes (hashmap Java / treemap)
		// 4e etape : on range dans l'ordre Alphabétique les symptômes compter
		// 5e etape : sortir/ecrire un fichier result.out
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		// 6e etape : pusher dans une branche hotfix
		// 7e etape : basculer vers une branche dévelop
		// 8e etape : crée une branche features/refactor
		// 9e etape : faire des packages et classes into méthode de classe, nettoyer la
		// méthode main
		// Faire un push après chaque package
=======
		// 6e etape : faire des packages et classes into méthode de classe, nettoyer la
		// méthode main
		// 7e etape :
>>>>>>> 3561ac2... hotifx
=======
		// 6e etape : faire des packages et classes into méthode de classe, nettoyer la
		// méthode main
		// 7e etape :
>>>>>>> 3561ac2... hotifx
=======
		// 6e etape : faire des packages et classes into méthode de classe, nettoyer la
		// méthode main
		// 7e etape :
>>>>>>> 3561ac2... hotifx

		// first get input
		BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
		String line = reader.readLine();

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		while (line != null) {
			if (myMap.containsKey(line)) {
				myMap.put(line, myMap.get(line) + 1);
			} else {
				myMap.put(line, 1);
=======
=======
>>>>>>> 3561ac2... hotifx
=======
>>>>>>> 3561ac2... hotifx
		int i = 0; // set i to 0
		int headCount = 0; // counts headaches
		while (line != null) {
			i++; // increment i
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
			} else if (line.equals("rash")) {
				rashCount++;
			} else if (line.contains("pupils")) {
				pupilCount++;
>>>>>>> 3561ac2... hotifx
			}

			line = reader.readLine(); // get another symptom
<<<<<<< HEAD
<<<<<<< HEAD
		}

<<<<<<< HEAD
		List<String> symptomes = new ArrayList<>(myMap.keySet());
		Collections.sort(symptomes);

		// next generate output
		FileWriter writer = new FileWriter("result.out");
		for (String symptome : symptomes) {
			writer.write(symptome + " = " + myMap.get(symptome) + "\n");
		}
=======
=======
		}

>>>>>>> 3561ac2... hotifx
=======
		}

>>>>>>> 3561ac2... hotifx
		// next generate output
		FileWriter writer = new FileWriter("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
>>>>>>> 3561ac2... hotifx
		writer.close();
	}
}
