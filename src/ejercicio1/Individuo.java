package ejercicio1;

public class Individuo extends Cliente {
	
	Paquete enReserva;

	public Individuo(double unSaldo) {
		super(unSaldo);
		// TODO Auto-generated constructor stub
	}

	public void reservarPaquete(Paquete unPaquete) throws SinSaldoException{
		
		realizarPago(unPaquete.getMedioPrecio(this));
		enReserva = unPaquete;
	}
	
	public void terminarCompra() throws SinSaldoException{
		
		realizarPago(enReserva.getMedioPrecio(this));
		enReserva = null;
	}
	
}
