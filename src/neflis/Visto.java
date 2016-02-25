package neflis;

import java.util.Collection;

public interface Visto {

	public String getGenero();

	public boolean esDeEsteGenero(String genero);
	
	public int getDuracion();
	
	public boolean participo(Actor unActor);
	
	public void añadirSerie(Collection<Serie> serie);
	
}
