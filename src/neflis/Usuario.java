package neflis;

import java.util.Collection;
import java.util.HashSet;

public class Usuario {

	private Collection<Visto> cosasVistas;

	public void loguerse() {
		mostrarContenidoRecomendado();
	}

	private void mostrarContenidoRecomendado() {
		mostrarSeriesNoTerminadas();
		mostrarDestacados();

	}

	private void mostrarSeriesNoTerminadas() {
		// TODO Auto-generated method stub

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
	
	

}
