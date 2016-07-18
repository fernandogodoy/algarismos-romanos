package impressor.conversores;

import java.util.Arrays;
import java.util.List;

import impressor.objeto.NumeroDecimal;
import impressor.util.ValorNegativoException;

public class I implements Conversor {

	private static final String II = I + I;
	private static final String III = I + I + I;
	private static final List<String> COMBINACOES = Arrays.asList(EMPTY, I, II, III);

	@Override
	public String getAlgarismoRomano(NumeroDecimal decimal) {
		try {
			return COMBINACOES.get(decimal.getValue());
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new ValorNegativoException(decimal);
		}
	}

	@Override
	public Boolean possoConverter(NumeroDecimal decimal) {
		return decimal.getValue() < 4;
	}

}
