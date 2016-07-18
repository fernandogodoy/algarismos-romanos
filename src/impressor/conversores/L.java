package impressor.conversores;

import impressor.objeto.NumeroDecimal;
import impressor.util.ValorNegativoException;

public class L implements Conversor {

	@Override
	public String getAlgarismoRomano(NumeroDecimal decimal) {
		try {
			decimal = decimal.calculaDiferenca(CINQUENTA);
			return L + decimal.toRomano();
		} catch (ValorNegativoException ex) {
			return ex.getDecimalPosivo().toRomano() + L;
		}
	}

	@Override
	public Boolean possoConverter(NumeroDecimal decimal) {
		return decimal.getValue() > 49 && decimal.getValue() < 90;
	}

}
