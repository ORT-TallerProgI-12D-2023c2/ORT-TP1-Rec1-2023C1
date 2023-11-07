package ar.edu.ort.tp1.examen.modeloClases;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Pila;

public class EvaluacionPorContinuidad extends Evaluacion {
	
	private String motivo;
	private Pila<Paciente> pilaDePacientes;	

	public EvaluacionPorContinuidad(int nroEvaluacion, String fechaAplicacion, String nombreExaminador, Puntaje puntaje,
			String motivo) {
		super(nroEvaluacion, fechaAplicacion, nombreExaminador, puntaje);
		this.motivo = motivo;
		this.pilaDePacientes = new PilaNodos<>();
	}

	@Override
	public void completarMuestra() {
		System.out.println(motivo);				
	}

	@Override
	public void informarPacientes() {
		Pila<Paciente> pilaAux = new PilaNodos<>();
		while(!this.pilaDePacientes.isEmpty()) {
			Paciente p = this.pilaDePacientes.pop();
			pilaAux.push(p);
			p.mostrar();
		}
		while(!pilaAux.isEmpty()) {
			pilaDePacientes.push(pilaAux.pop());
		}
	}

	@Override
	public void evaluarPaciente(Paciente p) {
		pilaDePacientes.push(p);		
	}

}
