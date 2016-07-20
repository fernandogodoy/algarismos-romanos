package impressor.conversores;

import impressor.objeto.NumeroDecimal;

public class CD implements Conversor {

	public String getAlgarismoRomano(NumeroDecimal decimal) {
		decimal = decimal.calculaDiferenca(QUATROCENTOS);
		return CD + decimal.toRomano();
	}

	@Override
	public Boolean possoConverter(NumeroDecimal decimal) {
		return decimal.getValue() > 399 && decimal.getValue() <= 499;
	}

}
