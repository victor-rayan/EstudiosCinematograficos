package Entidades;

/**
 * A classe <b>Ator</b> define um tipo de dado para criação de Atores de um determinado filme<br><br>
 * <b>Ator</b> extende a classe <b>Pessoa</b>
 * @author Victor Ferreira
 * @version 1.0
 */
public class Ator extends Pessoa {

	/**
	 * O atributo nome referencia o nome de um ator.
	 */
	private String nome;
	
	/**
	 * O atributo numSeguro referencia o número de seguro social de um ator.
	 */
	private String numSeguro;
	
	/**
	 * O atributo nacionalidade referencia a nacionalidade de um ator.
	 */
	private String nacionalidade;
	
	/**
	 * O atributo idade referencia a idade de um ator.
	 */
	private String idade;
	
	/**
	 * O atributo papeis referencia os papeis feitos por um ator.
	 */
	private String papeis;
	
	/**
	 * O atributo sexo referencia o sexo de um ator.
	 */
	private char sexo;
	
	/**
	 * O atributo cache referencia o Cachê de um ator.
	 */
	private String cache;
	
	/**
	 * O atributo filmes referencia o nome dos filmes feitos por um ator.
	 */
	private String filmes;
	
	
	/**
	 * Construtor sobrecarregado da classe <b>Ator</b>.
	 * @param nome String que identifica o nome do ator. 
	 * @param numSeguro String que identifica o seguro do ator. 
	 * @param nacionalidade String que identifica o nacionalidade do ator. 
	 * @param idade String que identifica a idade do ator. 
	 * @param papeis String que identifica os papel do ator no filme. 
	 * @param cache Double que identifica o cachê do ator.
	 * @param filmes String que identifica os filmes que o ator atua.
	 */
	public Ator(String identificador, String cpf, String identidade, String filiacao, String estadoCivil,
			String naturalidade, String endereco, String telefone, String email, String escolaridade, String nome,
			String numSeguro, String nacionalidade, String idade, String papeis,char sexo, String cache, String filmes) {
		super(identificador, cpf, identidade, filiacao, estadoCivil, naturalidade, endereco, telefone, email,
				escolaridade);
		this.nome = nome;
		this.numSeguro = numSeguro;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.papeis = papeis;
		this.sexo = sexo;
		this.cache = cache;
		this.filmes = filmes;
		
		
	}
	/**
	 * Método para acessar o atributo nome da classe <b>Ator</b>
	 * @return nome do Ator
	 */
	public String getAtor() {
		return nome;
	}
	/**
	 * Método para acessar o atributo numSeguro da classe <b>Ator</b>
	 * @return número de seguro do ator.
	 */
	public String getNumSeguro() {
		return numSeguro;
	}
	/**
	 * Método para acessar o atributo nacionalidade da classe <b>Ator</b>
	 * @return nacionalidade do ator.
	 */
	public String getNacionalidade() {
		return nacionalidade;
	}
	/**
	 * Método para acessar o atributo idade da classe <b>Ator</b>
	 * @return idade do ator.
	 */
	public String getIdade() {
		return idade;
	}
	/**
	 * Método para acessar o atributo papeis da classe <b>Ator</b>
	 * @return papeis que um ator executa.
	 */
	public String getPapeis() {
		return papeis;
	}
	/**
	 * Método para acessar o atributo filmes da classe <b>Ator</b>
	 * @return filme que o ator pertence.
	 */
	public String getFilmes() {
		return filmes;
	}
	/**
	 * Método para acessar o atributo cache da classe <b>Ator</b>
	 * @return cachê de um ator.
	 */
	public String getCache() {
		return cache;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	/**
	 * Método para retornar em String os atributos do objeto <b>Ator</b>
	 */
	public String toString() {
		return "ATOR CADASTRADO COM SUCESSO! Nome do Ator = " + nome + ", Número do Seguro = " + numSeguro + ", nacionalidade = " + nacionalidade
				+ ", idade = " + idade + ", papeis = " + papeis + ", cache = " + cache +"$ " +", filmes = " + filmes + "";
	}


}
