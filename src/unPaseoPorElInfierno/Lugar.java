package unPaseoPorElInfierno;


import java.util.ArrayList;
import java.util.Collection;

public class Lugar {
	
	private Collection<Alma> habitantes;
	
	public Lugar(Collection<Alma> unosHabitantes){
		
		habitantes = unosHabitantes;
		
	}

	public void esInvadidoPor(Demonio unDemonio){
		Collection<Alma> aux= new ArrayList<Alma>();
		
		aux.addAll(habitantes);
		
		for (Alma habitante : aux){
			unDemonio.cazarAlmas(habitante, this);
		}
		
	}
	
	public void dejaDeHabitar(Alma unAlma){
		
		habitantes.remove(unAlma);
	}
	
	public Collection<Alma> getHabitantes(){
		return habitantes;
	}
	
	public boolean existeAlguienParaAtormentar(Demonio unDemonio){
		
		boolean resultado = false;
		for (Alma alma : habitantes){
			resultado = resultado || unDemonio.puedeCazarUnAlma(alma);
		}
		
		return resultado;
	}
	
	public void añadirHabitantes(Alma unAlma){
		habitantes.add(unAlma);
	}

}
