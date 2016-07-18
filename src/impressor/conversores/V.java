package impressor.conversores;

import impressor.objeto.NumeroDecimal;
import impressor.util.ValorNegativoException;

public class V implements Conversor {

	public String getAlgarismoRomano(NumeroDecimal decimal) {
		try {
			decimal = decimal.calculaDiferenca(CINCO);
			return V + decimal.toRomano();
		} catch (ValorNegativoException ex) {
			return ex.getDecimalPosivo().toRomano() + V;
		}
	}

	@Override
	public Boolean possoConverter(NumeroDecimal decimal) {
		return decimal.getValue() > 3 && decimal.getValue() < 9;
	}

}
