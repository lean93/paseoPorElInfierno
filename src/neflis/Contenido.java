package neflis;

import java.util.ArrayList;
import java.util.Collection;

 abstract class Contenido {

	protected String genero;
	protected Collection <Actor> protagonistas = new ArrayList<Actor>();
	abstract boolean fueVistoCompletoPor(Usuario usuario);
	abstract int duracionTotal();
	

	
	public String getGenero(){
		return genero;
	}
	
	public Collection <Actor> getProtagonistas(){
		return protagonistas;
	}
	
    public boolean actuoElActor(Actor actor){
		
		return protagonistas.contains(actor);
	}
}
