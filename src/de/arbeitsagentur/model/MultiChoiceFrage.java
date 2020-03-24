package de.arbeitsagentur.model;

import de.arbeitsagentur.enums.Schwierigkeitsgrad;

public class MultiChoiceFrage extends AbstractFrage {
	
	private String[] antworten;
	private String rAntwort;

	MultiChoiceFrage(String frage, Schwierigkeitsgrad grad, int punkte, String seminar, String rAntwort ,String[] antworten) {
		super(frage, grad, punkte, seminar);
		this.antworten = antworten;
		this.rAntwort = rAntwort;
	}

}
