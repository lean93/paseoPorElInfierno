package neflis;

import java.util.Collection;

public class Capitulo implements Visto {

	private int duracion;
	private int numDeCapitulo;
	private Collection<Actor> actoresInvitados;
	private Serie serieCorrespondiente;

	public int getDuracion() {
		return duracion;
	}
	
	public Serie getSerie(){
		return serieCorrespondiente;
	}

	public String getGenero() {
		return serieCorrespondiente.getGenero();
	}

	public boolean esDeEsteGenero(String genero) {
		return serieCorrespondiente.getGenero() == genero;
	}

	public boolean participo(Actor actor) {
		return actoresInvitados.contains(actor);	
	}
	
	public void añadirSerie(Collection<Serie> series){
		series.add(serieCorrespondiente);
	}

}
