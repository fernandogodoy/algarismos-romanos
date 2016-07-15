package impressor.objetos;

public class AlgarismoV implements ConversorAlgarismo {

	private static final ConversorAlgarismo converter = new AlgarismoI();
	private static final String IV = converter.getAlgarismoRomano(UM) + V;

	public String getAlgarismoRomano(Integer valor) {
		try {
			Integer numero = valor - CINCO;
			return V + converter.getAlgarismoRomano(numero);
		} catch (ArrayIndexOutOfBoundsException ex) {
			return IV;
		}
	}

	@Override
	public Boolean possoConverter(Integer numero) {
		return numero > 3 && numero < 9 ;
	}

}
