package com.generation.archive.util;

/**
 * Un oggetto di classe Date
 * mi permette di creare date
 * di stamparle in vari formati
 * e di vedere se sono valide
 * @author Ferdinando
 * @lastmodified 16/01/2023
 *
 */
public class Date 
{
	// PROPRIETA' dell'oggetto di classe Date
	int day,month,year;
	
	/**
	 * costruttore per date
	 * UN COSTRUTTORE E' UN METODO SPECIALE
	 * CHE SERVE A CREARE UN OGGETTO DELLA CLASSE
	 * A CUI APPARTIENE
	 * LO RICONOSCETE PERCHE' HA LO STESSO NOME
	 * DELLA CLASSE E NON HA IL RETURN.
	 * @param day (giorno del mese)
	 * @param month (mese della data)
	 * @param year (anno della data)
	 */
	public Date(int day, int month, int year)
	{
		this.day 	= day;
		this.month 	= month;
		this.year 	= year;
	}
	
	
	/**
	 * Costruisco una data a partire da una stringa
	 * es: datestring = "03/12/1997"
	 * @param dateString in formato italiano: dd/mm/yyyy
	 */
	public Date(String dateString)
	{
		//eg: dateString = "03/12/1997"
		// vettore: elenco ordinato di dimensione fissa di elementi
		// dello stesso tipo, con duplicati ammessi
		String[] parts = dateString.split("/");
		/*
		 * parts[0] = "03" (String)
		 * parts[1] = "12" (String)
		 * parts[2] = "1997" (String)
		 */
		this.day 	= Integer.parseInt(parts[0]);
		this.month 	= Integer.parseInt(parts[1]);
		this.year	= Integer.parseInt(parts[2]);
		
	}
	
	
	/**
	 * Restituisce il numero totale dei giorni
	 * del mese e dell'anno di questa data
	 * questa data = this
	 * @return numero totale dei giorni del mese
	 */
	public int getMonthDays()
	{
		switch(month)
		{
			case 11,4,6,9:
				// Trenta giorni ha novembre con april giugno e settembre
				return 30;
			case 2:
				// di ventotto ce n'� uno ma i nostri
				// insegnanti elementari non conoscevano
				// i bisestili
				return year % 4 == 0 ? 29 : 28;
			default:
				// tutti gli altri ne han 31
				return 31;
		}
	}
	
	/**
	 * restituisce true se la data ha senso
	 * nel comune calendario gregoriano
	 * false altrimenti
	 * @return true se la data � buona, false altrimenti
	 */
	public boolean isValid()
	{
		// NON LAVORO PER FALSIFICAZIONE STAVOLTA. LAVORO PER AFFERMAZIONE
		return 	day >=1 && month>=1					&&
				day<=getMonthDays() && month<=12	;
	}
	
	//arriva un numero intero esce una STRINGA
	//se il numero intero � <10, esce 0+numero intero, esempio
	//se arriva 5, esce "05"
	//se arriva 12, esce "12" come stringa
	private String _twoDigits(int v)
	{
		return v>=10 ? v+"" : "0"+v;
	}

	public String toITA()
	{
		return _twoDigits(day)+"/"+_twoDigits(month)+"/"+year;
	}
	
	public String toUSA()
	{
		return _twoDigits(month)+"/"+_twoDigits(day)+"/"+year;
	}

	public String toDB()
	{
		return year+"-"+_twoDigits(month)+"-"+_twoDigits(day);
	}

	/**
	 * in questo metodo
	 * NON mi basta conoscere me stesso
	 * devono darmi qualcosa da fuori, vale a dire
	 * un PARAMETRO
	 * @param other (la data con cui confrontarmi)
	 * @return true se io (this) sono pi� recente di lui (other)
	 */
	public boolean isAfter(Date other)
	{
		return 	(year > other.year)   						||
				(year==other.year && month>other.month)		||
				(year==other.year && month==other.month && day>other.day);
	}
	
	public boolean isSame(Date other)
	{
		return	(year == other.year && month == other.month && day == other.day);
	}
	
	public boolean isBefore(Date other)
	{
		return  (year < other.year)							||
				(year == other.year && month<other.month)	||
				(year == other.year && month == other.month && day<other.day);
	}
}
