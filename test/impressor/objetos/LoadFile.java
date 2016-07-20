package impressor.objetos;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Responsável por carregar os arquivos onde estão armazedos valores decimais e
 * romano para cada numeral
 * 
 * @author Fernando
 *
 */
public class LoadFile implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Pattern COMPILE = Pattern.compile("(\\d+).*?(\\w+)", Pattern.DOTALL);

	/**
	 * Carrega o arquivo para memória
	 * 
	 * @param fileName
	 * 
	 * @return Lista de {@link DecimalNumberDTO}
	 */
	public static List<DecimalNumberDTO> loadFile(String fileName) {
		List<DecimalNumberDTO> lista = new ArrayList<>();
		Scanner sc = null;
		try (InputStream stream = DecimalNumberDTO.class.getResourceAsStream("../../resources/" + fileName)) {
			sc = new Scanner(stream);
			while (sc.hasNextLine()) {
				Matcher matcher = COMPILE.matcher(sc.nextLine());
				while (matcher.find()) {
					DecimalNumberDTO numberObject = new DecimalNumberDTO(matcher.group(1), matcher.group(2));
					lista.add(numberObject);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		return lista;

	}

}
