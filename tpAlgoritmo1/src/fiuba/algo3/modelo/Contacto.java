package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Contacto {

	private String nombre;
	private List<Chat> chats;
	 
	
	public Contacto(String nombre){
		
		this.nombre=nombre;
		this.chats=new ArrayList<Chat>();
	}
	
	public boolean existo(String nombre){
		return nombre==this.nombre;
	}
	public String getNombre(){
		return this.nombre ;
	}
	
	public void agregarMensajeDe(String emisor,String contenido){
		Mensaje	unMensaje=new Mensaje(emisor,contenido);
		   Chat unChat =new Chat();
		 unChat.agregarMensaje(unMensaje);
		 chats.add(unChat);
		 
		 
		 
	}
	public int cantidadTotalMensajesRecibidos(){
		int cantidad=0;
		Iterator<Chat> iterator=chats.iterator();
		while(iterator.hasNext()){
			
			cantidad=cantidad + iterator.next().cantidTotalDeMensajesRecibidos();
		}
		return cantidad;
		
	}
	public int cantidadTotalMensajesEnviados(){
	int cantidad=0;
	Iterator<Chat> iterator=chats.iterator();
	while(iterator.hasNext()){
		
		cantidad=cantidad + iterator.next().cantidadTotalMensajesEnviados();
	}
	return cantidad;
	
}
	
}
