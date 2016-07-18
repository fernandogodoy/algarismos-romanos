package impressor.conversores;

import impressor.objeto.NumeroDecimal;

public class XC implements Conversor {

	public String getAlgarismoRomano(NumeroDecimal decimal) {
		decimal = decimal.calculaDiferenca(NOVENTA);
		return XC + decimal.toRomano();
	}

	@Override
	public Boolean possoConverter(NumeroDecimal decimal) {
		return decimal.getValue() > 89 && decimal.getValue() <= 99;
	}

}
