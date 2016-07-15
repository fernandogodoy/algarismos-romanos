package impressor.objetos;

import org.junit.Assert;
import org.junit.Test;

import impressor.ImpressorAlgarismoRomano;

public class AlgarismoITest {

	@Test
	public void numeroUm() {
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(1);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("I", algarismo);
	}

	@Test
	public void numeroDois() {
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(2);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("II", algarismo);
	}

	@Test
	public void numeroTres() {
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(3);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("III", algarismo);
	}

	
	

}
