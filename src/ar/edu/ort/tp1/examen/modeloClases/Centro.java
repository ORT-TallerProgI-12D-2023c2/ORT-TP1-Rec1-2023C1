package ar.edu.ort.tp1.examen.modeloClases;

import java.util.List;

import ar.edu.ort.tp1.tdas.interfaces.Mostrable;

public class Centro implements Mostrable {
	
	//TODO completar aquí estructuras/variables necesarias
	private String nombre;
	private ListaOrdDiagsPorSeveridad listaDiags;
		
	//TODO desarrollar constructor	
	public Centro(List<Diagnostico> diagnosticos, String nombre) {
		setNombre(nombre);
		this.listaDiags = new ListaOrdDiagsPorSeveridad();		
		pasarElementos(diagnosticos);
	}	
	
	//TODO agregar diagnósticos a la estructura correspondiente;	
	private void pasarElementos(List<Diagnostico> diagnosticos) {
		for (Diagnostico diagnostico : diagnosticos) {
			this.listaDiags.add(diagnostico);
		}		
	}

	//TODO controlar nombre vacío o nulo;
	public void setNombre(String nombre) {
		if (nombre == null || nombre.isBlank()) {
			throw new IllegalArgumentException("El nombre del Centro no puede ser vacío ni nulo");
		}
		this.nombre = nombre;
	}

	//TODO implementar método mostrar;
	@Override
	public void mostrar() {
		System.out.printf("Centro %s\n", nombre);
		for (Diagnostico diagnostico : listaDiags) {
			diagnostico.mostrar();
		}
	}

}
	
	
	
	
	

