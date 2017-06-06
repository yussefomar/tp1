package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Contacto {

	private String nombre;
	private Chat unChat;
	 
	
	public Contacto(String nombre){
		
		this.nombre=nombre;
		this.unChat=new Chat();
	}
	
	public boolean existo(String nombre){
		return nombre==this.nombre;
	}
	public String getNombre(){
		return this.nombre ;
	}
	public void recibirMensajeDe( String emisor,String contenido){
		Mensaje	unMensaje=new Mensaje(emisor,contenido);
		   
		 unChat.recibirMensajeDe(unMensaje);
		 
	}
	public void  enviarMensajeA(String emisor,String contenido){
		Mensaje	unMensaje=new Mensaje(emisor,contenido);
		  
		 unChat.enviarMensajeA(unMensaje);
		 

	}
	
	
	public int cantidadTotalMensajesRecibidos(){
		 
			
			 
		 
		return unChat.cantidTotalDeMensajesRecibidos();
		
	}
	
	public int cantidadTotalMensajesEnviados(){
 		 
		return unChat.cantidadTotalMensajesEnviados();
		
	}
	public List<String> conversacion(){
		 return unChat.conversacion();
	}
	
	/*public int cantidadTotalMensajesEnviados(){
	int cantidad=0;
	Iterator<Chat> iterator=chats.iterator();
	while(iterator.hasNext()){
		
		cantidad=cantidad + iterator.next().cantidadTotalMensajesEnviados();
	}
	return cantidad;
	
}*/
	
}
