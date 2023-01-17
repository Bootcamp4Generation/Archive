package com.generation.archive.util;

/**
 * Un OGGETTO di classe password
 * rappresenta una password
 * con scadenza.
 * E applica dei criteri di sicurezza.
 * @author FP80
 *
 */
public class Password 
{
	// PROPRIETA' della classe Password
	private final static Date CHANGEDATE =
			new Date("01/01/2023");
	
	/*
	 * Password
	 * 			CHANGEDATE = "01/01/2023"	(� uguale per p1, p2, p3)
	 * 
	 * p1:Password			p2:Password			p3:Password
	 * text:pippo			text:pluto			text:paperino
	 * lastChanged:25/12	lastChanged:13/1	lastChanged:15/1
	 */
	
	
	// PROPRIETA' di un OGGETTO password
	String text;
	Date lastChanged;
	
	/**
	 * Costruttore base
	 * @param text (testo della password)
	 * @param lastChanged (data di ultima modifica)
	 */
	public Password(String text, Date lastChanged)
	{
		this.text = text;
		this.lastChanged = lastChanged;
	}
	
	/**
	 * 
	 * @return true se la mia data di cambiamento � POSTERIORE
	 * alla CHANGEDATE
	 */
	public boolean isExpired()
	{
		return lastChanged.isBefore(CHANGEDATE);
	}
	
	/**
	 * 
	 * @return true se la password � sicura, false altrimenti
	 */
	public boolean isValid()
	{
		return		text!=null				&&
					text.length()>=8		&&
					_hasUpper() 			&&
					_hasLower()				&&
					_hasNumber()			;
	}
	
	/**
	 * 
	 * @return true se ho almeno una minuscola, false altrimenti
	 */
	private boolean _hasNumber()
	{
		for(int i=0;i<text.length();i++)
		{
			char c = text.charAt(i); // prendo il carattere i-esimo
			if(c>='0' && c<='9')
				return true;
		}
		
		return false;
	}
	
	/**
	 * 
	 * @return true se ho almeno una minuscola, false altrimenti
	 */
	private boolean _hasLower()
	{
		for(int i=0;i<text.length();i++)
		{
			char c = text.charAt(i); // prendo il carattere i-esimo
			if(c>='a' && c<='z')
				return true;
		}
		
		return false;
	}
	
	/**
	 * 
	 * @return true se text contiene lettere maiuscole, false altrimenti
	 */
	private boolean _hasUpper()
	{
		for(int i=0;i<text.length();i++)
		{
			char c = text.charAt(i); // prendo il carattere i-esimo
			if(c>='A' && c<='Z')
				return true;
		}
		
		return false;
	}
	
}
