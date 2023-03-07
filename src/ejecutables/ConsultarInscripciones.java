package ejecutables;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.bean.Inscripcion;
import modelo.bean.Usuario;
import modelo.dao.AccesoBBDD;
import vistaAntigua.Visor;

public class ConsultarInscripciones {

	public static void main(String[] args) {
		
		//TODO crear aqui la aplicacion pricipal
		
		Scanner scan = new Scanner(System.in);
		AccesoBBDD bdd = new AccesoBBDD();
		Visor visor = new Visor();
		
		/*Introduce el id de actividad y lista los usuarios inscritos*/
		bdd.conectar();
		
		
		
		
		try {
			System.out.println("Introduce un id de actividad");
			int idActividad = scan.nextInt();
			
			ArrayList<Usuario> usuariosInscritos = new ArrayList<>();
			
			usuariosInscritos =bdd.getUsuarioInscritos(idActividad);
			
			visor.visualizarUsuariosInscritos(usuariosInscritos);
			bdd.cerrar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

}
