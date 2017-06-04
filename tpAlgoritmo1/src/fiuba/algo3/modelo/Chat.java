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
		return mensajes.size();
	}
}
