package impressor.objeto;

import impressor.conversores.Conversor;
import impressor.util.ListaConversores;

public class NumeroDecimal {

	public Integer numero;

	public NumeroDecimal(String valor) {
		this.numero = Integer.valueOf(valor);
	}

	public Integer getValue() {
		return numero;
	}

	public NumeroDecimal calculaDiferenca(Integer valor) {
		Integer resultado = this.numero - valor;
		return new NumeroDecimal(resultado.toString());
	}

	private Conversor getMyConverter() {
		return ListaConversores.getAll().stream().filter(c -> c.possoConverter(this)).findFirst().get();
	}

	public String toRomano() {
		return getMyConverter().getAlgarismoRomano(this);
	}
	
	@Override
	public String toString() {
		return numero.toString();
	}

}