package neflis;

public class Pelicula extends Contenido implements Visto {

	private int duracion;

	public boolean fueVistoCompletoPor(Usuario unUsario) {

		return unUsario.vioEsteContenido(this);

	}

	public int duracionTotal() {
		return duracion;
	}

	public boolean esDeEsteGenero(String genero) {

		return getGenero() == genero;
	}
	
	public int getDuracion(){
		return duracion;
	}
	
	public boolean actuoElActor(Actor actor){
		
		return protagonistas.contains(actor);
	}

}
