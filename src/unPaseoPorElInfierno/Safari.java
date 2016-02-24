package unPaseoPorElInfierno;

public class Safari implements Mision {

	
	private Lugar lugar;
	private double porcentaje;
	
	public boolean lograCumplirMision(Demonio unDemonio){
		
		int cantidad =0;
		for (Alma alma : lugar.getHabitantes()){
			
			if (unDemonio.puedeCazarUnAlma(alma)){
				cantidad ++;
			}
		}
		
		return (cantidad/lugar.getHabitantes().size()> porcentaje );
	}
}
