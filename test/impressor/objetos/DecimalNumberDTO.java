package impressor.objetos;

/**
 * Objeto que representa cada linha contida nos arquivos de texto.
 * 
 * @author Fernando
 *
 */
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((algarismo == null) ? 0 : algarismo.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof DecimalNumberDTO)) {
			return false;
		}
		DecimalNumberDTO other = (DecimalNumberDTO) obj;
		if (algarismo == null) {
			if (other.algarismo != null) {
				return false;
			}
		} else if (!algarismo.equals(other.algarismo)) {
			return false;
		}
		if (numero == null) {
			if (other.numero != null) {
				return false;
			}
		} else if (!numero.equals(other.numero)) {
			return false;
		}
		return true;
	}

}
