package impressor.objetos;

public class AlgarismoX implements ConversorAlgarismo {

	private static final ConversorAlgarismo converter = new AlgarismoI();
	private static final String IX = converter.getAlgarismoRomano(UM) + X;

	public String getAlgarismoRomano(Integer valor) {
		try {
			Integer numero = valor - DEZ;
			return X + converter.getAlgarismoRomano(numero);
		} catch (ArrayIndexOutOfBoundsException ex) {
			return IX;
		}
	}

	@Override
	public Boolean possoConverter(Integer numero) {
		return numero > 8 && numero < 14;
	}
}
