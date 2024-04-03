package pruebas;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Cuenta;

public class Pruebas {
	private Cuenta cuenta;
	
	@BeforeEach
	public void setUp(){
		this.cuenta = new Cuenta(1, 10000, "Ahorros");
	}
	
	
	@Test
	public void consignarTest(){
		assertEquals(11000, this.cuenta.consignar(1000));
		
	}
	@Test
	public void retirarTest(){
		assertTrue(this.cuenta.retirar(3000));
		assertFalse(this.cuenta.retirar(11000));
	}


}
