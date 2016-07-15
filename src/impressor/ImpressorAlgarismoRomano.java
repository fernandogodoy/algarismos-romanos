package impressor;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import impressor.objetos.AlgarismoI;
import impressor.objetos.AlgarismoV;
import impressor.objetos.AlgarismoX;
import impressor.objetos.ConversorAlgarismo;

public class ImpressorAlgarismoRomano {

	private final Integer numero;
	private static Scanner sc = new Scanner(System.in);
	static List<ConversorAlgarismo> lista;

	/**
	 * Inicializa��o de Objetos Conversores de Algarismos
	 */
	static {
		lista = new LinkedList<>();
		lista.add(new AlgarismoI());
		lista.add(new AlgarismoV());
		lista.add(new AlgarismoX());
	}

	/**
	 * Construtor do Objeto
	 * 
	 * @param numero
	 *            N�mero no qual se deseja descobrir o algarismo romano
	 *            correspondente
	 */
	public ImpressorAlgarismoRomano(Integer numero) {
		this.numero = numero;
	}

	public static void main(String[] args) {
		Integer numero = getNumeroDigitado();
		ImpressorAlgarismoRomano impressor = new ImpressorAlgarismoRomano(numero);
		String algarismoRomano = impressor.toRomano();
		escreverResultado(numero, algarismoRomano);
	}

	/**
	 * Recupera o n�mero digitado pelo usu�rio
	 * 
	 * @return {@link Integer} value
	 */
	private static Integer getNumeroDigitado() {
		System.out.println("Digite o numero: ");
		String strNumero = sc.next();
		Integer numero = Integer.valueOf(strNumero);
		return numero;
	}

	/**
	 * Retorna o algarismo romano correspondente ao <code>numero</code>
	 * informado pelo usu�rio
	 * 
	 * @return Algarismo Romano
	 */
	public String toRomano() {
		ConversorAlgarismo conversor = getConversor();
		return conversor.getAlgarismoRomano(numero);
	}

	/**
	 * Respons�vel por descobrir qual objeto est� apto para convers�o do
	 * <code>numero</code> digitado pelo usu�rio
	 * 
	 * @return {@link ConversorAlgarismo} Apto a converter o <code>numero</code>
	 *         informado pelo usu�rio em seu algarismo romano correspondente
	 */
	private ConversorAlgarismo getConversor() {
		ConversorAlgarismo conversor = lista.stream().filter(c -> c.possoConverter(numero)).findFirst().get();
		return conversor;
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
	private static void escreverResultado(Integer numero, String algarismoRomano) {
		String texto = "O Algarismo Romano correspondente ao n�mero %s � %s";
		System.out.println(String.format(texto, numero, algarismoRomano));
	}

}
