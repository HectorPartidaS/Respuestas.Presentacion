package mx.itson.respuestas.main;

import java.util.List;
import mx.itson.respuestas.entidades.Pregunta;
import mx.itson.respuestas.entidades.Usuario;

/**
 *
 * @author Carlos
 */
public class Main {
    public static void main(String args[]){
        try{
            Usuario u = new Usuario();
            List<Usuario> usuarios = u.obtenerTodos();
            System.out.println(usuarios);
            System.out.println("Exito");
            
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            Pregunta p = new Pregunta();
            List<Pregunta> preguntas = p.obtenerTodos();
            System.out.println(preguntas);
            System.out.println("Exito");
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
