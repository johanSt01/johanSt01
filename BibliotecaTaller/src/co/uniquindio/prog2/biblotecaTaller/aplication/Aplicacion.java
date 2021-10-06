package co.uniquindio.prog2.biblotecaTaller.aplication;

import javax.swing.JOptionPane;

import co.uniquindio.prog2.bibliotecaTaller.model.AdministarLibros;
import co.uniquindio.prog2.bibliotecaTaller.model.AdministarPrestamo;
import co.uniquindio.prog2.bibliotecaTaller.model.Biblioteca;

public class Aplicacion {

	public static void main(String[] args) 
	{
		int opcion;
		
		String nombreBiblioteca;
		String direccionBiblioteca;
		Biblioteca biblioteca = null;
		
		//variables bibliotecario
		String nombreBibliotecario;
		String identificacionBibliotecario;
		String direccionBibliotecario;
		String telefonoBibliotecario;
		
		//variables estudiante
		String nombreEstudiante = "";
		String identificacionEstudiante;
		String direccionEstudiante;
		String telefonoEstudiante;
		
		//variables libro
		String codigoLibro = "";
		String isbnLibro = "";
		String tituloLibro = "";
		String autorLibro = "";
		String fechaPublicacion = "";
		String buscarLibro;
		int cantidadDisponible = 0;
		
		AdministarLibros administrarLibros = null;
		
		//Variables prestamos
		String consultarPrestamos;
		String prestamo2 = "";
		String prestamo1 = "";
		String reemplazarLibro;
		String nombreLibroPrestar = "";
		String fechaPrestamoLibro;
		String fechaDevolucionLibro = "";
		String nombrePrestamo = "";
		
		AdministarPrestamo administrarPrestamo = null;
		
		String mensaje = "";
		
		nombreBiblioteca = imprimir ("Bienvenidos a la biblioteca \n " + "Euclides Jaramillo");
		direccionBiblioteca = imprimir ("Dirección de la biblioteca: \n" + "Cra 15 #12N");
		biblioteca = new Biblioteca(nombreBiblioteca,direccionBiblioteca);
		
		administrarLibros = new AdministarLibros(null, null, null);
		
		administrarPrestamo = new AdministarPrestamo(null, null);
		
		do {
			opcion = mostrarMenu();
			
			switch (opcion) {
				case 1:
					// crear bibliotecario 
					nombreBibliotecario = leerString ("Ingrese el nombre del bibliotecario");
					identificacionBibliotecario = leerString ("Ingrese la identificación del bibliotecario");
					direccionBibliotecario = leerString ("Ingrese la direccion del bibliotecario");
					telefonoBibliotecario = leerString ("Ingrese el teléfono del bibliotecario");
					
					mensaje = biblioteca.crearBibliotecario(nombreBibliotecario, identificacionBibliotecario, 
							direccionBibliotecario, telefonoBibliotecario);
					imprimir (mensaje);
				break;
				
				case 2:
					// Crear Estudiantes
					nombreEstudiante = leerString ("Ingrese el nombre del estudiante");
					identificacionEstudiante = leerString ("Ingrese la identificación del estudiante");
					direccionEstudiante = leerString ("Ingrese la direccion del estudiante");
					telefonoEstudiante = leerString ("Ingrese el teléfono del estudiante");
					
					mensaje = biblioteca.crearEstudintes(nombreEstudiante, identificacionEstudiante, direccionEstudiante, telefonoEstudiante);
					imprimir (mensaje);
				break;
				
				case 3:
					//Administrar libros
					codigoLibro = leerString("Ingrese el código del libro");
					isbnLibro = leerString("Ingrese el isbn del libro");
					tituloLibro = leerString("Ingrese el título del libro");
					autorLibro = leerString("Ingrese el autor del libro");
					fechaPublicacion = leerString("Ingrese la fecha de publicacion del libro");
					cantidadDisponible = leerEnteroVentana("Ingrese la cantidad disponible del libro");
					
					mensaje = administrarLibros.crearLibros(codigoLibro, isbnLibro, tituloLibro, autorLibro, opcion, 
															autorLibro, mensaje, fechaPublicacion, cantidadDisponible);
					imprimir (mensaje);
				break;
				
				case 31:
					//Consultar libro
					buscarLibro = leerString("Ingrese el código del libro a consultar");
					
					mensaje = administrarLibros.consultarDatosLibro(codigoLibro, isbnLibro, tituloLibro, autorLibro, fechaPublicacion, cantidadDisponible);
					imprimir (mensaje);
				break;
				
				case 32:
				//consultar Prestamos
					consultarPrestamos = leerString("Ingrese el nombre del libro que desea consultar");
					
					mensaje = administrarLibros.consultarPrestamos(prestamo1, prestamo2);
					imprimir (mensaje);
				break;
				
				case 33:
					//reemplazar un libro por otro
					reemplazarLibro = leerString("Ingrese el código del libro que desea reemplazar");
					
					mensaje = administrarLibros.reemplazarLibro(codigoLibro);
					imprimir (mensaje);
					
					codigoLibro = leerString("Ingrese el código del libro");
					isbnLibro = leerString("Ingrese el isbn del libro");
					tituloLibro = leerString("Ingrese el título del libro");
					autorLibro = leerString("Ingrese el autor del libro");
					fechaPublicacion = leerString("Ingrese la fecha de publicacion del libro");
					cantidadDisponible = leerEnteroVentana("Ingrese la cantidad disponible del libro");
					
					mensaje = administrarLibros.crearLibros(codigoLibro, isbnLibro, tituloLibro, autorLibro, opcion, 
															autorLibro, mensaje, fechaPublicacion, cantidadDisponible);
					imprimir (mensaje);
				break;
				
				case 4:
					//crear prestamo
					nombrePrestamo = leerString("ingrese el nombre del estudiante que hace el prestamo");
					nombreLibroPrestar = leerString("Ingrese el nombre del libro que desea prestar");
					fechaPrestamoLibro = leerString("Ingrese la fecha que presta el libro");
					fechaDevolucionLibro = leerString("Ingrese la fecha que devuelve el libro");
					
					mensaje = biblioteca.crearPrestamo(nombreEstudiante, nombreLibroPrestar, fechaPrestamoLibro, fechaDevolucionLibro);
					imprimir (mensaje);
					
				break;
				
				case 6:
					opcion = 6;
				break;
			}
		}while(opcion!=6);
			
	}
	

	private static String leerString(String mensaje) {
		String respuesta;
		respuesta = JOptionPane.showInputDialog(mensaje);
		return respuesta;
	}

	private static int  mostrarMenu() 
	{
		int opcion = 0;
		String menu = 	"Seleccione opcion que desea realizar: \n\n"
					+ "1. Crear Bibliotecario \n"
					+ "2. Crear Estudiante \n"
					+ "3. Crear libro \n"
					+ "31. Consultar los datos de un libro segun su código \n"
					+ "32. Consultar con el nombre del libro la cantidad de prestamos \n"
					+ "33. Reemplazar un libro por otro \n"
					+ "4. Crear prestamo \n "
					+ "41. Adicionar libro al prestamo \n"
					+ "42. Entregar prestamo \n"
					+ "43. Consultar datos de un prestamo \n"
					+ "44. Mostrar cantidad de prestamos realizados \n"
					+ "5. Mostrar datos del estudiante con más prestamos \n"
					+ "51. Total dinero recaudado por la empresa \n"
					+ "52. Total de dinero a pagar a los bibliotecarios \n"
					+ "6. salir";
		opcion = leerEnteroVentana (menu);		
		return opcion;
	}
	
	public static int leerEnteroVentana (String mensaje)
	{
		int dato= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return dato;
	}
	
	public static String imprimir(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
		return mensaje;
	}

}
