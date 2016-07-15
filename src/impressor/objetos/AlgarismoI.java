package impressor.objetos;

import java.util.Arrays;
import java.util.List;

public class AlgarismoI implements ConversorAlgarismo {

	private static final String II = I + I;
	private static final String III = I + I + I;
	private static final List<String> COMBINACOES = Arrays.asList(EMPTY, I, II, III);

	@Override
	public String getAlgarismoRomano(Integer numero) {
		return COMBINACOES.get(numero);
	}

	@Override
	public Boolean possoConverter(Integer numero) {
		return numero < 4;
	}

	

}
