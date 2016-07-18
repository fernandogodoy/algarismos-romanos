package impressor.util;

import impressor.objeto.NumeroDecimal;

public class ValorNegativoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private NumeroDecimal decimal;

	public ValorNegativoException(NumeroDecimal decimal) {
		this.decimal = decimal;
	}

	public NumeroDecimal getDecimal() {
		return decimal;
	}

	public NumeroDecimal getDecimalPosivo() {
		Integer valor = Math.abs(decimal.getValue());
		return new NumeroDecimal(valor.toString());
	}
}
