package ar.edu.ort.tp1.examen.modeloClases;

import ar.edu.ort.tp1.tdas.interfaces.Mostrable;

public class Paciente implements Mostrable {
	
	//TODO completar aquí estructuras/variables necesarias;	
	private int nroInscripcion;
	private String nombreCompleto;
	private int[] edadCronologica;

	//TODO completar aquí constructor;
	public Paciente(int nroInscripcion, String nombreCompleto) {
		super();
		this.nroInscripcion = nroInscripcion;
		this.nombreCompleto = nombreCompleto;
	}
	
	//TODO completar set edad cronológica
	public void setEdadCronologica(int[] edad) {
		edadCronologica = edad; // ¿Está ok el encapsulamiento?	
	}	
	
	@Override
	public void mostrar() {
		System.out.printf("Número de Inscripción: %d--", nroInscripcion);
		System.out.printf("Nombre Completo: %s\n", nombreCompleto);
		System.out.printf("Edad cronológica: %d años y %d meses\n", 
								edadCronologica[0], edadCronologica[1]);
	}
	
	

}
