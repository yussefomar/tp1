package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    List<Mensaje> mensajes;
	
	
	public Chat(){
		mensajes=new ArrayList<Mensaje>();
	}
	
	public void agregarMensaje(Mensaje unMensaje){
		mensajes.add(unMensaje);
		
	}
	
	public int cantidTotalDeMensajesRecibidos(){
		int cantTotal=0;
		
		for( Mensaje unMensaje:mensajes){
			cantTotal=cantTotal + unMensaje.cantidadRecibido();
		}
		
		return cantTotal;
	}
	
	public int cantidadTotalMensajesEnviados(){
int cantTotal=0;
		
		for( Mensaje unMensaje:mensajes){
			cantTotal=cantTotal + unMensaje.cantidadUsuario();
		}
		
		return cantTotal;
	}
}
