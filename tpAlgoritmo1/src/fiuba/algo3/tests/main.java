package fiuba.algo3.tests;

import fiuba.algo3.modelo.AlgoChat;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlgoChat algoChat = new AlgoChat("Carlos");

        algoChat.agregarContacto("Marcio");
        algoChat.agregarContacto("Diego");
        algoChat.agregarContacto("Eugenio");
        algoChat.agregarContacto("Tomas");

        algoChat.crearGrupo("Tarde");
        algoChat.agregarContactoAGrupo("Marcio", "Tarde");
        algoChat.agregarContactoAGrupo("Eugenio", "Tarde");

        algoChat.crearGrupo("Todos");
        algoChat.agregarContactoAGrupo("Marcio", "Todos");
        algoChat.agregarContactoAGrupo("Eugenio", "Todos");
        algoChat.agregarContactoAGrupo("Diego", "Todos");
        algoChat.agregarContactoAGrupo("Tomas", "Todos");

        algoChat.recibirMensajeDeGrupo("Tarde", "Marcio", "Nos juntamos el lunes?");
        algoChat.enviarMensajeAGrupo("Tarde", "Yo puedo");
        algoChat.recibirMensajeDeGrupo("Tarde", "Eugenio", "Me too");
        algoChat.enviarMensajeAGrupo("Tarde", "bien, yo llevo las medialunas...");

     /*   assertEquals(2,*/ algoChat.cantidadTotalMensajesRecibidos();
      /*  assertEquals(2,*/ algoChat.cantidadTotalMensajesRecibidos();
         /*assertEquals(1,*/ algoChat.cantidadMensajesDe("Marcio");

	}

}
