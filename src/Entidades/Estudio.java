package Entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

/**
 * A classe <b>Estudio</b> define um tipo de dado para criação de Estúdios cinematográficos.
 * @author Victor Ferreira
 * @version 1.0
 */
public class Estudio {
	
	/**
	 * O atributo nome referencia o nome de um estúdio.
	 */
	private String nome;
	
	/**
	 * O atributo dono referencia o dono de um estúdio.
	 */
	private String dono;
	
	/**
	 * O atributo data referencia a data de fundação de um estúdio.
	 */
	private String data;
	
	/**
	 * O atributo fatuAnoAnt referencia o faturamento do ano anterior de um estúdio.
	 */
	private String fatuAnoAnt;
	
	/**
	 * Construtor sobrecarregado da classe <b>Estudio</b>
	 * @param nome String que identifica o nome do Estúdio.
	 * @param dono String que identifica o dono do Estúdio.
	 * @param data String que identifica a data de fundação do Estúdio.
	 * @param fatuAnoAnt String que identifica o faturamento do ano anterior do Estúdio.
	 */
	public Estudio(String nome, String dono, String data, String fatuAnoAnt) {
		this.nome = nome;
		this.dono = dono;
		this.data = data;
		this.fatuAnoAnt = fatuAnoAnt;
	}
	
	/**
	 * Método para acessar o atributo nome da classe <b>Estudio</b>
	 * @return nome do Estúdio
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Método para acessar o atributo dono da classe <b>Estudio</b>
	 * @return o nome do dono do Estúdio.
	 */
	public String getDono() {
		return dono;
	}
	
	/**
	 * Método para acessar o atributo data da classe <b>Estudio</b>
	 * @return a data de fundação do Estúdio.
	 */
	public String getData() {
		return data;
	}
	
	/**
	 * Método para acessar o atributo fatuAnoAnt da classe <b>Estudio</b>
	 * @return faturamento do ano anterior do Estúdio.
	 */
	public String getFatuAnoAnt() {
		return fatuAnoAnt;
	}
	
	/**
	 * Método para retornar em String os atributos do objeto <b>Estudio</b>
	 */
	public String toString() {
		return "ESTÚDIO CADASTRADO COM SUCESSO! Nome do Estudio : " + nome + ", dono : " + dono + ", Data : " + data
				+ ", Faturamento do ano anterior:" + fatuAnoAnt + "$";
	}
	
	/**
	 * Verifica se a data passado é uma data válida.
	 * @param strDate uma string no formato data a ser verificada.
	 * @return verdadeiro ou falso mostrando se a string data passada é ou não válida.
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
