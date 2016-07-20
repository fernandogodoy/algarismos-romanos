package impressor.conversores;

import impressor.objeto.NumeroDecimal;

public class D implements Conversor {

	public String getAlgarismoRomano(NumeroDecimal decimal) {
		decimal = decimal.calculaDiferenca(QUINHENTOS);
		return D + decimal.toRomano();
	}

	@Override
	public Boolean possoConverter(NumeroDecimal decimal) {
		return decimal.getValue() > 499 && decimal.getValue() <= 899;
	}

}
