package impressor.conversores;

import impressor.objeto.NumeroDecimal;

public class XL implements Conversor {

	public String getAlgarismoRomano(NumeroDecimal decimal) {
		decimal = decimal.calculaDiferenca(QUARENTA);
		return XL + decimal.toRomano();
	}

	@Override
	public Boolean possoConverter(NumeroDecimal decimal) {
		return decimal.getValue() > 39 && decimal.getValue() <= 49;
	}

}
