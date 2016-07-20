package impressor.objetos.testes;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import impressor.ImpressorAlgarismoRomano;
import impressor.objeto.NumeroDecimal;
import impressor.objetos.DecimalNumberDTO;
import impressor.objetos.LoadFile;

/**
 * Classe criada para compara��o entre os valores contidos no arquivo
 * 3000-3999.txt
 * 
 * @author Fernando
 *
 */
public class TesteSegundoArquivo {

	@Test
	public void testar() {
		List<DecimalNumberDTO> list = LoadFile.loadFile("3000-3999.txt");
		Assert.assertEquals(list.size(), 1000);
		for (DecimalNumberDTO numberObject : list) {
			NumeroDecimal decimalNumber = new NumeroDecimal(numberObject.getNumero());
			ImpressorAlgarismoRomano monitor = new ImpressorAlgarismoRomano(decimalNumber);
			String algarismo = monitor.toRomano();
			Assert.assertEquals(numberObject.getAlgarismo(), algarismo);
		}
	}

}