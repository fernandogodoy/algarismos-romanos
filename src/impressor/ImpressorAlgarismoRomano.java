package impressor;

import java.util.Scanner;

import impressor.objeto.NumeroDecimal;

public class ImpressorAlgarismoRomano {

	private final NumeroDecimal decimal;
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Construtor do Objeto
	 * 
	 * @param decimalNumber
	 *            N�mero no qual se deseja descobrir o algarismo romano
	 *            correspondente
	 */
	public ImpressorAlgarismoRomano(NumeroDecimal decimalNumber) {
		this.decimal = decimalNumber;
	}

	public static void main(String[] args) {
		NumeroDecimal numeroDecimal = getNumeroDigitado();
		ImpressorAlgarismoRomano impressor = new ImpressorAlgarismoRomano(numeroDecimal);
		impressor.escreverResultado();
	}

	public String toRomano() {
		return decimal.toRomano();
	}

	/**
	 * Recupera o n�mero digitado pelo usu�rio
	 * 
	 * @return {@link Integer} value
	 */
	private static NumeroDecimal getNumeroDigitado() {
		System.out.println("Digite o numero: ");
		NumeroDecimal numeroDecimal = new NumeroDecimal(sc.next());
		return numeroDecimal;
	}

	/**
	 * Escreve no console o resultado do processamento.
	 * 
	 * @param numero
	 *            - Valor informado pelo usu�rio
	 * 
	 * @param algarismoRomano
	 *            - Algarismo romano correspondente ao <code>numero</code>
	 *            digitado.
	 */
	private void escreverResultado() {
		String texto = "O Algarismo Romano correspondente ao n�mero %s � %s";
		System.out.println(String.format(texto, this.decimal.getValue(), this.toRomano()));
	}

}
