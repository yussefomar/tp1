package fiuba.algo3.modelo;

import java.util.HashMap;
import java.util.Set;

public class Grupo {
	private String nombre;
	private String administrador;
	HashMap<String,Contacto> contactos=new HashMap<String,Contacto>() ;
	public Grupo(String unNombre){
		this.nombre=unNombre;
	}
	
	
	
	 public void agregarContacto(String nombre,Contacto unContacto){
		 contactos.put(nombre, unContacto);
		 
	 }
	 
	 public int cantidadMiembros(){
		 return contactos.size();
	 }
	 public void agregarAdministrador(String administrador){
		 this.administrador=administrador;
	 }
	 public boolean esMiNombre(String nombre){
		 return this.nombre==nombre;
	 }
	 public void recibirMensajeDe(String unNombreContacto,String contenido){
		 contactos.get(unNombreContacto).agregarMensajeDe(unNombreContacto, contenido);
	 }
	 public void enviarMensajeA(String nombreGrupo,String contenido){
		 contactos.get(nombreGrupo).agregarMensajeDe(administrador, contenido);
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
}
