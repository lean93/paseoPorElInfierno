package unPaseoPorElInfierno;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
	
	public static void main(String args[]){

        Sombras sombra = new Sombras(100);
        Sombras.setTolerancio(100);
   
        Collection<Alma> almitas = new ArrayList<Alma>();
        Alma alma1 = new Alma(20, 20, true);
        Alma alma2 = new Alma(20, 20, true);
        Alma alma3 = new Alma(20, 20, true);
        Alma alma4 = new Alma(1000, 1000, false);

        almitas.add(alma1);
        almitas.add(alma2);
        almitas.add(alma3);
        almitas.add(alma4);

        Lugar casa = new Lugar(almitas);
        Collection<Lugar> lugares = new ArrayList<Lugar>();
        lugares.add(casa);
        
        System.out.println(casa.getHabitantes().size());
    
        System.out.println("Alma 4 tiene: " + alma4.getBondad() + " y " + alma4.getValor());
        casa.esInvadidoPor(sombra);
        System.out.println(sombra.getAlmasCapturadas());
        System.out.println("Alma 4 tiene: " + alma4.getBondad() + " y " + alma4.getValor());

	}
}

        
