package impressor.util;

import java.util.LinkedList;
import java.util.List;

import impressor.conversores.C;
import impressor.conversores.CD;
import impressor.conversores.CM;
import impressor.conversores.Conversor;
import impressor.conversores.D;
import impressor.conversores.I;
import impressor.conversores.L;
import impressor.conversores.M;
import impressor.conversores.V;
import impressor.conversores.X;
import impressor.conversores.XC;
import impressor.conversores.XL;

public class ListaConversores {

	static final List<Conversor> lista;

	static {
		lista = new LinkedList<>();
		lista.add(new I());
		lista.add(new V());
		lista.add(new X());
		lista.add(new XL());
		lista.add(new L());
		lista.add(new XC());
		lista.add(new C());
		lista.add(new CD());
		lista.add(new D());
		lista.add(new CM());
		lista.add(new M());
	}

	public static List<Conversor> getAll() {
		return lista;
	}

}