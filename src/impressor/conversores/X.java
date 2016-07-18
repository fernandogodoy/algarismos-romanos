package impressor.conversores;

import impressor.objeto.NumeroDecimal;
import impressor.util.ValorNegativoException;

public class X implements Conversor {

	public String getAlgarismoRomano(NumeroDecimal decimal) {
		try {
			decimal = decimal.calculaDiferenca(DEZ);
			return X + decimal.toRomano();
		} catch (ValorNegativoException ex) {
			return ex.getDecimalPosivo().toRomano() + X;
		}
	}

	@Override
	public Boolean possoConverter(NumeroDecimal decimal) {
		return decimal.getValue() > 8 && decimal.getValue() <= 39;
	}
}
