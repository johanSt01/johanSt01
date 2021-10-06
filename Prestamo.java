package co.uniquindio.prog2.bibliotecaTaller.model;

public class Prestamo 
{
	private String fechaPrestamo;
	private String codigo;
	private String fechaDevolucion;
	
	
	public Prestamo(String fechaPrestamo, String codigo, String fechaDevolucion) {
		super();
		this.fechaPrestamo = fechaPrestamo;
		this.codigo = codigo;
		this.fechaDevolucion = fechaDevolucion;
	}


	public String getFechaPrestamo() {
		return fechaPrestamo;
	}


	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getFechaDevolucion() {
		return fechaDevolucion;
	}


	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}


	@Override
	public String toString() {
		return "Prestamo [fechaPrestamo=" + fechaPrestamo + ", codigo=" + codigo + ", fechaDevolucion="
				+ fechaDevolucion + "]";
	}
	
	
}
