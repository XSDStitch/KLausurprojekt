package de.arbeitsagentur.model;

import de.arbeitsagentur.enums.Schwierigkeitsgrad;

public class Freitext extends AbstractFrage {
	
	private String[] schluesselwoerter;

	Freitext(String frage, Schwierigkeitsgrad grad, int punkte, String seminar, String[] schluesselwoerter) {
		super(frage, grad, punkte, seminar);
		this.schluesselwoerter = schluesselwoerter;
	}

}
