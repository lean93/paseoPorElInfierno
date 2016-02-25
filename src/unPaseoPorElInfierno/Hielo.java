package unPaseoPorElInfierno;

public class Hielo extends Demonio {

	public Hielo(int unNivelMaldad) {
		super(unNivelMaldad);
		// TODO Auto-generated constructor stub
	}

	public boolean cumpleCondicion(Alma unAlma) {

		return unAlma.isEsFriolenta();

	}

	public void efectoEspecial(Alma unAlma) {
		unAlma.setEsFriolenta(true);
	}

	public void aplicarEfectoSobre(Demonio unDemonio, Alma unAlma){
		
	}
}
