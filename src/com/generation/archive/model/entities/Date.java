package com.generation.archive.model.entities;

/**
 * Un oggetto di classe Date
 * conterrà i dati di una data (giorno, mese, anno)
 * e offrirà le funzioni di base
 * per stamparla e manipolarla
 * @author Stefano Rubinetti
 * @lastmodified 16/01/2023
 */
public class Date
{
	int day, month, year;

	/**
	 * un costruttore è un metodo speciale che serve a creare oggetti
	 * della classe in cui è scritto
	 * si riconosce dal fatto che ha lo stesso nome della classe e che
	 * NON ha un return esplicito
	 * @param day (giorno del mese)
	 * @param month (mese, da 1 a 12)
	 * @param year (un numero qualunque)
	 */
	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	/**
	 * restituisce la data nel formato dd/mm/yyyy
	 */
	public String toString()
	{
		return	(day>=10 	? day 	: "0"+day) 		+ "/" +
				(month>=10  ? month : "0"+month) 	+ "/" +
				year									  ;
	}
	
	/**
	 * restituisce la data nel formato dd/mm/yyyy
	 * questa è la mia promessa al programmatore che mi leggerà
	 */
	public String toUSA()
	{
		return	(month>=10  ? month : "0"+month) 	+ "-" +
				(day>=10 	? day 	: "0"+day) 		+ "-" +
				year									  ;
	}
}
