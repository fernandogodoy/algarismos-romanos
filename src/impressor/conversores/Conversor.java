package impressor.conversores;

import impressor.objeto.NumeroDecimal;

public interface Conversor {

	/**
	 * Valores utilizados pelas subclasses para representa��o dos algarismos
	 * romanos
	 */
	static final String EMPTY = "";
	static final String I = "I";
	static final String V = "V";
	static final String X = "X";
	static final String XL = "XL";
	static final String L = "L";
	static final String XC = "XC";
	static final String C = "C";

	/**
	 * Valores utilizados pelas subclasses para representa��o de valores
	 * n�mericos chave
	 */
	static final Integer ZERO = 0;
	static final Integer UM = 1;
	static final Integer CINCO = 5;
	static final Integer DEZ = 10;
	static final Integer QUARENTA = 40;
	static final Integer CINQUENTA = 50;
	static final Integer NOVENTA = 90;
	static final Integer CEM = 100;

	/**
	 * Detem a l�gica necess�ria para conveter o <code>numero</code> informado
	 * como parametro em seu algarismo romano correspondente
	 * 
	 * @param numero
	 *            - N�mero a ser convertido em algarismo romano
	 * 
	 * @return Algarismo romano que representa o <code>numero</code>
	 */
	String getAlgarismoRomano(NumeroDecimal decimal);

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
	Boolean possoConverter(NumeroDecimal decimal);

}
