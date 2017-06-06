package fiuba.algo3.modelo;

public class Mensaje {
    private String emisor;
    private String  mensaje;
	
	
	public Mensaje(String emisor,String unMensaje){
	  this.emisor=emisor;
	  this.mensaje=unMensaje;
     }

	public int cantidad(){
		return 1;
	}
	
	 
	//enviado
	public int cantidadUsuario(){
		if(this.emisor=="Yo"){
			return 1;
		}
		return 0;
	}
	
	//enviado
		public int cantidadRecibido(){
			if(this.emisor!="Yo"){
				return 1;
			}
			return 0;
		}
		public String getEmisor(){
			return emisor;
		}
		public String getMensaje(){
			return mensaje;
		}
	 
}