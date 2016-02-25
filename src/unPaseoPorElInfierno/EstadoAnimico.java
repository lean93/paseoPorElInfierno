package unPaseoPorElInfierno;

public interface EstadoAnimico {
	
	public void misionCumplida(Demonio unDemonio);
	
	public boolean venceLaBondadDe(Demonio unDemonio, Alma unAlma);
	
	public void aplicarEfectoSobre(Demonio unDemonio, Alma unAlma);
	
	public void compruebaEstado(Demonio unDemonio);

}
