package fiuba.algo3.modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class AlgoChat {

	private String nombreUsuario;
	
	 
	HashMap<String,Contacto> contactos=new HashMap<String,Contacto>() ;
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
		return cantidad;
	}
	
	public int cantidadMensajesDe(String nombre){
		Contacto unContacto=contactos.get(nombre);
		return unContacto.cantidadTotalMensajesRecibidos();
		
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
		return cantidad;
	}
	public int cantidadMensajesEnviadosA(String nombre){
		Contacto unContacto=contactos.get(nombre);
		return unContacto.cantidadTotalMensajesEnviados();
	}
	public List<String> obtenerConversacionCon(String nombreContacto){
		return contactos.get(nombreContacto).conversacion();
		
		
	}
}
