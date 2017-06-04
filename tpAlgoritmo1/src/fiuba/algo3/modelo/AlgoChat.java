package fiuba.algo3.modelo;

import java.util.HashMap;
import java.util.Set;

public class AlgoChat {

	private String nombre;
	HashMap<String,Contacto> contactos=new HashMap<String,Contacto>() ;
	public AlgoChat(String nombre){
		this.nombre=nombre;
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
		return nombre ;
	}
	public void agregarContacto(String nombre){
		Contacto unContacto= new Contacto(nombre);
		contactos.put(nombre, unContacto);
	}
	public  boolean existeContacto(String nombre){
		if(nombre==contactos.get(nombre).getNombre()){
		return true;	
		}
		return false;
		
	}
	public void recibirMensajeDe(String emisor,String contenido){
	 
	 contactos.get(emisor).agregarMensajeDe( emisor, contenido);
	 
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
	
}
