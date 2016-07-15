package impressor.objetos;

import org.junit.Assert;
import org.junit.Test;

import impressor.ImpressorAlgarismoRomano;

public class AlgarismoXTest {

	@Test
	public void numeroNove() {
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(9);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("IX", algarismo);
	}

	@Test
	public void numeroDez() {
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(10);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("X", algarismo);
	}
	
	@Test
	public void numeroOnze() {
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(11);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XI", algarismo);
	}
	
	@Test
	public void numeroDoze() {
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(12);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XII", algarismo);
	}
	
	@Test
	public void numeroTreze() {
		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(13);
		String algarismo = monitor.toRomano();
		Assert.assertEquals("XIII", algarismo);
	}
	
//	@Test
//	public void numeroQuatorze() {
//		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano();
//		String algarismo = monitor.escreverEmAlgarismoRomano(14);
//		Assert.assertEquals("XIV", algarismo);
//	}
//	
//	@Test
//	public void numeroQuize() {
//		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano();
//		String algarismo = monitor.escreverEmAlgarismoRomano(15);
//		Assert.assertEquals("XV", algarismo);
//	}
//	
//	@Test
//	public void numeroDezesseis() {
//		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano();
//		String algarismo = monitor.escreverEmAlgarismoRomano(16);
//		Assert.assertEquals("XVI", algarismo);
//	}
//	
//	@Test
//	public void numeroDezesete() {
//		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano();
//		String algarismo = monitor.escreverEmAlgarismoRomano(17);
//		Assert.assertEquals("XVII", algarismo);
//	}
//	
//
//	@Test
//	public void numeroDezoito() {
//		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano();
//		String algarismo = monitor.escreverEmAlgarismoRomano(18);
//		Assert.assertEquals("XVIII", algarismo);
//	}
//	
//	@Test
//	public void numeroDezenove() {
//		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano();
//		String algarismo = monitor.escreverEmAlgarismoRomano(19);
//		Assert.assertEquals("XIX", algarismo);
//	}
//	
//	@Test
//	public void numeroVinte() {
//		ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano();
//		String algarismo = monitor.escreverEmAlgarismoRomano(20);
//		Assert.assertEquals("XX", algarismo);
//	}
}
