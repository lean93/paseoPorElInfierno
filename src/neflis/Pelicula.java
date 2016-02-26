package neflis;

import java.util.Collection;

public class Pelicula extends Contenido implements Visto {
	private int duracion;

	
	public Pelicula(int unaDuracion, Collection<Actor> unosActores, String unGenero){
		
		duracion = unaDuracion;
		genero = unGenero;
		protagonistas = unosActores;
		
	}

	

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
	
	public boolean participo(Actor actor){
		return protagonistas.contains(actor);
	}
	
	public void añadirSerie(Collection<Serie> series){
		
	}

}
