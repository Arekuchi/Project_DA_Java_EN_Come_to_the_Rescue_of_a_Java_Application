package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hemebiotech.counter.mapSymptom;
import com.hemebiotech.imprimerresultat.Imprimeresult;
import com.hemebiotech.lecturetexte.ReadSymptomDataFromFile;
import com.hemebiotech.trieralphab�tique.TrierListe;

public class AnalyticsCounter {

	public static Map<String, Integer> myMap = new HashMap<>();
	private static List<String> symptomes = new ArrayList<String>();

	public static void main(String args[]) throws Exception {
		// 1ere etape : savoir ouvrir le fichier txt en java (symptoms.txt)
		// 2e etape : parcourir le fichier (methode pour recuperer chaque ligne)
		// 3e etape : Compter les sympt�mes (hashmap Java / treemap)
		// 4e etape : on range dans l'ordre Alphab�tique les sympt�mes compt�s
		// 5e etape : sortir/ecrire un fichier result.out
		// 6e etape : pusher dans une branche hotfix
		// 7e etape : basculer vers une branche d�velop
		// 8e etape : cr�e une branche features/refactor
		// 9e etape : faire des packages et classes into m�thode de classe, nettoyer la
		// m�thode main
		// Faire un push apr�s chaque package << On est ici actuellement.
		// changer analytics counter en class
		// faire une nouvelle main qui utilise les interfaces

		// utilisation de ReadSymptomDataFromFile
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> allSymptoms = reader.GetSymptoms();

		// utilisation de CountSymptom
		mapSymptom counter = new mapSymptom();
		myMap = counter.count(allSymptoms);

		// trier par ordre alphab�tique
		TrierListe listesymptome = new TrierListe();
		symptomes = listesymptome.symptoms(myMap);

		// utlisation de Imprimeresult
		Imprimeresult writefile = new Imprimeresult();
		writefile.Imprimer(symptomes, myMap);
	}

}
