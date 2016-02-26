package neflis;

import java.util.Collection;
import java.util.List;

public class Temporada {
	
	private int numeroDeTemporada;
	private int cantidadCapitulos;
	private List<Capitulo> capitulos;
	
	public Temporada(int unNumero, int totalDeCap, List<Capitulo> losCapitulos){
		numeroDeTemporada = unNumero;
		cantidadCapitulos = totalDeCap;
		capitulos = losCapitulos;
	}
	
	public Collection<Capitulo> getiCapitulos(){
		return capitulos;
	}
	
	public Capitulo ultimoCapitulo(){
		return capitulos.get(capitulos.size() -1);
	}

	public void añadirCapitulo(Capitulo unCapitulo){
		
		if (unCapitulo.getNumCap() - 1 == ultimoCapitulo().getNumCap()){
			capitulos.add(unCapitulo);	
		}
		
	}
}
