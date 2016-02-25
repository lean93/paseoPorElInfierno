package neflis;

import java.util.Collection;

 abstract class Contenido {

	private String genero;
	protected Collection <Actor> protagonistas;
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
