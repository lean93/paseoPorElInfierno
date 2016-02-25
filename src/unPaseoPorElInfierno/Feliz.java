package unPaseoPorElInfierno;

public class Feliz implements EstadoAnimico {

	public void misionCumplida(Demonio unDemonio) {

		unDemonio.aumentarMaldad(5);

	}

	public boolean venceLaBondadDe(Demonio unDemonio, Alma unAlma) {

		return (unDemonio.getNivelMaldad() > unAlma.getBondad() / 2);

	}

	public void aplicarEfectoSobre(Demonio unDemonio, Alma unAlma) {
		unDemonio.efectoEspecial(unAlma);
	}

	public void compruebaEstado(Demonio unDemonio) {

	}

}
