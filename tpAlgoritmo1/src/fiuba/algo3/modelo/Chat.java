package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Chat {
    List<Mensaje> mensajesRecibidos;
    List<Mensaje>mensajesEnviados;
    List<String>conversacion;
     
    
	
	
	public Chat(){
		mensajesRecibidos=new ArrayList<Mensaje>();
		mensajesEnviados=new ArrayList<Mensaje>();
		
		conversacion=new ArrayList<String>();
	}
	public void recibirMensajeDe(  Mensaje unMensaje){
		mensajesRecibidos.add(unMensaje);
		String linea=unMensaje.getEmisor()+": "+unMensaje.getMensaje();
		conversacion.add(linea); 
	}
	 
	public void enviarMensajeA(Mensaje unMensaje){
		mensajesEnviados.add(unMensaje);
		String linea="Yo:"+" "+unMensaje.getMensaje();
		conversacion.add(linea); 
		 

	}
	
	public int cantidadMensajesDe(String miembro){
		int cantidad=0;
		
		 for(int i=0;i<mensajesRecibidos.size()-1 ; i++) {
	        	if(mensajesRecibidos.get(i).esMiEmisor( miembro));
	        	  cantidad=cantidad +1 ;
	        } 

		return cantidad;
	}
	
	public int cantidTotalDeMensajesRecibidos(){
		 
		
		return   mensajesRecibidos.size();
		 
	}
	
	public int cantidadTotalMensajesEnviados(){
		return   mensajesEnviados.size();
	}
	public List<String> conversacion(){
		List<String> aux=new ArrayList<String>();
		aux.add("");
		

        for(int i=conversacion.size()-1; 0<=i ; i--) {
        	aux.add(conversacion.get(i));
        	  System.out.println( conversacion.get(i) );
        }
		
		
		
		 
		return aux;
	}
	public List<String> condversacion(){
		 return conversacion;
	}
}
