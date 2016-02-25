package unPaseoPorElInfierno;

public class Normal implements EstadoAnimico {

	public void misionCumplida(Demonio unDemonio) {

		unDemonio.cambiarEstado(new Feliz());

	}

	public boolean venceLaBondadDe(Demonio unDemonio, Alma unAlma) {

		return (unDemonio.getNivelMaldad() > unAlma.getBondad());

	}

	public void aplicarEfectoSobre(Demonio unDemonio, Alma unAlma) {

		unDemonio.efectoEspecial(unAlma);

	}

	public void compruebaEstado(Demonio unDemonio) {

		if (unDemonio.getAlmasCapturadas().size() > 20) {
			unDemonio.cambiarEstado(new Feliz());
		}
	}

}
