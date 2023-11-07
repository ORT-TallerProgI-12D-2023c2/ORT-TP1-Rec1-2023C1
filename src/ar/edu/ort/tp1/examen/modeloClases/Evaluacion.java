package ar.edu.ort.tp1.examen.modeloClases;

import ar.edu.ort.tp1.tdas.interfaces.Mostrable;

public abstract class Evaluacion implements Mostrable {

	//TODO completar aquí estructuras/variables necesarias
	private int nroEvaluacion;
	private String fechaAplicacion;
	private String nombreExaminador;
	private Puntaje puntaje;
	
	public Evaluacion(int nroEvaluacion, String fechaAplicacion, String nombreExaminador, Puntaje puntaje) {
		super();
		this.nroEvaluacion = nroEvaluacion;
		this.fechaAplicacion = fechaAplicacion;
		this.nombreExaminador = nombreExaminador;
		this.puntaje = puntaje;
	}
	
	public abstract void completarMuestra();
	public abstract void informarPacientes();
	public abstract void evaluarPaciente(Paciente p);

	@Override
	public void mostrar() {		
		System.out.printf("EVALUACIÓN NRO: %d-REALIZADA EL: %s POR %s\nPUNTAJE: %s\n",
				nroEvaluacion, fechaAplicacion, nombreExaminador, puntaje);
		completarMuestra();
	}	
}
