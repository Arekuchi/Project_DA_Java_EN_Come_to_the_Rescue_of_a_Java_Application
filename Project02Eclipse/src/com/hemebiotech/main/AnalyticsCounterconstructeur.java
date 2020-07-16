package com.hemebiotech.main;

import java.util.List;
import java.util.Map;

import com.hemebiotech.counter.ImapSymptom;
import com.hemebiotech.imprimerresultat.Iimprimer;
import com.hemebiotech.lecturetexte.ISymptomReader;
import com.hemebiotech.trieralphabétique.ITrierListe;

public class AnalyticsCounterconstructeur {
	private final ImapSymptom counter;
	private final Iimprimer imprimer;
	private final ISymptomReader reader;
	private final ITrierListe lire;

	public AnalyticsCounterconstructeur(ImapSymptom counter, Iimprimer imprimer, ISymptomReader reader,
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
