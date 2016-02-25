package unPaseoPorElInfierno;

import java.util.ArrayList;
import java.util.Collection;

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
			compruebaEstado();
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
	 
	 public void compruebaEstado(){
		 
		 if(almasCapturadas.size() > 20){
			 estado = new Feliz();
		 }
	 }

	public void cambiarEstado(EstadoAnimico unAnimo) {
		estado = unAnimo;
		
	}

	public void teQuedasSinAlmas() {
		almasCapturadas = new ArrayList<Alma>();
		
	}
}
