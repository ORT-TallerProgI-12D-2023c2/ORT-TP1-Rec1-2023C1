package ar.edu.ort.tp1.examen.modeloClases;

import ar.edu.ort.tp1.tdas.interfaces.Mostrable;

public class Diagnostico implements Mostrable{

	private String codigoDiagnostico;
	private Severidad severidad;
	//TODO completar aquí estructuras/variables necesarias
	private Evaluacion[][] grillaDeEvaluaciones;	
	
	//TODO desarrollar constructor;
	public Diagnostico(String codigoDiagnostico, Severidad severidad) {
		super();
		this.codigoDiagnostico = codigoDiagnostico;
		this.severidad = severidad;
		this.grillaDeEvaluaciones = new Evaluacion[Guardia.values().length][Jornada.values().length];
	}
	
	public void mostrarEvaluaciones() {
		
		for (int i = 0; i < grillaDeEvaluaciones.length; i++) {
			for (int j = 0; j < grillaDeEvaluaciones[i].length; j++) {
				if (this.grillaDeEvaluaciones[i][j] != null) {
					grillaDeEvaluaciones[i][j].mostrar();
				}				
			}			
		}
	}
	
	
	//TODO completar método para agregar evaluaciones
		//que no se almacenen en la misma jornada ni durante la misma guardia
	public void agregarEvaluacion(Evaluacion eva, Jornada j, Guardia g) {
		if (this.grillaDeEvaluaciones[g.ordinal()][j.ordinal()] != null) {
			String mensajito = String.format("Ya hay una evaluacion almacenada el %s--%s",j,g);
			throw new RuntimeException(mensajito);
		}
		this.grillaDeEvaluaciones[g.ordinal()][j.ordinal()] = eva;
	}
	
	
	@Override
	public void mostrar() {		
		System.out.println("\nCODIGO: " + codigoDiagnostico + " /SEVERIDAD: " + severidad + "\nEVALUACIONES");
		this.mostrarEvaluaciones();
		
	}

	public Severidad getSeveridad() {
		return severidad;
	}



	



	
	
	
	


	
}
