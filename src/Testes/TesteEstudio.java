package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Entidades.Estudio;

class TesteEstudio {

	@Test
	void testValidarData() {
		assertTrue(Estudio.validarData("14/12/2000"));
		assertTrue(Estudio.validarData("20/09/1995"));
		assertFalse(Estudio.validarData("14/30/2000"));
		assertFalse(Estudio.validarData("40/12/2020"));
		assertFalse(Estudio.validarData("agua"));
	}

}
