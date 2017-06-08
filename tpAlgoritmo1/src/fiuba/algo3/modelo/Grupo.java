package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Grupo {

	String nombre;
	List<String> miembros;
	String nombreAdministrador;
	Chat unChat;
	 
	public Grupo(String nombre){
		this.nombre=nombre;
		this.unChat=new Chat();
		this.miembros=new ArrayList<String>();
	}
	
	
	
	
	public void agregarMiembro(String unMiembro){
		this.miembros.add(unMiembro);
		
		 
	}
	public void agregarAdministrador(String nombre){
		this.miembros.add(nombre);
	}
	
	public void recibirMensajeDeGrupo( String nombreMiembro, String contenido){
		Mensaje unMensaje=new Mensaje(nombreMiembro,contenido);
		unChat.recibirMensajeDe(unMensaje);
		
	}
	
	public void enviarMensajeAGrupo( String contenido){
		Mensaje unMensaje=new Mensaje(nombreAdministrador,contenido);
		unChat.enviarMensajeA(unMensaje);
	}
	
	public int cantidadTotalMensajesRecibidos(){
		return unChat.cantidTotalDeMensajesRecibidos();
	}
	
	
	public int cantidadMensajesDe(String miembro){
		return unChat.cantidadMensajesDe(miembro);
	}
	
	
	public int cantidadTotalMensajesEnviados(){
		return unChat.cantidadTotalMensajesEnviados();
	}




	public int  cantidadMiembrosEnGrupo( ) {
		 return miembros.size();
		
	}




	public boolean existo(String nombre ) {
		 return nombre==this.nombre;
	}




	public List<String> obtenerConversacionConGrupo() {
		 
		return unChat.conversacion();
	}




	public void borrarMensajesDelContacto(String miembro) {
		unChat.borrarMensajesDelContacto( miembro);
		
	}




	public void borrarMensajesDelGrupo() {
		unChat. borrarMensajesDelGrupo();
		
	}
	 
	
}
