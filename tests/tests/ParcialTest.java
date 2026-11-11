package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;

public class ParcialTest  {
	private Parcial parcial;
	
	@BeforeEach
	public void setUp() {
		this.parcial = new Parcial();
	}
	
	@Test
	public void correcto() throws Exception {
		assertEquals("X=-2.0, X=-3.0", this.parcial.raices(1, 5,6));
	}
	
	@Test
	public void excepcionAEs0() {
		Exception excepcion = assertThrows(
				Exception.class,
				() -> this.parcial.raices(0,10, 0)
				);

		assertEquals("a tiene que ser diferente de 0", excepcion.getMessage());
	}
	
	@Test
	public void excepcionaNoSolucion() {
		Exception excepcion = assertThrows(
				Exception.class,
				() -> this.parcial.raices(1,0, 1)
				);

		assertEquals("No tiene solución dentro de los numeros reales", excepcion.getMessage());
	}
	
	@Test
	public void tiempo() {
		assertTimeout(
				Duration.ofSeconds(1),
				() -> this.parcial.raices(100,100,10)
				);
	}

}
