package neflis;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Serie extends Contenido {
	
	public Serie (String unGenero, Collection<Actor> unosActores, List<Temporada> lasTemporadas){
		
		genero = unGenero;
		protagonistas = unosActores;
		temporadas = lasTemporadas;
		
	}

	private List<Temporada> temporadas = new ArrayList<Temporada>();

	
	public boolean fueVistoCompletoPor(Usuario unUsuario) {

		boolean resultado = true;

		for (Temporada temporada : temporadas) {
			for (Capitulo capitulo : temporada.getiCapitulos()) {
				resultado = resultado && unUsuario.vioEsteContenido(capitulo);
			}
		}

		return resultado;
	}

	public int duracionTotal() {

		int totalDuracion=0;
		
		for (Temporada temporada : temporadas) {
			for (Capitulo capitulo : temporada.getiCapitulos()) {
				totalDuracion += capitulo.getDuracion();
			}
		}
		return totalDuracion;
	}
	
	public boolean actuoElActor(Actor actor){
		
		return (super.actuoElActor(actor)) || (participoEnAlgunCapitulo(actor));
	}

	private boolean participoEnAlgunCapitulo(Actor actor) {
	
		boolean parcial = false;
		for (Temporada temporada : temporadas){
			
			for (Capitulo capitulo: temporada.getiCapitulos()){
				
				parcial = parcial || capitulo.soloAparecioAca(actor);
			}
		}
		return parcial;
	}
	
	public Temporada ultimaTemporada(){
		
		return temporadas.get(temporadas.size() -1);
		
	}
	
	public Capitulo capituloFinal(){
		return ultimaTemporada().ultimoCapitulo();
	}
	
	public void cargarCapitulo(Capitulo unCapitulo){
		ultimaTemporada().añadirCapitulo(unCapitulo);
	}

}
