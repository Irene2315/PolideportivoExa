package ejecutables;

import java.sql.SQLException;
import java.util.Scanner;

import modelo.bean.Usuario;
import modelo.dao.AccesoBBDD;

public class InsertarUsuario {
/*Inserta usuario  y comprueba si existe un codigo*/
	public static void main(String[] args) {
	

		Scanner scan = new Scanner(System.in);
		
		Usuario usuario = new Usuario();
		AccesoBBDD bdd = new AccesoBBDD();
		Boolean encontrado;
		
		bdd.conectar();
		
		
		
		try {
			System.out.println("Introduce tu nombre y apellido");
			String nombreApellido = scan.nextLine();
			
			
			System.out.println("Introduce el DNI ");
			String dni = scan.nextLine();
			
			System.out.println("Introduce el codigo del usuario");
			String codigo = scan.nextLine();
			
			usuario.setNombreApellido(nombreApellido );
			usuario.setDni(dni);
			usuario.setCodigo(codigo);
			
			
			encontrado=bdd.codigoExite(codigo);
			
			if (encontrado==true) {
				System.out.println("Codigo duplicado");
			}
			else {
				bdd.insertarUsuario(usuario);
			}
			bdd.cerrar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//TODO crear aqui la aplicacion pricipal
		
		
	}

}
