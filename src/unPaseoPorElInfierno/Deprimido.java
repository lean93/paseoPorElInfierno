package unPaseoPorElInfierno;

public class Deprimido implements EstadoAnimico {

	public void misionCumplida(Demonio unDemonio) {

		unDemonio.cambiarEstado(new Normal());
	}

	public boolean venceLaBondadDe(Demonio unDemonio, Alma unAlma) {

		return (unDemonio.getNivelMaldad() > unAlma.getBondad() * 2);
	}

	public void aplicarEfectoSobre(Demonio unDemonio, Alma unAlma) {

	}

	public void compruebaEstado(Demonio unDemonio) {

		if (unDemonio.getAlmasCapturadas().size() > 20) {
		 unDemonio.cambiarEstado(new Feliz());
		}
	}

}
