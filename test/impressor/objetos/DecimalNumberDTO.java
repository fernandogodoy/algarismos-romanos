package impressor.objetos;

public class DecimalNumberDTO {

	private String numero;
	private String algarismo;

	public DecimalNumberDTO(String numero, String algarismo) {
		this.numero = numero;
		this.algarismo = algarismo;

	}

	public String getAlgarismo() {
		return algarismo;
	}

	public String getNumero() {
		return numero;
	}

}
