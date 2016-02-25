package neflis;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Serie extends Contenido {

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
		
		return actuoElActor(actor) || participoEnAlgunCapitulo(actor);
	}

	private boolean participoEnAlgunCapitulo(Actor actor) {
	
		boolean resultado = true;
		for (Temporada temporada : temporadas){
			
			for (Capitulo capitulo: temporada.getiCapitulos()){
				
		resultado = resultado || capitulo.participo(actor);
			}
		}
		return resultado;
	}
	
	public void ultimaTemporada(){
		
	}

}
