package Entidades;

/**
 * A classe <b>Diretor</b> define um tipo de dado para criação de Diretores de um determinado filme<br><br>
 * Classe <b>Diretor</b> extende a classe <b>Pessoa</b>
 * @author Victor Ferreira
 * @version 1.0
 */
public class Diretor extends Pessoa {
	
	/**
	 * O atributo nome referencia o nome de um diretor.
	 */
	private String nome;
	
	/**
	 * O atributo nome referencia o nome de um filme que um diretor faz parte.
	 */
	private String filme;

	/**
	 * Construtor sobrecarregado da classe <b>Diretor</b>.
	 * @param nome String que identifica o nome do Diretor.
	 * @param filme String que identifica a qual filme o Diretor pertence.
	 */
	public Diretor(String identificador, String cpf, String identidade, String filiacao, String estadoCivil,
			String naturalidade, String endereco, String telefone, String email, String escolaridade, String nome,
			String filme) {
		/**
		 * Construtor da classe super <b>Pessoa</b>.
		 */
		super(identificador, cpf, identidade, filiacao, estadoCivil, naturalidade, endereco, telefone, email,
				escolaridade);
		this.nome = nome;
		this.filme = filme;
	}
	/**
	 * Método para acessar o atributo filme da classe <b>Diretor</b>
	 * @return filme que o diretor pertence
	 */
	public String getFilme() {
		return filme;
	}
	/**
	 * Método para acessar o atributo nome da classe <b>Diretor</b>
	 * @return nome do diretor
	 */
	public String getDiretor() {
		return nome;
	}
	/**
	 *  Método para retornar em String os atributos do objeto <b>Diretor</b>
	 */
	public String toString() {
		return "DIRETOR CADASTRADO COM SUCESSO! Nome do Diretor = " + nome + ", filme = " + filme + "";
	}

}
