package ejecutables;

import java.sql.SQLException;
import java.util.Scanner;

import modelo.dao.AccesoBBDD;

public class DeleteInscripcion {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
		
		AccesoBBDD bdd = new AccesoBBDD();
		
		String nombreActividad;
		int codigoActividad;
		int codigoUsuario;
		
		bdd.conectar();
		
		try {
			System.out.println("Introduce el nombre de la actividad");
			nombreActividad = scan.nextLine();
			
			
			System.out.println("Introduce el codigo de usuario");
			codigoUsuario = scan.nextInt();
			
			codigoActividad= bdd.getNombreActividad(nombreActividad);
			
			bdd.darBajaUsuario(codigoActividad, codigoUsuario);
			
			bdd.cerrar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
