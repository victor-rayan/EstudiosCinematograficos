package Entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

/**
 * A classe <b>Estudio</b> define um tipo de dado para cria��o de Est�dios cinematogr�ficos.
 * @author Victor Ferreira
 * @version 1.0
 */
public class Estudio {
	
	/**
	 * O atributo nome referencia o nome de um est�dio.
	 */
	private String nome;
	
	/**
	 * O atributo dono referencia o dono de um est�dio.
	 */
	private String dono;
	
	/**
	 * O atributo data referencia a data de funda��o de um est�dio.
	 */
	private String data;
	
	/**
	 * O atributo fatuAnoAnt referencia o faturamento do ano anterior de um est�dio.
	 */
	private String fatuAnoAnt;
	
	/**
	 * Construtor sobrecarregado da classe <b>Estudio</b>
	 * @param nome String que identifica o nome do Est�dio.
	 * @param dono String que identifica o dono do Est�dio.
	 * @param data String que identifica a data de funda��o do Est�dio.
	 * @param fatuAnoAnt String que identifica o faturamento do ano anterior do Est�dio.
	 */
	public Estudio(String nome, String dono, String data, String fatuAnoAnt) {
		this.nome = nome;
		this.dono = dono;
		this.data = data;
		this.fatuAnoAnt = fatuAnoAnt;
	}
	
	/**
	 * M�todo para acessar o atributo nome da classe <b>Estudio</b>
	 * @return nome do Est�dio
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * M�todo para acessar o atributo dono da classe <b>Estudio</b>
	 * @return o nome do dono do Est�dio.
	 */
	public String getDono() {
		return dono;
	}
	
	/**
	 * M�todo para acessar o atributo data da classe <b>Estudio</b>
	 * @return a data de funda��o do Est�dio.
	 */
	public String getData() {
		return data;
	}
	
	/**
	 * M�todo para acessar o atributo fatuAnoAnt da classe <b>Estudio</b>
	 * @return faturamento do ano anterior do Est�dio.
	 */
	public String getFatuAnoAnt() {
		return fatuAnoAnt;
	}
	
	/**
	 * M�todo para retornar em String os atributos do objeto <b>Estudio</b>
	 */
	public String toString() {
		return "EST�DIO CADASTRADO COM SUCESSO! Nome do Estudio : " + nome + ", dono : " + dono + ", Data : " + data
				+ ", Faturamento do ano anterior:" + fatuAnoAnt + "$";
	}
	
	/**
	 * Verifica se a data passado � uma data v�lida.
	 * @param strDate uma string no formato data a ser verificada.
	 * @return verdadeiro ou falso mostrando se a string data passada � ou n�o v�lida.
	 */
	public static boolean validarData(String strDate) {
		String dateFormat = "dd/MM/uuuu";

	    DateTimeFormatter dateTimeFormatter = DateTimeFormatter
	    .ofPattern(dateFormat)
	    .withResolverStyle(ResolverStyle.STRICT);
	    try {
	        @SuppressWarnings("unused")
			LocalDate date = LocalDate.parse(strDate, dateTimeFormatter);
	        return true;
	    } catch (DateTimeParseException e) {
	       return false;
	    } 
	}
}
