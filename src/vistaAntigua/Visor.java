package vistaAntigua;

import java.util.ArrayList;



import modelo.bean.Usuario;

/**
 * 
 * @author irakasle
 * en esta clase estarán los métodos que visulicen informacíon
 * visualizarInscripciones
 * visualizarMensaje
 * etc 
 *
 */
public class Visor {
	
	public void visualizarUsuariosInscritos (ArrayList <Usuario> usuarios) {
		
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
			
			
		}
		
	}

}
