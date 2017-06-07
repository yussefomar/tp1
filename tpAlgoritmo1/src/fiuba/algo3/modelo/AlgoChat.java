package fiuba.algo3.modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class AlgoChat {

	private String nombreUsuario;
	
	 
	HashMap<String,Contacto> contactos=new HashMap<String,Contacto>() ;
	HashMap<String,Grupo> grupos=new HashMap<String,Grupo>() ;
	public AlgoChat(String nombre ){
		this.nombreUsuario=nombre;
	}
	
	
	public int cantidadDeChatsIndividuales(){
		return 0;
	}
	public int cantidadDeContactos(){
		int cantidad=contactos.size();
		return cantidad ;
	};
     
	public int  cantidadDeChatsGrupales(){
		return 0;
	}
	public int cantidadDeGrupos(){
		return 0;
	}
	public int cantidadDeMensajesEnviados(){
		return 0;
		
	}
	public String nombreUsuario(){
		return nombreUsuario ;
	}
	public void agregarContacto(String nombre){
		Contacto unContacto= new Contacto(nombre);
		contactos.put(nombre, unContacto);
	}
	public  boolean existeContacto(String nombre){
		return contactos.get(nombre).existo(nombre);
	}
		
	
	public void recibirMensajeDe(String emisor,String contenido){
	 
	 contactos.get(emisor).recibirMensajeDe( emisor, contenido);
	 
	}
	public int cantidadTotalMensajesRecibidos(){
		int cantidad=0;
		
		Set<String> keys =contactos.keySet();
		for(String key:keys){
			Contacto unContacto=contactos.get(key);
		    
		    cantidad=cantidad+unContacto.cantidadTotalMensajesRecibidos();
		}
		
		Set<String> keys2=grupos.keySet();
		for(String key2:keys2){
			cantidad=cantidad+grupos.get(key2).cantidadTotalMensajesRecibidos();
		}
		return cantidad;
	}
	
	public int cantidadMensajesDe(String nombre){
		
		int cantidad=0;
		
		
		Set<String> keys2=grupos.keySet();
		for(String key2:keys2){
			cantidad= cantidad + grupos.get(key2).cantidadMensajesDe(  nombre);
		
		}
		return cantidad=cantidad+ contactos.get(nombre).cantidadTotalMensajesRecibidos();
		
	}
	
	public void enviarMensajeA(String nombre, String contenido){
		contactos.get(nombre).enviarMensajeA(nombreUsuario, contenido);
	}
	
	public int cantidadTotalMensajesEnviados(){
		int cantidad=0;
		
		Set<String> keys =contactos.keySet();
		for(String key:keys){
			Contacto unContacto=contactos.get(key);
		    
		    cantidad=cantidad+unContacto.cantidadTotalMensajesEnviados();
		}
		
		Set<String> keys2=grupos.keySet();
		for(String key2:keys2){
			cantidad=cantidad+grupos.get(key2).cantidadTotalMensajesEnviados();
		}
		return cantidad;
	}
	public int cantidadMensajesEnviadosA(String nombre){
		Contacto unContacto=contactos.get(nombre);
		return unContacto.cantidadTotalMensajesEnviados();
	}
	public List<String> obtenerConversacionCon(String nombreContacto){
		return contactos.get(nombreContacto).conversacion();
		
		
	}
	
	public void crearGrupo(String nombre){
		Grupo unGrupo=new Grupo(nombre);
		unGrupo.agregarAdministrador(nombreUsuario);
		grupos.put(nombre,unGrupo);
	}
	
	public void agregarContactoAGrupo(String nombreMiembro, String nombreGrupo){
		grupos.get(nombreGrupo).agregarMiembro(nombreMiembro);
	}
	
	public void recibirMensajeDeGrupo(String nombreGrupo,String nombreMiembro, String contenido)
	{
		grupos.get(nombreGrupo).recibirMensajeDeGrupo(nombreMiembro, contenido);
	}
	
	public void enviarMensajeAGrupo(String nombreGrupo,String contenido){
		grupos.get(nombreGrupo);
	}
	
	public int cantidadMiembrosEnGrupo(String nombre){
		return grupos.get(nombre).cantidadMiembrosEnGrupo();
		
	}


	public boolean existeGrupo(String nombre) {
		 
		return grupos.get(nombre).existo(nombre);
	}


	public int cantidadMensajesRecibidosDelGrupo(String nombre) {
		 
		return  grupos.get(nombre).cantidadTotalMensajesRecibidos();
	}


	public int   cantidadMensajesEnviadosAlGrupo(String nombre) {
	 
		return grupos.get(nombre).cantidadTotalMensajesEnviados();
	}


	public List<String> obtenerConversacionConGrupo(String nombre) {
		
		return grupos.get(nombre).obtenerConversacionConGrupo();
	}
}
