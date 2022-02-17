package Entidades;
import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A classe <b>Pessoa</b> define um tipo de dado abstrato para criação de classes de Pessoas.
 * @author Victor Ferreira
 * @version 1.0
 */
public abstract class Pessoa {
	
	/**
	 * O atributo identificador referencia o identificador de uma pessoa.
	 */
	protected String identificador;
	
	/**
	 * O atributo CPF referencia o cpf de uma pessoa.
	 */
	protected String cpf;
	
	/**
	 * O atributo identidade referencia o rg de uma pessoa.
	 */
	protected String identidade;
	
	/**
	 * O atributo filiacao referencia a quem a pessoa é afiliada.
	 */
	protected String filiacao;
	
	/**
	 * O atributo estadoCivil referencia o estado civil de uma pessoa.
	 */
	protected String estadoCivil;
	
	/**
	 * O atributo naturalidade referencia o local (estado, município etc.) em que se nasce.
	 */
	protected String naturalidade;
	
	/**
	 * O atributo endereco referencia o endereço de uma pessoa.
	 */
	protected String endereco;
	
	/**
	 * O atributo telefone referencia o número de telefone de uma pessoa.
	 */
	protected String telefone;
	
	/**
	 * O atributo email referencia o e-mail de uma pessoa.
	 */
	protected String email;
	
	/**
	 * O atributo escolaridade referencia o grau de escolaridade de uma pessoa.
	 */
	protected String escolaridade;
 
	/**
	 * Construtor sobrecarregado da classe <b>Pessoas</b>.
	 * @param identificador String que identifica o identificador de uma pessoa.
	 * @param cpf String que identifica o cpf de uma pessoa.
	 * @param identidade String que identifica a identidade de uma pessoa.
	 * @param filiacao String que identifica a filiação de uma pessoa.
	 * @param estadoCivil String que identifica o estado civil de uma pessoa.
	 * @param naturalidade String que identifica a naturalidade de uma pessoa.
	 * @param endereco String que identifica o endereço de uma pessoa.
	 * @param telefone String que identifica o telefone de uma pessoa.
	 * @param email String que identifica o email de uma pessoa.
	 * @param escolaridade String que identifica a escolaridade de uma pessoa.
	 */
	public Pessoa(String identificador, String cpf, String identidade, String filiacao, String estadoCivil,
			String naturalidade, String endereco, String telefone, String email, String escolaridade) {

		this.identificador = identificador;
		this.cpf = cpf;
		this.identidade = identidade;
		this.filiacao = filiacao;
		this.estadoCivil = estadoCivil;
		this.naturalidade = naturalidade;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.escolaridade = escolaridade;
	}

	/**
	 * Verifica se o CPF passado é um CPF válido.
	 * (1)Verifica a quantidade de digitos da string é diferente de 11 ou todos digitos são iguais
	 * (2)Verifica se os digitos calculados conferem com os digitos informados.
	 * @param CPF uma String com um CPF a ser verificado.
	 * @return verdadeiro ou falso, mostrando se a String cpf passada é ou não válida.
	 * @author devmedia.
	 */
	public static boolean validarCpf(String CPF) {

		if (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222")
				|| CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555")
				|| CPF.equals("66666666666") || CPF.equals("77777777777") || CPF.equals("88888888888")
				|| CPF.equals("99999999999") || (CPF.length() != 11))
			return (false);

		char dig10, dig11;
		int sm, i, r, num, peso;

		try {
			// Calculo do 1. Digito Verificador
			sm = 0;
			peso = 10;
			for (i = 0; i < 9; i++) {
				// converte o i-esimo caractere do CPF em um numero:
				// por exemplo, transforma o caractere '0' no inteiro 0
				// (48 eh a posicao de '0' na tabela ASCII)
				num = (int) (CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig10 = '0';
			else
				dig10 = (char) (r + 48); // converte no respectivo caractere numerico

			// Calculo do 2. Digito Verificador
			sm = 0;
			peso = 11;
			for (i = 0; i < 10; i++) {
				num = (int) (CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig11 = '0';
			else
				dig11 = (char) (r + 48);

			// Verifica se os digitos calculados conferem com os digitos informados.
			if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
				return (true);
			else
				return (false);
		} catch (InputMismatchException erro) {
			return (false);
		}

	}
	/**
	 * Verifica se um email passado é verdadeiro.
	 * @param email uma string com um email a ser verificado.
	 * (1)Compara se o email passado é nulo e o tamanho maior que 0.
	 * (2)Verifica se o email possui algum simbolo que caracteriza um email.
	 * @return verdadeiro ou falso, mostrando se a String email passada é ou não válida.
	 */
	public static boolean validarEmail(String email) {
		boolean isEmailIdValid = false;
	    if (email != null && email.length() > 0) {
	        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
	        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
	        Matcher matcher = pattern.matcher(email);
	        if (matcher.matches()) {
	            isEmailIdValid = true;
	        }
	    }
	    return isEmailIdValid;
	}
	/**
	 * Verifica se a string passada é ou não uma string válida.
	 * Compara se a string possui caracateres ou números.
	 * @param str uma string com algum dado a ser verificado.
	 * @return verdadeiro ou falso, mostrando se o a String passada é ou não válida.
	 */
	public static boolean validarString(String str) {
		boolean valida = true;
		
		if(str.isEmpty()|| str == null)
			valida = false;
		
		
		if(str.matches("[0-9]*"))
			valida = false;
		
		if(str.length() < 2)
			valida = false;
			
			
		if(str.contains("@")||str.contains("!")||str.contains("#")||str.contains("/")||str.contains(";")||str.contains(",")||str.contains(".")
					|| str.equals(" ")|| str.equals("-")|| str.equals("?")|| str.equals("*")|| str.equals("=")|| str.equals("+")|| str.equals(">"))
			{
				valida = false;
			}
		
		return valida;
		
	}
		
	/**
	 * Método para verificar se a string passada é um número.
	 * Verifica se a entrada contém apenas números.
	 * @param st uma string com um dado a ser verificado
	 * @return verdadeiro ou falso, mostrando se a string é ou não válida.
	 */
	public static boolean validarNum(String st) {
		boolean valida = true;
		
		if(!st.matches("[0-9]*"))
			valida = false;
		
		return valida;
	}
	
	/**
	 *  Verifica se a string telefone passada é ou não um telefone válido.
	 *  (1)Verifica se a string passada é vazia
	 *  (2)Verifica se o tamanho é diferente de 10 ou 11 digitos.
	 *  (3)Verifica se o telefone passo possui apenas números.
	 * @param telefone uma string com um telefone a ser verificado.
	 * @return verdadeiro ou falso, verificando se a String passada é ou não válida.
	 */
	public static boolean validarTel(String telefone) {
		boolean valido = true;
			if(telefone.isEmpty() ) 
				valido = false;
			
		  if(telefone.length() != 10 && telefone.length() != 11)
		      valido = false;
		   
		   if(!telefone.matches("[0-9]*"))
			   valido = false;
		  
			
		   return valido;
		}
	
}
