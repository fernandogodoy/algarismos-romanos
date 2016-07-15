package impressor.objetos;

public interface ConversorAlgarismo {

	/**
	 * Valores utilizados pelas subclasses para representa��o dos algarismos
	 * romanos
	 */
	static final String EMPTY = "";
	static final String I = "I";
	static final String V = "V";
	static final String X = "X";

	/**
	 * Valores utilizados pelas subclasses para representa��o de valores
	 * n�mericos chave
	 */
	static final Integer ZERO = 0;
	static final Integer UM = 1;
	static final Integer CINCO = 5;
	static final Integer DEZ = 10;

	/**
	 * Detem a l�gica necess�ria para conveter o <code>numero</code> informado
	 * como parametro em seu algarismo romano correspondente
	 * 
	 * @param numero
	 *            - N�mero a ser convertido em algarismo romano
	 * 
	 * @return Algarismo romano que representa o <code>numero</code>
	 */
	String getAlgarismoRomano(Integer numero);

	/**
	 * Respons�vel pela defini��o de quais n�meros o objeto est� apto a
	 * converter
	 * 
	 * @param numero
	 *            - N�mero que deseja descobrir se o objeto est� apto a
	 *            converter.
	 * 
	 * @return {@link Boolean#TRUE} Caso o objeto saiba como converter o
	 *         <code>numero</code> <br/>
	 *         {@link Boolean#FALSE} Caso o objeto n�o saiba converter o
	 *         <code>numero</code>
	 * 
	 */
	Boolean possoConverter(Integer numero);

}
