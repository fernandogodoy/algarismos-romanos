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
	 *            Número no qual se deseja descobrir o algarismo romano
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
	 * Recupera o número digitado pelo usuário
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
	 *            - Valor informado pelo usuário
	 * 
	 * @param algarismoRomano
	 *            - Algarismo romano correspondente ao <code>numero</code>
	 *            digitado.
	 */
	private void escreverResultado() {
		String texto = "O Algarismo Romano correspondente ao número %s é %s";
		System.out.println(String.format(texto, this.decimal.getValue(), this.toRomano()));
	}

}
