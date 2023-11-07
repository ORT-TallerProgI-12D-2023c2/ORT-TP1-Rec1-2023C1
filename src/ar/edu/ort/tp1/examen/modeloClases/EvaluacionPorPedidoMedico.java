package ar.edu.ort.tp1.examen.modeloClases;

import ar.edu.ort.tp1.tdas.implementaciones.ColaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Cola;

public class EvaluacionPorPedidoMedico extends Evaluacion {

	private String nombreMedicoSolicitante;
	private Cola<Paciente> colaDePacientes;	

	public EvaluacionPorPedidoMedico(int nroEvaluacion, String fechaAplicacion, String nombreExaminador, Puntaje puntaje,
			String nombreMedicoSolicitante) {
		super(nroEvaluacion, fechaAplicacion, nombreExaminador, puntaje);
		this.nombreMedicoSolicitante = nombreMedicoSolicitante;
		this.colaDePacientes = new ColaNodos<>();
	}
	
	@Override
	public void completarMuestra() {
		System.out.printf("SOLICITA: %s\n", nombreMedicoSolicitante);		
	}

	@Override
	public void informarPacientes() {
		Paciente pCentinela = new Paciente(0, "");
		colaDePacientes.add(pCentinela);
		Paciente paciente = colaDePacientes.remove();
		while(paciente != pCentinela) {
			paciente.mostrar();			
			colaDePacientes.add(paciente);
			paciente = colaDePacientes.remove();
		}
		
	}

	@Override
	public void evaluarPaciente(Paciente p) {
		this.colaDePacientes.add(p);		
	}

}
