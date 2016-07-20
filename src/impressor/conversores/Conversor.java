package impressor.conversores;

import impressor.objeto.NumeroDecimal;

public interface Conversor {

	/**
	 * Valores utilizados pelas subclasses para representação dos algarismos
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
	static final String CD = "CD";
	static final String D = "D";
	static final String CM = "CM";
	static final String M = "M";

	/**
	 * Valores utilizados pelas subclasses para representação de valores
	 * númericos chave
	 */
	static final Integer ZERO = 0;
	static final Integer UM = 1;
	static final Integer CINCO = 5;
	static final Integer DEZ = 10;
	static final Integer QUARENTA = 40;
	static final Integer CINQUENTA = 50;
	static final Integer NOVENTA = 90;
	static final Integer CEM = 100;
	static final Integer QUATROCENTOS = 400;
	static final Integer QUINHENTOS = 500;
	static final Integer NOVECENTOS = 900;
	static final Integer MIL = 1000;

	/**
	 * Detem a lógica necessária para conveter o <code>numero</code> informado
	 * como parametro em seu algarismo romano correspondente
	 * 
	 * @param numero
	 *            - Número a ser convertido em algarismo romano
	 * 
	 * @return Algarismo romano que representa o <code>numero</code>
	 */
	String getAlgarismoRomano(NumeroDecimal decimal);

	/**
	 * Responsável pela definição de quais números o objeto está apto a
	 * converter
	 * 
	 * @param numero
	 *            - Número que deseja descobrir se o objeto está apto a
	 *            converter.
	 * 
	 * @return {@link Boolean#TRUE} Caso o objeto saiba como converter o
	 *         <code>numero</code> <br/>
	 *         {@link Boolean#FALSE} Caso o objeto não saiba converter o
	 *         <code>numero</code>
	 * 
	 */
	Boolean possoConverter(NumeroDecimal decimal);

}
