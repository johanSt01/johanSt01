package co.uniquindio.prog2.bibliotecaTaller.model;

public class AdministarPrestamo 
{
	private Biblioteca prestamo1;
	private Biblioteca prestamo2;
	
	private AdministarLibros libro1;
	private AdministarLibros libro2;
	private AdministarLibros libro3;
	
	public AdministarPrestamo(Biblioteca prestamo1, Biblioteca prestamo2) {
		super();
		this.prestamo1 = prestamo1;
		this.prestamo2 = prestamo2;
	}
	

	public Biblioteca getPrestamo1() {
		return prestamo1;
	}

	public void setPrestamo1(Biblioteca prestamo1) {
		this.prestamo1 = prestamo1;
	}


	public Biblioteca getPrestamo2() {
		return prestamo2;
	}

	public void setPrestamo2(Biblioteca prestamo2) {
		this.prestamo2 = prestamo2;
	}
	
	
	public AdministarLibros getLibro1() {
		return libro1;
	}

	public void setLibro1(AdministarLibros libro1) {
		this.libro1 = libro1;
	}

	public AdministarLibros getLibro2() {
		return libro2;
	}

	public void setLibro2(AdministarLibros libro2) {
		this.libro2 = libro2;
	}

	public AdministarLibros getLibro3() {
		return libro3;
	}

	public void setLibro3(AdministarLibros libro3) {
		this.libro3 = libro3;
	}

	@Override
	public String toString() {
		return "AdministarPrestamo [prestamo1=" + prestamo1 + ", prestamo2=" + prestamo2 + ", libro1=" + libro1
				+ ", libro2=" + libro2 + ", libro3=" + libro3 + "]";
	}
}
