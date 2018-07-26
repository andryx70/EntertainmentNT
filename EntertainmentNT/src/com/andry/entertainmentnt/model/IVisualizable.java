package com.andry.entertainmentnt.model;

import java.util.Date;

public interface IVisualizable {
	
	/**
	 * este metodo captura el tiempo exacto de inicio de visualizacion
	 * 
	 * @param dateI es un objeto {@code Date} con el tiempo exacto de inicio
	 * @return Devuelve la fecha y hora capturada
	 * */
	Date startToSee(Date dateI);
	
	/**
	 * Este metodo captura el tiempo inicio y final de visualizacion
	 * 
	 * @param dateI es un objeto {@code Date} con el tiempo exacto de inicio
	 * @param dateF es un objeto {@code Date} con el tiempo exacto final
	 * */
	void stopToSee(Date dateI, Date dateF);
	
}
