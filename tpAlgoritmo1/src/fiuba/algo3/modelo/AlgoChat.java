package fiuba.algo3.modelo;

import java.util.HashMap;
import java.util.Set;

public class AlgoChat {

	private String nombreUsuario;
	private String nombreUsuarioEnUso="Yo";
	 
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
	 
	 contactos.get(emisor).agregarMensajeDe( emisor, contenido);
	 
	}
	public int cantidadTotalMensajesRecibidos(){
		int cantidad=0;
		
		Set<String> keys =contactos.keySet();
		for(String key:keys){
			Contacto unContacto=contactos.get(key);
		    
		    cantidad=cantidad+unContacto.cantidadTotalMensajesRecibidos();
		}
		
		Set<String> keyss =grupos.keySet();
		for(String key:keyss){
			Grupo unGrupo=grupos.get(key);
		    
		    cantidad=cantidad+unGrupo.cantidadTotalMensajesRecibidos();
		}
		    
		
		return cantidad;
	}
	
	public int cantidadMensajesDe(String nombre){
		Contacto unContacto=contactos.get(nombre);
		return unContacto.cantidadTotalMensajesRecibidos();
		
	}
	
	public void enviarMensajeA(String nombre, String contenido){
		contactos.get(nombre).agregarMensajeDe(nombreUsuarioEnUso, contenido);
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
	
	public void crearGrupo(String nombreGrupo){
		Grupo unGrupo=new Grupo(nombreGrupo);
		Contacto unContacto =new Contacto(nombreGrupo); 
		unGrupo.agregarContacto(nombreGrupo,unContacto);
		unGrupo.agregarAdministrador(nombreUsuarioEnUso);
		grupos.put(nombreGrupo, unGrupo);
	}
	public void agregarContactoAGrupo(String unNombreContacto,String unGrupo){
		Contacto unContacto=new Contacto(unNombreContacto);
		grupos.get(unGrupo).agregarContacto( unNombreContacto,unContacto);
		
	}
	
	public int cantidadMiembrosEnGrupo(String nombre){
		return grupos.get(nombre).cantidadMiembros();
		
	}
	
	public boolean existeGrupo(String nombre){
		return grupos.get(nombre).esMiNombre(nombre);
	}
	public void recibirMensajeDeGrupo(String unGrupo, String unNombreContacto, String contenido){
		grupos.get(unGrupo).recibirMensajeDe(unNombreContacto,contenido);
	}
	public void enviarMensajeAGrupo(String unGrupo, String contenido){
		grupos.get(unGrupo).enviarMensajeA(unGrupo,contenido);
	}
	public int cantidadMensajesRecibidosDelGrupo(String nombre){
        return grupos.get(nombre).cantidadTotalMensajesRecibidos();
		    
	 
	}
}
