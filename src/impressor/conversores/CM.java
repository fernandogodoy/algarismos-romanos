package impressor.conversores;

import impressor.objeto.NumeroDecimal;

public class CM implements Conversor {

	public String getAlgarismoRomano(NumeroDecimal decimal) {
		decimal = decimal.calculaDiferenca(NOVECENTOS);
		return CM + decimal.toRomano();
	}

	@Override
	public Boolean possoConverter(NumeroDecimal decimal) {
		return decimal.getValue() > 899 && decimal.getValue() <= 999;
	}

}
