package com.hemebiotech.main;

import com.hemebiotech.counter.ImapSymptom;
import com.hemebiotech.counter.mapSymptom;
import com.hemebiotech.imprimerresultat.Iimprimer;
import com.hemebiotech.imprimerresultat.Imprimeresult;
import com.hemebiotech.lecturetexte.ISymptomReader;
import com.hemebiotech.lecturetexte.ReadSymptomDataFromFile;
import com.hemebiotech.trieralphabétique.ITrierListe;
import com.hemebiotech.trieralphabétique.TrierListe;

public class MainRefactor {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
		ImapSymptom counter = new mapSymptom();
		ITrierListe trier = new TrierListe();
		Iimprimer imprimer = new Imprimeresult("result.out");

		AnalyticsCounterconstructeur stylo = new AnalyticsCounterconstructeur(counter, imprimer, reader, trier);
		stylo.execute();
	}

}
