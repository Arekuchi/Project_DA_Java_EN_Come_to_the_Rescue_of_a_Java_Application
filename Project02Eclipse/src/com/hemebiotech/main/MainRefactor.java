package com.hemebiotech.main;

import com.hemebiotech.counter.IMapSymptom;
import com.hemebiotech.counter.MapSymptom;
import com.hemebiotech.imprimerresultat.IImprimer;
import com.hemebiotech.imprimerresultat.ImprimeResult;
import com.hemebiotech.lecturetexte.ISymptomReader;
import com.hemebiotech.lecturetexte.ReadSymptomDataFromFile;
import com.hemebiotech.trieralphabétique.ITrierListe;
import com.hemebiotech.trieralphabétique.TrierListe;

public class MainRefactor {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
		IMapSymptom counter = new MapSymptom();
		ITrierListe trier = new TrierListe();
		IImprimer imprimer = new ImprimeResult("result.out");

		AnalyticsCounterConstructeur stylo = new AnalyticsCounterConstructeur(counter, imprimer, reader, trier);
		stylo.execute();
	}

}
