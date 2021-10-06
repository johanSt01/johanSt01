package co.uniquindio.prog2.bibliotecaTaller.model;

public class Biblioteca 
{
	/*
	 * Atributos 
	 */
	
	private String nombre;
	private String direccion;
	
	private Estudiantes estudiante1;
	private Estudiantes estudiante2;
	
	private Bibliotecario bibliotecario1;
	private Bibliotecario bibliotecario2;
	
	private Prestamo prestamo1;
	private Prestamo prestamo2;
	

	/*
	 * Método constructor
	 */
	public Biblioteca(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	/*
	 * getters and setters
	 */
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Estudiantes getEstudiante1() {
		return estudiante1;
	}
	public void setEstudiante1(Estudiantes estudiante1) {
		this.estudiante1 = estudiante1;
	}
	
	public Estudiantes getEstudiante2() {
		return estudiante2;
	}
	public void setEstudiante2(Estudiantes estudiante2) {
		this.estudiante2 = estudiante2;
	}
	
	public Bibliotecario getBibliotecario1() {
		return bibliotecario1;
	}
	public void setBibliotecario1(Bibliotecario bibliotecario1) {
		this.bibliotecario1 = bibliotecario1;
	}
	
	public Bibliotecario getBibliotecario2() {
		return bibliotecario2;
	}
	public void setBibliotecario2(Bibliotecario bibliotecario2) {
		this.bibliotecario2 = bibliotecario2;
	}

	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", direccion=" + direccion + ", estudiante1=" + estudiante1
				+ ", estudiante2=" + estudiante2 + ", bibliotecario1=" + bibliotecario1 + ", bibliotecario2="
				+ bibliotecario2 + "]";
	}
	
	
	public String crearEstudintes(String nombre, String identificacion, String direccion, String telefono)
	{
		String mensaje = "No se pueden crear más estudiantes";
		
		if (estudiante1 == null)
		{
			estudiante1 = new Estudiantes(nombre, identificacion, direccion, telefono);
			mensaje = "El estudiante se ha creado";
			
		}else
		{
			if (estudiante2 == null)
			{
				estudiante2 = new Estudiantes(nombre, identificacion, direccion, telefono);
				mensaje = "El estudiante ha sido creado";
			}
		}
		
		return mensaje;
	}
	
	public String crearBibliotecario(String nombre, String identificacion, String direccion, String telefono)
	{
		String mensaje = "No se pueden crear más biliotecarios";
		
		if (bibliotecario1 == null)
		{
			bibliotecario1 = new Bibliotecario(nombre, identificacion, direccion, telefono);
			mensaje = "El bibliotecario se ha creado";
			
		}else
		{
			if (bibliotecario2 == null)
			{
				bibliotecario2 = new Bibliotecario(nombre, identificacion, direccion, telefono);
				mensaje = "El bibliotecario ha sido creado";
			}
		}
			
		return mensaje;
	}
	
	public String crearPrestamo(String nombreEstudiante, String titulo, String fechaPrestamo, String fechaDevolucion)
	{
		String mensaje = "no se ha creado un prestamo";
		Estudiantes estudiante = new Estudiantes(null, null, null, null);
		
		if(estudiante1.getNombre().equals(nombreEstudiante))
		{
			estudiante = estudiante1;
		}
		else if(estudiante2.getNombre().equals(nombreEstudiante))
		{
			estudiante = estudiante2;
		}
	
		if(prestamo1 == null)
		{
			prestamo1 = new Prestamo(null, null, null);
			mensaje = "El prestamo del estudiante " + estudiante.getNombre() + " ha sido creado" 
					+ "\n\n Fecha del prestamo: " + fechaPrestamo
					+ "\n Fecha de devolución: " + fechaDevolucion;
		}
		else if(prestamo2 == null)
		{
			prestamo2 = new Prestamo (null, null, null);
			mensaje = "El prestamo del estudiante " + estudiante.getNombre() + " ha sido creado" 
						+ "\n\n Fecha del prestamo: " + fechaPrestamo
						+ "\n Fecha de devolución: " + fechaDevolucion;
		}
		return mensaje;
	}
	
}
