package ejercicio1;

import java.util.Collection;

public class Empresa extends Cliente{

	public Empresa(double unSaldo) {
		super(unSaldo);
	}
	
	public void comprarVarios(Collection<Paquete> unosPaquetes){
	
		for (Paquete paq : unosPaquetes){
			comprarPaquete(paq);
		}
	}
	
	

}
