package impressor.objeto;

import impressor.conversores.Conversor;
import impressor.util.ListaConversores;

/**
 * Objeto que representa um valor decimal
 * 
 * @author Fernando
 *
 */
public class NumeroDecimal {

	/**
	 * Algarismo Decimal a que este objeto representa
	 */
	public Integer numero;

	public NumeroDecimal(String valor) {
		this.numero = Integer.valueOf(valor);
	}

	public Integer getValue() {
		return numero;
	}

	/**
	 * Calcula a diferença entre o número digitado e o numero que cada conversor
	 * representa.
	 * 
	 * @param valor
	 * 
	 * @return - {@link NumeroDecimal}
	 */
	public NumeroDecimal calculaDiferenca(Integer valor) {
		Integer resultado = this.numero - valor;
		return new NumeroDecimal(resultado.toString());
	}

	/**
	 * Encontra o conversor de algarismos romano apto a converter o valor
	 * decimal contido em {@link NumeroDecimal#numero}
	 * 
	 * @return
	 */
	private Conversor getMyConverter() {
		return ListaConversores.getAll().stream().filter(c -> c.possoConverter(this)).findFirst().get();
	}

	/**
	 * Chama o método que fará a conversão do objeto em um algarismo romano
	 * 
	 * @return - String que representa o algarismo romano referente ao
	 *         {@link NumeroDecimal#numero}
	 */
	public String toRomano() {
		return getMyConverter().getAlgarismoRomano(this);
	}

	@Override
	public String toString() {
		return numero.toString();
	}

}