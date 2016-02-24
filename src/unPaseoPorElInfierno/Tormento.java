package unPaseoPorElInfierno;

import java.util.Collection;

public class Tormento implements Mision {
	
	private Collection <Lugar> lugares;

	public boolean lograCumplirMision(Demonio unDemonio){
		
		boolean resultado = false;
		for (Lugar lugar : lugares){
			resultado = resultado && lugar.existeAlguienParaAtormentar(unDemonio);
			}
		return resultado;
		
	}
}
