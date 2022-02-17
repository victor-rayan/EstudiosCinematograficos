package Entidades;

/**
 * A classe <b>Filme</b> define um tipo de dado para cria��o de filmes.
 * @author Victor Ferreira
 * @version 1.0
 */
public class Filme {
	
	/**
	 * O atributo nome referencia o nome de um filme.
	 */
	private String nome;
	
	/**
	 * O atributo numMeses referencia o n�mero de meses que um filme levou sendo feito.
	 */
	private String numMeses;
	
	/**
	 * O atributo anoLancamento referencia o ano de lan�amento de um filme.
	 */
	private String anoLancamento;
	
	/**
	 * O atributo numCopyright referencia o n�mero de copyright de um filme.
	 */
	private String numCopyright;
	
	/**
	 * O atributo custo referencia o custo de um filme.
	 */
	private String custo;
	
	/**
	 * O atributo estudio referencia a qual estudio o filme pertence.
	 */
	private String estudio;
	 
	/**
	 * O objeto Diretor referencia o diretor do filme. 
	 */
	private Diretor diretor;
	
	/**
	 * Construtor sobrecarregado da classe <b>Filme</b>.
	 * @param nome String que identifica o nome do filme.
	 * @param numMeses String que identifica o n�mero de meses que o filme levou para ser feito.
	 * @param anoLancamento String que identifica o ano de lan�amento do filme.
	 * @param numCopyright String que identifica a quantidade de Copyrights do filme.
	 * @param custo String que identifica o custo total do filme.
	 * @param estudio String que identifica a qual est�dio do filme.
	 * @param diretor Objeto do tipo <b>Diretor</b> que identifica o Diretor do filme.
	 */
	public Filme(String nome, String numMeses, String anoLancamento, String numCopyright, String custo,
			String estudio, Diretor diretor) {

		this.nome = nome;
		this.numMeses = numMeses;
		this.anoLancamento = anoLancamento;
		this.numCopyright = numCopyright;
		this.custo = custo;
		this.estudio = estudio;
		this.diretor = diretor;

	}
	/**
	 * M�todo para acessar o atributo nome da classe <b>Filme</b>
	 * @return nome do filme.
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * M�todo para acessar o atributo getNumMeses da classe <b>Filme</b>
	 * @return n�mero de meses que o filme levou para ser feito.
	 */
	public String getNumMeses() {
		return numMeses;
	}
	/**
	 * M�todo para acessar o atributo anoLancamento da classe <b>Filme</b>
	 * @return ano de lan�amento do filme.
	 */
	public String getAnoLancamento() {
		return anoLancamento;
	}
	/**
	 * M�todo para acessar o atributo numCopyright da classe <b>Filme</b>
	 * @return n�mero de copyright do filme.
	 */
	public String getNumCopyright() {
		return numCopyright;
	}
	/**
	 * M�todo para acessar o atributo custo da classe <b>Filme</b>
	 * @return custo do filme.
	 */
	public String getCusto() {
		return custo;
	}
	/**
	 * M�todo para acessar o atributo estudio da classe <b>Filme</b>
	 * @return nome do est�dio que o filme pertence.
	 */
	public String getEstudio() {
		return estudio;
	}
	/**
	 * M�todo para acessar o objeto diretor da classe <b>Filme</b>
	 * @return diretor do filme.
	 */
	public Diretor getDiretor() {
		return diretor;
	}
	/**
	 * M�todo para retornar em String os atributos do objeto <b>Filme</b>
	 */
	public String toString() {
		return "FILME CADASTRADO COM SUCESSO! " + "Nome do Filme : " + nome + ", numMeses : " + numMeses
				+ ", Ano de lan�amento : " + anoLancamento + ", N�mero de Copyright : " + numCopyright + ", Custo : "
				+ custo +"$" + ", Estudio : " + estudio + "";
	}
	/**
	 * M�todo para validar nomes de filmes e Est�dios.
	 * N�o pode conter caracteres especiais e o tamanho da String passada deve ser maior que 1.
	 * @param str Uma string com um nome de filme ou Est�dio a ser verificada
	 * @return verdadeiro ou falso, caso a string seja v�lida
	 */
	public static boolean validarFE(String str) {
		boolean valida = true;
		
		if(str.isEmpty()|| str == null)
			valida = false;
		
		if(str.length() <= 1) 
			valida = false;
			
			if(str.contains("@")||str.contains("!")||str.contains("#")||str.contains("/")||str.contains(";")||str.contains(",")||str.contains(".")
					|| str.equals(" ")|| str.equals("-")|| str.equals("?")|| str.equals("*")|| str.equals("=")|| str.equals("+")|| str.equals(">"))
			{
				valida = false;
			}
		
		return valida;
		
	}

}
