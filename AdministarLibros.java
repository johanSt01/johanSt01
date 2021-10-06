package co.uniquindio.prog2.bibliotecaTaller.model;

public class AdministarLibros 
{
	private Libro libro1;
	private Libro libro2;
	private Libro libro3;
	
	int opcion;
	
	String nombreLibro;
	
	private Biblioteca prestamo1;
	private Biblioteca prestamo2;
	
	public AdministarLibros(Libro libro1, Libro libro2, Libro libro3) {
		super();
		this.libro1 = libro1;
		this.libro2 = libro2;
		this.libro3 = libro3;
	}


	public Libro getLibro1() {
		return libro1;
	}

	public void setLibro1(Libro libro1) {
		this.libro1 = libro1;
	}


	public Libro getLibro2() {
		return libro2;
	}

	public void setLibro2(Libro libro2) {
		this.libro2 = libro2;
	}

	
	public Libro getLibro3() {
		return libro3;
	}

	public void setLibro3(Libro libro3) {
		this.libro3 = libro3;
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


	@Override
	public String toString() {
		return "AdministarLibros [libro1=" + libro1 + ", libro2=" + libro2 + ", libro3=" + libro3 + ", opcion=" + opcion
				+ ", nombreLibro=" + nombreLibro + ", prestamo1=" + prestamo1 + ", prestamo2=" + prestamo2 + "]";
	}


	public String crearLibros(String codigo, String isbn, String titulo, String autor, int numeroPaginas, String editorial,
			String estado, String fechaPublicacion, int cantidadDisponible)
	{
		String mensaje = "No se ha creado el libro";
		
		if (libro1 == null)
		{
			libro1 = new Libro(codigo, isbn, titulo, autor, numeroPaginas, editorial, estado, fechaPublicacion, cantidadDisponible);
			mensaje = "El libro 1 ha sido creado";	
		}
		else
		{
			if(libro2 == null)
			{
				libro2 = new Libro(codigo, isbn, titulo, autor, numeroPaginas, editorial, estado, fechaPublicacion, cantidadDisponible);
				mensaje = "El libro 2 se ha creado";
			}
			else
			{
				if(libro3 == null)
				{
					libro3 = new Libro(codigo, isbn, titulo, autor, numeroPaginas, editorial, estado, fechaPublicacion, cantidadDisponible);
					mensaje = "El libro 3 se ha creado";
				}
			}
		}
		
		return mensaje;
	}
	
	public String consultarDatosLibro(String codigo, String isbn, String titulo, String autor, String fechaPublicacion, int cantidadDisponible)
	{
		String mensaje = "No se encontro el libro";
		
		if(libro1.getCodigo().equals(codigo))
		{
			mensaje = "El libro ha sido encontrado\n\n" + "isbn:  " + isbn + "\nTítulo:  " + titulo + 
					"\nAutor:  " + autor + "\nFecha de publicación:  " + fechaPublicacion + "\ncon una cantidad de: " + cantidadDisponible;
		}
		else
		{
			if(libro2.getCodigo().equals(codigo))
			{
				mensaje = "El libro ha sido encontrado\n\n" + "isbn:  " + isbn + "\nTítulo:  " + titulo + 
						"\nAutor:  " + autor + "\nFecha de publicación:  " + fechaPublicacion + "\ncon una cantidad de: " + cantidadDisponible;
			}
			else
			{
				if(libro3.getCodigo().equals(codigo))
				{
					mensaje = "El libro ha sido encontrado\n\n" + "isbn:  " + isbn + "\nTítulo:  " + titulo + 
						"\nAutor:  " + autor + "\nFecha de publicación:  " + fechaPublicacion + "\ncon una cantidad de: " + cantidadDisponible;
				}
			}
		}
		
		return mensaje;
	}
	//pendiente
	public String consultarPrestamos(String prestamo1, String prestamo2)
	{
		String mensaje = "El libro no esta incluido en los prestamos";
		int contador = 0;
		if (libro1.getTitulo().equals(prestamo1))
		{
			mensaje = "El libro está incluido en " + (contador + 1) + " prestamo";
			if(libro1.getTitulo().equals(prestamo1) && libro1.getTitulo().equals(prestamo2))
			{
				mensaje = "El libro está incluido en " + (contador + 1) + " prestamos";
			}
		}
		else
		{
			if (libro2.getTitulo().equals(prestamo1))
			{
				mensaje = "El libro está incluido en " + (contador + 1) + " prestamo";
				if(libro2.getTitulo().equals(prestamo1) && libro2.getTitulo().equals(prestamo2))
				{
					mensaje = "El libro está incluido en " + (contador + 1) + " prestamos";
				}
			}
			else
			{
				if (libro3.getTitulo().equals(prestamo1))
				{
					mensaje = "El libro está incluido en " + (contador + 1) + " prestamo";
					if(libro3.getTitulo().equals(prestamo1) && libro3.getTitulo().equals(prestamo2))
					{
						mensaje = "El libro está incluido en " + (contador + 1) +" prestamos";
					}
				}
			}
		}
		return mensaje;
	}
	
	public String reemplazarLibro (String codigo)
	{
		String mensaje = "No se pudo reemplazar el libro";
		
		if(libro1.getCodigo().equals(codigo))
		{
			libro1 = null;
			mensaje = "El libro con el código " + codigo + " ha sido eliminado \n\n por favor cree el nuevo libro";
		}
		
		else 
		{
			if(libro2.getCodigo().equals(codigo))
			{
				libro2 = null;
				mensaje = "El libro con el código " + codigo + " ha sido eliminado \n\n Por favor cree el nuevo lirbo";
			}
			
			else 
			{
				if(libro3.getCodigo().equals(codigo))
				{
					libro3 = null;
					mensaje = "El libro con el código " + codigo + " ha sido eliminado \n\n Por favor cree un nuevo libro";
				}
			}
		}
		
		return mensaje;
	}
	
	
}