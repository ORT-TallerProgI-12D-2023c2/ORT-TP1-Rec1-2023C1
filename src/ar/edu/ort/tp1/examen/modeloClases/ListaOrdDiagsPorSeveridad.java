package ar.edu.ort.tp1.examen.modeloClases;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaOrdDiagsPorSeveridad extends ListaOrdenadaNodos<Severidad, Diagnostico> {

	@Override
	public int compare(Diagnostico d1, Diagnostico d2) {
		return d2.getSeveridad().ordinal() - d1.getSeveridad().ordinal();
	}

	@Override
	public int compareByKey(Severidad clave, Diagnostico d) {
		return d.getSeveridad().ordinal() - clave.ordinal();
	}

}
