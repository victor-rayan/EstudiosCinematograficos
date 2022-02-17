package Application;

import java.util.Scanner;

import Entidades.Ator;
import Entidades.Diretor;
import Entidades.Estudio;
import Entidades.Filme;
import Entidades.Personagem;
import Entidades.Pessoa;

import java.util.ArrayList;

/**
 * A classe <b>Progam</b> faz toda interação com o usuário
 * @author Victor Ferreira
 * @version 1.0
 */
public class Progam {

	/**
	 * Scanner para receber dados digitados pelo usuário. <b>CadastrarEstudio</b>
	 */
	private static Scanner ler;
	
	/**
	 * Scanner para receber dados digitados pelo usuário.
	 */
	private static Scanner ler1;
	private static Scanner ler2;
	private static Scanner ler3;
	private static Scanner ler4;
	private static Scanner ler5;
	private static Scanner ler6;
	private static Scanner ler7;
	
	/**
	 * Arraylist que armazena todos objetos <b>estudio</b>
	 */
	private static ArrayList<Estudio> estudios = new ArrayList<Estudio>();
	
	/**
	 * Arraylist que armazena todos objetos <b>filme</b>
	 */
	private static ArrayList<Filme> filmes = new ArrayList<Filme>();
	
	/**
	 * Arraylist que armazena todos objetos <b>atores</b>
	 */
	private static ArrayList<Ator> atores = new ArrayList<Ator>();
	
	/**
	 * Arraylist que armazena todos objetos <b>diretores</b>
	 */
	private static ArrayList<Diretor> diretores = new ArrayList<Diretor>();
	
	/**
	 * Arraylist que armazena todos objetos <b>Personagem</b>
	 */
	private static ArrayList<Personagem> persons = new ArrayList<Personagem>();

	
	/**
	 * Método que faz a interação com usuário. Possui o menu de opções onde recebe o que o usúario deseja fazer<br><br>
	 * Caso digite "1" Chama método Cadastrar Estúdio. Caso digite Chama método "2"Cadastrar Filmes.Caso digite "3" Chama método Cadastrar Atores. Caso digite "4"Cadastrar Diretores Caso 
	 * digite "5" Adicionar Personagens de um ator. Caso digite "6" Listar filmes de um Estúdio. Caso digite "7" Listar Atores e Diretores de um Filme.
	 * Caso digite "8" Listar Cachês de um Ator. Caso digite "9" Listar todos Personagens de um Ator. Caso digite "10" Finalizar Programa.
	 * Caso Nenhuma das opções é solicitado que selecione uma opção válida.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char caso;

		do {

			System.out.println("_________________ MENU DE OPÇÕES _________________");
			System.out.println("Pressione o número correspondente ao que deseja:\n");
			System.out.println("1) Cadastrar Estúdio");
			System.out.println("2) Cadastrar Filmes");
			System.out.println("3) Cadastrar Atores");
			System.out.println("4) Cadastrar Diretores");
			System.out.println("5) Adicionar Personagens de um ator");
			System.out.println("6) Listar filmes de um Estúdio");
			System.out.println("7) Listar Atores e Diretores de um Filme");
			System.out.println("8) Listar Cachês de um Ator");
			System.out.println("9) Listar todos Personagens de um Ator");
			System.out.println("X) Pressione a tecla X para finalizar o programa");

			caso = sc.next().charAt(0);
			

			switch (caso) {
			case '1':
				cadastrarEstudio();

				break;
			case '2':
				cadastrarFilmes();

				break;
			case '3':
				cadastrarAtores();

				break;
			case '4':
				cadastrarDiretores(); 

				break;
			case '5':
				cadastrarPersonagens();

				break;
			case '6':
				listafilmes();

				break;
			case '7':
				listaAtorDiretor();

				break;
			case '8':
				listaCaches();

				break;
			case '9':
				listaPersonagem();

				break;
			case 'x':
				
				break;
			case 'X':
				
				break;
			default:
				System.out.println("*Selecione uma opção válida*\n");

			}

		} while (caso != 'x'&& caso != 'X');

		sc.close();

	}
	
	/**
	 * Método que cadastra um estúdio. Recebe os atributos que constituem um estúdio "nome" "dono" "data" e "faturamento".<br><br>
	 * Verifica se o estúdio a ser cadastrado já foi cadastrado.
	 * Caso estúdio não foi cadastrado, recebe os atributos, é chamado o construtor sobrecarregado de estudio cria-se um novo objeto estúdio e armazena na arrayList estudios.
	 */
	public static void cadastrarEstudio() {

		ler = new Scanner(System.in);

		int cont = 0;
		String data;
		String nome, dono, ano;

		System.out.println("_________________ ESTUDIOS _________________");

		do {
			System.out.println("Nome do Estúdio: ");
			nome = ler.nextLine();
		} while (Filme.validarFE(nome) == false);

		nome = nome.toUpperCase();

		for (int i = 0; i < estudios.size(); i++) {
			if (nome.trim().equalsIgnoreCase(estudios.get(i).getNome())) {
				cont = 1;
			}
		}

		if (cont == 1) {
			System.out.println("*ESSE ESTÚDIO JÁ FOI CADASTRADO*");
			System.out.println(" ");
		} else {

			do {
				System.out.println("Nome do dono do estúdio:");
				dono = ler.nextLine();

			} while (Pessoa.validarString(dono) == false);

			do {
				System.out.println("Data de Fundação: Formato (DD/MM/AAAA)");
				data = ler.nextLine();
			} while (Estudio.validarData(data) == false);

			do {
				System.out.println("Faturamento do Ano Anterior: Digite apenas números");
				ano = ler.nextLine();
			} while (Pessoa.validarNum(ano) == false);
			ler.reset();

			Estudio estudio1 = new Estudio(nome, dono, data, ano);
			estudios.add(estudio1);

			System.out.println(estudio1);
			System.out.println(" ");

		}
	}

	/**
	 * Método que cadastra um filmes. Recebe os atributos que constituem um filme "nome" "número de meses" "ano" "copyright" e "custo".<br><br>
	 * 1º verifica se filme digitado pertence a algum estúdio.
	 * Caso pertença e não tenha um mesmo filme já cadastrado, é necessário cadastrar um diretor do filme. 
	 * É chamado o construtor sobrecarregado de filmes e então é criado um objeto filme e armazenado na Arraylist Filmes.
	 * E o diretor do filme é armazenado na arraylist diretores.
	 */
	public static void cadastrarFilmes() {

		ler2 = new Scanner(System.in);
		int verif = 0;
		int cont = 0;
		String tel;
		String email;
		String estud, name, numMeses, custo;
		String nome, CPF;
		String copyright;
		String lanc;

		System.out.println("_________________ FILMES _________________");

		do {
			System.out.println("Nome do Estudio a qual o filme pertence: ");
			estud = ler2.nextLine();
		} while (Filme.validarFE(estud) == false);

		for (int i = 0; i < estudios.size(); i++) {
			if (estud.trim().equalsIgnoreCase(estudios.get(i).getNome())) {
				verif = 1;
			}
		}

		if (verif == 1) {
			estud = estud.toUpperCase();

			do {
				System.out.println("Nome do Filme: ");
				name = ler2.nextLine();
			} while (Filme.validarFE(name) == false);

			do {
				System.out.println("Número de meses que levou para ser feito: ");
				numMeses = ler2.nextLine();
			} while (Pessoa.validarNum(numMeses) == false);

			do {
				System.out.println("Ano de Lançamento: ");
				lanc = ler2.nextLine();
			} while (Pessoa.validarNum(lanc) == false || lanc.length() != 4);

			do {
				System.out.println("Números de Copyright: ");
				copyright = ler2.nextLine();
			} while (Pessoa.validarNum(copyright) == false);

			do {
				System.out.println("Custo do Filme: Digite Apenas números ");
				custo = ler2.nextLine();
			} while (Pessoa.validarNum(custo) == false);

			ler2.reset();
			for (int i = 0; i < filmes.size(); i++) {
				if (name.trim().equalsIgnoreCase(filmes.get(i).getNome())) {
					cont = 1;
				}
			}

			if (cont == 1) {
				System.out.println("ESSE FILME JÁ FOI CADASTRADO\n");
			} else {
				System.out.println("CADASTRE O DIRETOR DO FILME");

				do {
					System.out.println("Nome do Diretor do Filme:");
					nome = ler2.nextLine();
				} while (Pessoa.validarString(nome) == false);

				System.out.println("Identificador do Diretor: Apenas números");
				String ident = ler2.nextLine();

				do {
					System.out.println("Digite o CPF:");
					CPF = ler2.nextLine();
				} while (Pessoa.validarCpf(CPF) == false);

				System.out.println("Identidade:");
				String rg = ler2.nextLine();
				System.out.println("Filiacão:");
				String filia = ler2.nextLine();
				System.out.println("Estado Civil:");
				String estado = ler2.nextLine();
				System.out.println("Naturalidade:");
				String natural = ler2.nextLine();
				System.out.println("Endereço:");
				String end = ler2.nextLine();

				do {
					System.out.println("Telefone: Apenas Números com DDD");
					tel = ler2.nextLine();
				} while (Pessoa.validarTel(tel) == false);

				do {
					System.out.println("Email:");
					email = ler2.nextLine();
				} while (Pessoa.validarEmail(email) == false);

				System.out.println("Escolaridade:");
				String escola = ler2.nextLine();

				Diretor diretor1 = new Diretor(ident, CPF, rg, filia, estado, natural, end, tel, email, escola, nome,
						name);
				diretores.add(diretor1);

				Filme filme1 = new Filme(name, numMeses, lanc, copyright, custo, estud, diretor1);
				filmes.add(filme1);

				System.out.println(filme1);
				System.out.println(" ");
			}

		} else {
			System.out.println("*ESTÚDIO NÃO CADASTRADO OU INEXISTENTE*");
			System.out.println("---------------------------------------\n");
		}
	}
	
	/**
	 * Método para cadastrar Atores dos filmes. (1) Verifica o ator pertence a algum filme existente, caso verdadeiro, é recebido os atributos que compoem um ator.<br><br>
	 * (2) Todo ator tem um único nome e número de seguro social. Caso o ator não esteja cadastrado é chamado o construtor sobrecarregado de atores e criado um novo objeto ator armazendo na ArrayList atores.
	 */
	public static void cadastrarAtores() {

		ler5 = new Scanner(System.in);
		int verf = 0;
		int cont = 0;
		String email;
		String tel, CPF, cache;
		String numSeguro, nome, papeis, idade, nacional;
		char sexo;

		System.out.println("_________________ ATORES _________________");
		System.out.println("Nome do Filme onde atua");
		String filme = ler5.nextLine();

		for (int i = 0; i < filmes.size(); i++) {
			if (filme.trim().equalsIgnoreCase(filmes.get(i).getNome())) {
				cont = 1;
			}
		}

		if (cont == 1) {

			do {
				System.out.println("Número de Seguro social: Apenas números");
				numSeguro = ler5.nextLine();
			} while (Pessoa.validarNum(numSeguro) == false);

			do {
				System.out.println("Nome Artístico do Ator");
				nome = ler5.nextLine();
			} while (Pessoa.validarString(nome) == false);

			nome = nome.toUpperCase();

			for (int i = 0; i < atores.size(); i++) {
				if (nome.trim().equalsIgnoreCase(atores.get(i).getAtor())
						|| numSeguro.trim().equalsIgnoreCase(atores.get(i).getNumSeguro())) {
					verf = 1;
				}
			}

			if (verf == 1) {
				System.out.println("ESSE ATOR JÁ ESTÁ CADASTRADO");
				System.out.println(" ");
			} else {
				System.out.println("Identificador do Ator:");
				String ident = ler5.nextLine();

				do {
					System.out.println("Digite o CPF:");
					CPF = ler5.nextLine();
				} while (Pessoa.validarCpf(CPF) == false);

				System.out.println("Identidade:");
				String rg = ler5.nextLine();
				System.out.println("Filiação:");
				String filia = ler5.nextLine();
				System.out.println("Estado Civil:");
				String estado = ler5.nextLine();
				System.out.println("Naturalidade:");
				String natural = ler5.nextLine();
				System.out.println("Endereço:");
				String end = ler5.nextLine();

				do {
					System.out.println("Telefone: Apenas Números com DDD");
					tel = ler2.nextLine();
				} while (Pessoa.validarTel(tel) == false);

				do {
					System.out.println("Email:");
					email = ler5.nextLine();
				} while (Pessoa.validarEmail(email) == false);

				System.out.println("Escolaridade:");
				String escola = ler5.nextLine();
				
				do {
					System.out.println("Nacionalidade:");
					nacional = ler5.nextLine();
				} while (Pessoa.validarString(nacional) == false);

				do {
					System.out.println("Idade: Apenas números");
					idade = ler5.nextLine();
				} while (Pessoa.validarNum(idade) == false || idade.length() < 1);

				do {
					System.out.println("Papeis:");
					papeis = ler5.nextLine();
				} while (Pessoa.validarString(papeis) == false);

				do {
					System.out.println("Cachê: Apenas números");
					cache = ler5.nextLine();
				} while (Pessoa.validarNum(cache) == false);
				
				do {
					System.out.println("Sexo: Digite 'F' para Feminino e 'M' para Masculino:");
					sexo = ler5.next().charAt(0);
				} while (sexo != 'm' && sexo != 'M' && sexo != 'F' && sexo != 'f');

				Ator ator1 = new Ator(ident, CPF, rg, filia, estado, natural, end, tel, email, escola, nome, numSeguro,
						nacional, idade, papeis, sexo, cache, filme);

				atores.add(ator1);
				System.out.println(ator1);
				System.out.println(" ");
			}
		} else {
			System.out.println("FILME INEXISTENTE OU NÃO CADASTRADO");
			System.out.println(" ");
		}
	}

	/**
	 * Método para cadastrar Diretores dos filmes, caso um filme tenha mais que um diretor. (1)É verificado se o diretor já está cadastrado.
	 * Caso não esteja cadastrado é recebido os atributos que o compoem e criado um novo diretor, armazendo na Arraylist Diretores.
	 */
	public static void cadastrarDiretores() {
		int verf = 0;
		int veri = 0;
		String CPF;
		String tel;
		String email, nome, ident;

		ler4 = new Scanner(System.in);

		System.out.println("_________________ DIRETORES _________________");

		do {
			System.out.println("Nome do Diretor do Filme:");
			nome = ler4.nextLine();
		} while (Pessoa.validarString(nome) == false);

		do {
			System.out.println("Identificador do Diretor: Apenas Números");
			ident = ler4.nextLine();
		} while (Pessoa.validarNum(ident) == false);

		for (int i = 0; i < diretores.size(); i++) {
			if (nome.trim().equalsIgnoreCase(diretores.get(i).getDiretor())) {
				verf = 1;
			}
		}

		if (verf == 1) {
			System.out.println("ESSE DIRETOR JÁ ESTÁ CADASTRADO");
			System.out.println(" ");
		} else {
			System.out.println("Filme que o Diretor faz parte:");
			String filme = ler4.nextLine();
			for (int i = 0; i < filmes.size(); i++) {
				if (filme.trim().equalsIgnoreCase(filmes.get(i).getNome())) {
					veri = 1;
				}
			}

			if (veri == 1) {

				do {
					System.out.println("Digite o CPF:");
					CPF = ler4.nextLine();

				} while (Pessoa.validarCpf(CPF) == false);

				System.out.println("Identidade:");
				String rg = ler4.nextLine();
				System.out.println("Filiacão:");
				String filia = ler4.nextLine();
				System.out.println("Estado Civil:");
				String estado = ler4.nextLine();
				System.out.println("Naturalidade:");
				String natural = ler4.nextLine();
				System.out.println("Endereço:");
				String end = ler4.nextLine();

				do {
					System.out.println("Telefone: Apenas Números com DDD");
					tel = ler2.nextLine();
				} while (Pessoa.validarTel(tel) == false);

				do {
					System.out.println("Email:");
					email = ler5.nextLine();
				} while (Pessoa.validarEmail(email) == false);

				System.out.println("Escolaridade:");
				String escola = ler4.nextLine();

				Diretor diretor1 = new Diretor(ident, CPF, rg, filia, estado, natural, end, tel, email, escola, nome,
						filme);
				diretores.add(diretor1);

				System.out.println(diretor1);
				System.out.println(" ");
			}
		}
	}

	/**
	 * Método para adicionar novos personagens de um determinado ator. 1º Verifica se o nome "único" do ator que faz o personagem já existe, caso exista o ator, recebe 
	 * o nome do novo personagem, e é armazenado na Arraylist Personagens.
	 */
	public static void cadastrarPersonagens() {
		ler3 = new Scanner(System.in);

		int cont = 0;
		String pers;

		System.out.println("_________________ADICIONAR PERSONAGENS A UM ATOR _________________");
		System.out.println("Nome artístico do Ator que faz o personagem");
		String atr = ler3.nextLine();
		atr = atr.toUpperCase();
		for (int i = 0; i < atores.size(); i++) {
			if (atr.trim().equalsIgnoreCase(atores.get(i).getAtor())) {
				cont = 1;
			}
		}

		if (cont == 1) {

			do {
				System.out.println("Nome do Personagem");
				pers = ler3.nextLine();
			} while (Pessoa.validarString(pers) == false);

			Personagem perso1 = new Personagem(pers, atr);
			persons.add(perso1);

			System.out.println(perso1);
			System.out.println(" ");
		} else {
			System.out.println("*ATOR NÃO CADASTRADO OU INEXISTENTE*");
			System.out.println(" ");
		}
	}

	/**
	 * Método para listar todos os filmes de um estúdio. (1) Recebe o nome do estúdio, caso nome do estúdio exista e possua filmes, e mostrado na tela 
	 * todos os filmes desse estúdio.
	 */
	public static void listafilmes() {
		ler6 = new Scanner(System.in);
		
		boolean exit = false;
		

		System.out.println("Digite o nome do Estúdio");
		String std = ler6.nextLine();
		
		std = std.toUpperCase();

		for (int i = 0; i < filmes.size(); i++) {

			if (std.trim().equalsIgnoreCase(filmes.get(i).getEstudio())||filmes.get(i).getEstudio().contains(std)) { 
				System.out.println("Estúdio:"+filmes.get(i).getEstudio()+" Filme:"+filmes.get(i).getNome());
				System.out.println(" ");
				exit = true;
			} 	
		}
		 if(exit == false){
			System.out.println("*ESTÚDIO NÃO CADASTRADO OU NÃO POSSUI NENHUM FILME*");
			System.out.println(" ");
		 }
	}

	/**
	 * Método que mostra todos os atores e diretores dos filmes. Mostra o nome do filme + nome do ator ou diretor. Não importa qual seja o estúdio.
	 * Os dados estão armazenados respectivamente na arraylist atores e diretores.
	 */
	public static void listaAtorDiretor() { 
		System.out.println("ATORES DOS FILMES:");
		for (int i = 0; i < atores.size(); i++) {

			System.out.print("Filme:" + atores.get(i).getFilmes());
			System.out.println("  Ator:" + atores.get(i).getAtor());
			System.out.println(" ");
		}
		System.out.println("DIRETORES DOS FILMES: ");
		for (int x = 0; x < diretores.size(); x++) {
			System.out.print("Filme:" + diretores.get(x).getFilme());
			System.out.println("  Diretor:" + diretores.get(x).getDiretor());
			System.out.println(" ");
		}
	}

	/**
	 * Método que mostra o cachê de um determinado ator. (1) Recebe o nome do ator, caso exista, Arraylist atores é varrida e mostra o cachê desse ator.
	 */
	public static void listaCaches() {
		ler7 = new Scanner(System.in);
		
		boolean exit = false;


		System.out.println("Digite o nome do Ator que deseja ver o cachê:");
		String ator = ler7.nextLine();
		
		ator = ator.toUpperCase();

		for (int i = 0; i < atores.size(); i++) {

			if (ator.trim().equalsIgnoreCase(atores.get(i).getAtor())||atores.get(i).getAtor().contains(ator)) {
				System.out.println("Ator="+atores.get(i).getAtor()+ " Cachê= " + atores.get(i).getCache()+"$");
				System.out.println(" ");
				exit = true;
			}
		}
		if(exit ==false) {
			System.out.println("ATOR NÃO ENCONTRADO OU INEXISTENTE");
			System.out.println(" ");
		}
	}

	/**
	 * Mostra todos os personagens de um ator. (1) Recebe o nome do ator que deseja mostrar os personagens. Caso ator exista e possua personagens. É varrida 
	 *  a arraylist persons e busca o nome dos personagens mostrando na tela.
	 */
	public static void listaPersonagem() {
		ler1 = new Scanner(System.in);

		boolean exit = false;

		System.out.println("Digite o nome do Ator que deseja buscar os Personagens:");
		String persona = ler1.nextLine();
		
		persona=persona.toUpperCase();

		for (int i = 0; i < persons.size(); i++) {

			if (persona.trim().equalsIgnoreCase(persons.get(i).getAtor())||persons.get(i).getAtor().contains(persona)) { 
				System.out.println("Ator:"+persons.get(i).getAtor()+" Personagem:"+persons.get(i).relatPersonagem());
				exit = true;
			}
			
		}
		if(exit==false) {
			System.out.println("*ATOR INEXISTENTE OU NÃO POSSUI NENHUM PERSONAGEM*");
			System.out.println(" ");
		}	
	}
}
