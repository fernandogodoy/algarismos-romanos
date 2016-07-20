package impressor.conversores;

import impressor.objeto.NumeroDecimal;

public class M implements Conversor {

	public String getAlgarismoRomano(NumeroDecimal decimal) {
		decimal = decimal.calculaDiferenca(MIL);
		return M + decimal.toRomano();
	}

	@Override
	public Boolean possoConverter(NumeroDecimal decimal) {
		return decimal.getValue() > 999 && decimal.getValue() <= 3999;
	}

}
