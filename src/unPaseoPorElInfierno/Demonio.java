package unPaseoPorElInfierno;

import java.util.ArrayList;
import java.util.Collection;

/**

 * Un ser que tiene la capacidad y el deber de capturar almas o en su defecto, de atormentarlas. 
 * Estos pueden ser de distintos tipos y varian sus habilidades segun que tipo de demonio sea.
 * Fiel servidor del rey de las tinieblas, y brinda sus almasCapturadas para que el poder del 
 * diablo sea cada vez mayor. 
 * como todo ser viviente (o no) estas criaturas tienen sentimientos, estados de animo, y esto puede
 * influir en su conducta y en se desempeño para capturar las almas 
 * 
 * @author leandrorodriguez
 *
 */
public abstract class Demonio {
	
	public Demonio(int unNivelMaldad){
	
		nivelMaldad = unNivelMaldad;
	
	}

	private double nivelMaldad;
	private Collection<Alma> almasCapturadas = new ArrayList<Alma>();;
	private EstadoAnimico estado = new Normal();
	
	public void setNivelMaldad(double unaCantidad){
		nivelMaldad = nivelMaldad+ unaCantidad;
	}
	
	public double getNivelMaldad(){
		return nivelMaldad;
	}
	
	public boolean puedeCazarUnAlma(Alma unAlma){
		
		return mayorMaldadQue(unAlma) && this.cumpleCondicion(unAlma);
	}
	
	protected void cazarAlmas(Alma unAlma, Lugar unLugar){
		
		if (puedeCazarUnAlma(unAlma)){
			unLugar.dejaDeHabitar(unAlma);
			almasCapturadas.add(unAlma);
			estado.compruebaEstado(this);
		}
		else {
			atormentarAlma(unAlma);
		}
		aumentarMaldad(2);
	}
	
	protected void atormentarAlma(Alma unAlma){
		
		unAlma.reducirBondad(5);
		aplicarEfectoEspecial(unAlma);
		aumentarMaldad(1);
	}
	
	public void aplicarEfectoEspecial(Alma unAlma){
		
		estado.aplicarEfectoSobre(this, unAlma);
		 
	}
	
	protected void aumentarMaldad(int unaCantidad){
		nivelMaldad = nivelMaldad + unaCantidad;
	}

	 abstract boolean cumpleCondicion(Alma unAlma);
	 abstract void efectoEspecial(Alma unAlma);
	 
	 protected boolean mayorMaldadQue(Alma unAlma){
		 
		 return nivelMaldad > unAlma.getBondad();
		 
	 }
	 
	 public Collection<Alma> getAlmasCapturadas(){
		 return almasCapturadas;
	 }
	 
	 public double poderParaEntregar(){
		 
		 double total =0;
		 for (Alma alma : almasCapturadas){
			 total = total + alma.getBondad() + alma.getValor();
		 }
		 return total;
	 }
	 

	public void cambiarEstado(EstadoAnimico unAnimo) {
		estado = unAnimo;
		
	}

	public void teQuedasSinAlmas() {
		almasCapturadas = new ArrayList<Alma>();
		
	}
}
