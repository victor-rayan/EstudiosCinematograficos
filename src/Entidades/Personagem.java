package Entidades;

/**
 * A classe <b>Personagem</b> define um tipo de dado para criação de Personagens de um determinado Ator<br><br>
 * @author Victor Ferreira
 * @version 1.0
 */
public class Personagem {
	
	/**
	 * O atributo nomePers referencia o nome do personagem de um determinado ator.
	 */
	private String nomePers;
	
	/**
	 * O atributo ator referencia o nome do ator que faz um determinado personagem.
	 */
	private String ator;
	
	/**
	 * Construtor sobrecarregado da classe <b>Personagem</b>.
	 * @param nomePers String que identifica o nome do personagem do filme.
	 * @param ator String que identifica o nome do ator que faz o personagem.
	 */
	public Personagem(String nomePers, String ator) {
		this.nomePers = nomePers;
		this.ator = ator;
	}
	/**
	 * Método para acessar o atributo ator da classe <b>Personagem</b>
	 * @return nome do ator que faz o personagem. 
	 */
	public String getAtor() {
		return ator;
	}
	/**
	 * Método para acessar o atributo nomePers da classe <b>Personagem</b>
	 * @return nome do personagem.
	 */
	public String relatPersonagem() {
		return nomePers;
	}
	/**
	 * Método para retornar em String os atributos do objeto <b>Personagem</b>
	 */
	public String toString() {
		return "PERSONAGEM CADASTRADO COM SUCESSO! Nome do personagem = " + nomePers + ", Ator = " + ator + "";
	}

	
}
