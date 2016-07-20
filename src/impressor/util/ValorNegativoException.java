package impressor.util;

import impressor.conversores.I;
import impressor.objeto.NumeroDecimal;

/**
 * Exce��o que ser� lan�ada sempre que houver uma tentativa de acesso a uma
 * posi��o negativa na lista de combina��es para o objeto {@link I}
 * 
 * @author Fernando
 *
 */
public class ValorNegativoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private NumeroDecimal decimal;

	public ValorNegativoException(NumeroDecimal decimal) {
		this.decimal = decimal;
	}

	public NumeroDecimal getDecimal() {
		return decimal;
	}

	/**
	 * Converte o valor negativo em um valor positivo
	 * 
	 * @return
	 */
	public NumeroDecimal getDecimalPosivo() {
		Integer valor = Math.abs(decimal.getValue());
		return new NumeroDecimal(valor.toString());
	}
}
