package fiuba.algo3.tests;

import fiuba.algo3.modelo.AlgoChat;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AlgoChat algoChat = new AlgoChat("Carlos");

	        algoChat.agregarContacto("Marcio");
	        algoChat.recibirMensajeDe("Marcio", "Estas en tu casa?");
	        algoChat.enviarMensajeA("Marcio", "hoy no");

	        

	        algoChat.agregarContacto("Diego");
	        algoChat.recibirMensajeDe("Diego", "Paso a las 7");
	        algoChat.enviarMensajeA("Diego", "OK");
	        algoChat.recibirMensajeDe("Diego", "Avisame si vas a estar");
	        algoChat.enviarMensajeA("Diego", "Te dije que si...");

	         algoChat.cantidadTotalMensajesRecibidos() ;
	        algoChat.cantidadMensajesDe("Diego") ;
	          algoChat.cantidadTotalMensajesEnviados() ;
	         algoChat.cantidadMensajesEnviadosA("Diego") ;

	        algoChat.borrarMensajesDelContacto("Marcio");

	       algoChat.cantidadTotalMensajesRecibidos() ;
	}

}
