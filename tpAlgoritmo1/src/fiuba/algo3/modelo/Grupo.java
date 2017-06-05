package fiuba.algo3.modelo;

import java.util.HashMap;

public class Grupo {
	private String nombre;
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
	 
	 public boolean esMiNombre(String nombre){
		 return this.nombre==nombre;
	 }

}
