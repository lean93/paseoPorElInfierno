package unPaseoPorElInfierno;

/**
 * Jefe maximo de las tinieblas... tiene el poder para dar ordenes a demonios, para atormentar lugares,
 * realizar misiones y aumentar su nivel de poder segun las almas capturadas de sus lacayos demoniacos
 * 
 * @author leandrorodriguez
 *
 */
public class Diablo {
	
	private double poder = 0;
	private Demonio pequeñoDemonio;
	private double minimoEntregado=0;
	
	public void mandarACazarAlmas(Demonio unDemonio, Lugar unLugar){
		
		unLugar.esInvadidoPor(unDemonio);
		
	}
	
	public void rendirCuentasCon(Demonio unDemonio){
			
		if (unDemonio.getAlmasCapturadas().isEmpty()){
			castigarDemonio(unDemonio);
		}
		else { 
			
			recibirPoder(unDemonio);
			premiarDemonio(unDemonio);
		}
	}
	
	public void castigarDemonio(Demonio unDemonio){
		
		unDemonio.setNivelMaldad(unDemonio.getNivelMaldad()*0.1);
		unDemonio.cambiarEstado(new Deprimido());
	}
	
	public void premiarDemonio(Demonio unDemonio){
		
	}
	
	public boolean CumpleMision( Mision unaMision, Demonio unDemonio){
		return unaMision.lograCumplirMision(unDemonio);
	}
	
	public void realizarMision(Mision unaMision, Demonio unDemonio){
		
	}
	
	public void recibirPoder(Demonio unDemonio){
		
		poder = poder + unDemonio.poderParaEntregar();
		if (unDemonio.poderParaEntregar()< minimoEntregado){
			minimoEntregado = unDemonio.poderParaEntregar();
			pequeñoDemonio = unDemonio;
		}
		
		unDemonio.teQuedasSinAlmas();
	}

	public Demonio elPequeñoDemonio(){
		return pequeñoDemonio;}

}
