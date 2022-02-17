package Testes;
import Entidades.Pessoa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TestePessoa {

	@Test
	void testValidarCpf() {
		
		assertFalse(Pessoa.validarCpf("11111111111")); 
		assertFalse(Pessoa.validarCpf("AGUA"));
		assertFalse(Pessoa.validarCpf("9825632009")); 
		assertTrue(Pessoa.validarCpf("30818379014"));
        assertTrue(Pessoa.validarCpf("72173131044"));
        assertTrue(Pessoa.validarCpf("67993139007"));
        assertTrue(Pessoa.validarCpf("07484238180"));
        
	}

	@Test
	void testValidarEmail() {
		assertFalse(Pessoa.validarEmail("victor"));
		assertFalse(Pessoa.validarEmail(" "));
		assertTrue(Pessoa.validarEmail("victor@hotmail.com"));
	}

	@Test
	void testValidarString() {
		assertFalse(Pessoa.validarString("agua!"));
		assertFalse(Pessoa.validarString("487945"));
		assertFalse(Pessoa.validarString("arnaldo@!"));
		assertTrue(Pessoa.validarString("Arnaldo Cesar"));
		assertTrue(Pessoa.validarString("Novela"));
		
	}

	@Test
	void testValidarNum() {
		assertFalse(Pessoa.validarNum("agua!"));
		assertFalse(Pessoa.validarNum(" "));
		assertTrue(Pessoa.validarNum("123456"));
		assertTrue(Pessoa.validarNum("8254"));
		
	}

	@Test
	void testValidarTel() {
		assertFalse(Pessoa.validarTel("agua!"));
		assertFalse(Pessoa.validarTel("34587614"));
		assertTrue(Pessoa.validarTel("6134587614"));
		assertTrue(Pessoa.validarTel("61994587614"));
		assertFalse(Pessoa.validarTel("(61)99458-7614"));
	}

}
