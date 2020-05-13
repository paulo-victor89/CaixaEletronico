package br.ibm.com.treinamento.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hora {
		
	String hora;
	String minutos;
	String dia;
	String mes;
	String ano;
	
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getMinutos() {
		return minutos;
	}
	public void setMinutos(String minutos) {
		this.minutos = minutos;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	
	

	
	
//		Date data = new Date();
//		SimpleDateFormat formatar = new SimpleDateFormat("dd-MM-yyyy");
//		String dataFormatada = formatar.format(data);
//		System.out.println(dataFormatada);

	

}
