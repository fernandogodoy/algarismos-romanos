package impressor.objetos;

import org.junit.Assert;
import org.junit.Test;

import impressor.ImpressorAlgarismoRomano;

public class AlgarismoVTest {

	@Test
	public void numeroQuatro() {
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(4);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("IV", algarismo);
	}

	@Test
	public void numeroCinco() {
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(5);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("V", algarismo);
	}

	@Test
	public void numeroSeis() {
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(6);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("VI", algarismo);
	}

	@Test
	public void numeroSete() {
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(7);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("VII", algarismo);
	}

	@Test
	public void numeroOito() {
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(8);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("VIII", algarismo);
	}

}
