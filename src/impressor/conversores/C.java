package impressor.conversores;

import impressor.objeto.NumeroDecimal;

public class C implements Conversor {

	public String getAlgarismoRomano(NumeroDecimal decimal) {
		decimal = decimal.calculaDiferenca(CEM);
		return C + decimal.toRomano();
	}

	@Override
	public Boolean possoConverter(NumeroDecimal decimal) {
		return decimal.getValue() > 99 && decimal.getValue() <= 399;
	}

}
