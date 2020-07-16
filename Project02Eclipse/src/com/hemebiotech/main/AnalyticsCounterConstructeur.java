package com.hemebiotech.main;

import java.util.List;
import java.util.Map;

import com.hemebiotech.counter.IMapSymptom;
import com.hemebiotech.imprimerresultat.IImprimer;
import com.hemebiotech.lecturetexte.ISymptomReader;
import com.hemebiotech.trieralphabétique.ITrierListe;

public class AnalyticsCounterConstructeur {
	private final IMapSymptom counter;
	private final IImprimer imprimer;
	private final ISymptomReader reader;
	private final ITrierListe lire;

	public AnalyticsCounterConstructeur(IMapSymptom counter, IImprimer imprimer, ISymptomReader reader,
			ITrierListe lire) {

		this.counter = counter;
		this.imprimer = imprimer;
		this.reader = reader;
		this.lire = lire;
	}

	public void execute() throws Exception {

		List<String> symptomes = reader.GetSymptoms();
		Map<String, Integer> myMap = counter.count(symptomes);
		List<String> symptoms = lire.symptoms(myMap);
		imprimer.Imprimer(symptoms, myMap);
	}

}
