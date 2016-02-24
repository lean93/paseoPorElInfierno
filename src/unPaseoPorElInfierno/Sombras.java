package unPaseoPorElInfierno;

public class Sombras extends Demonio{
	
	public Sombras(int unNivelMaldad) {
		super(unNivelMaldad);
		// TODO Auto-generated constructor stub
	}

	private static int tolerancia;
	
	public static void setTolerancio(int unValor){
		tolerancia = unValor;
	}
	
	public boolean cumpleCondicion(Alma unAlma){
		
		return tolerancia > unAlma.getValor();
		
	}
	
	public void efectoEspecial(Alma unAlma){
		
		unAlma.setValor(unAlma.getValor()/2);
	}

}
