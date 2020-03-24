package de.arbeitsagentur.model;

import de.arbeitsagentur.enums.Schwierigkeitsgrad;

public abstract class AbstractFrage {
	protected String frageText;
	protected Schwierigkeitsgrad grad;
	protected int punkte;
	protected String seminar;

	AbstractFrage(String frage, Schwierigkeitsgrad grad, int punkte, String seminar) {
		frageText = frage;
		this.grad = grad;
		this.punkte = punkte;
		this.seminar = seminar;

	}

	public String getFrageText() {
		return frageText;
	}

	public Schwierigkeitsgrad getGrad() {
		return grad;
	}

	public int getPunkte() {
		return punkte;
	}

	public String getSeminar() {
		return seminar;
	}

}
