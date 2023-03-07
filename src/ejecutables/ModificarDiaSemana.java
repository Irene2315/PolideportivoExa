package ejecutables;

import java.sql.SQLException;
import java.util.Scanner;

import modelo.dao.AccesoBBDD;


public class ModificarDiaSemana {

	public static void main(String[] args) {
		//TODO crear aqui la aplicacion pricipal
		Scanner scan = new Scanner(System.in);
		
		AccesoBBDD bdd = new AccesoBBDD();
		
		bdd.conectar();
		
		
		
		
		
		
		try {
			System.out.println("Introduce un id de actividad");
			int idActividad = scan.nextInt();
			scan.nextLine();
			System.out.println("Introduce los nuevos dias de una actividad");
			String dias = scan.nextLine();
			
			bdd.modificarActividad(idActividad, dias);
			bdd.cerrar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
