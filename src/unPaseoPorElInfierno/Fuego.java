package unPaseoPorElInfierno;

public class Fuego extends Demonio {

	public Fuego(int unNivelMaldad) {
		super(unNivelMaldad);
		// TODO Auto-generated constructor stub
	}

	public boolean cumpleCondicion(Alma unAlma) {

		return !unAlma.isEsFriolenta();

	}

	public void efectoEspecial(Alma unAlma) {

		unAlma.setEsFriolenta(false);
	}
}
