package neflis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Usuario {

	private Collection<Visto> cosasVistas;

	public void loguerse(Neflis neflix) {
		mostrarContenidoRecomendado(neflix);
	}

	private void mostrarContenidoRecomendado(Neflis neflix) {
		mostrarSeriesNoTerminadas(neflix);
		mostrarDestacados(neflix);

	}
	
	private void mostrarDestacados(Neflis neflix) {

		neflix.destacadosDelMes();
	}

	private Collection<Serie> seriesVistas(){
		
		Collection<Serie> series= new HashSet<Serie>();
		
		for (Visto loQueVi : cosasVistas){
			
		 loQueVi.añadirSerie(series);		
		 }
		
		return series;
		
	}

	private Collection<Serie> mostrarSeriesNoTerminadas(Neflis neflix) {
		Collection<Serie> seriesNoVistas = new ArrayList<Serie>();
		
	     for (Serie serie : this.seriesVistas()){
	    	 if (! serie.fueVistoCompletoPor(this)){
	    		 seriesNoVistas.add(serie);
	    	 }
	     }
	     
	     return seriesNoVistas;
	}

	private void mostrarDestacados() {
		// TODO Auto-generated method stub

	}

	public boolean vioContenidoCompleto(Contenido unContenido) {

		return unContenido.fueVistoCompletoPor(this);
	}

	public boolean vioEsteContenido(Visto capitulo) {

		return cosasVistas.contains(capitulo);
	}

	public Collection<String> generosVistos() {
		Collection<String> generos = new HashSet();
		for (Visto contenidoVisto : cosasVistas) {
			generos.add(contenidoVisto.getGenero());
		}
		return generos;
	}
	
	

	public String generoPreferido() {
		String elGenero= "Vacio";	
		int maximo =0;
		for (String genero : this.generosVistos()){
			
			int minutosVistos = 0;
			
			for (Visto visto : cosasVistas){
				if (visto.esDeEsteGenero(genero)){
					minutosVistos += visto.getDuracion();
				}	
			}
			
			if (minutosVistos >= maximo){
				elGenero= genero;
				maximo = minutosVistos;
			}
		}
		return elGenero;
	}
	
	public boolean sosFanDe(Actor unActor){
		
		boolean resultado = true;
		
		for (Visto algoVisto : cosasVistas){
			resultado = resultado && algoVisto.participo(unActor);
		}
		
		return resultado;
	}

}
