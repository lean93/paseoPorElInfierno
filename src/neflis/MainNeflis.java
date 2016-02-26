package neflis;

import java.util.ArrayList;

public class MainNeflis {

	public static void main(String args[]) {
		
		Actor ross = new Actor();
		Actor rachel = new Actor();
		Actor chandler = new Actor();
		
		ArrayList<Actor> protagonistasFriends = new ArrayList<Actor>();
		protagonistasFriends.add(ross);
		protagonistasFriends.add(rachel);
		protagonistasFriends.add(chandler);
		
		Capitulo cap1Temp1 = new Capitulo(20, 1, new ArrayList<Actor>());
		Capitulo cap2Temp1 = new Capitulo(23, 2, new ArrayList<Actor>());
		ArrayList<Capitulo> capitulosTemp1Friends = new ArrayList<Capitulo>();
		capitulosTemp1Friends.add(cap1Temp1);
		capitulosTemp1Friends.add(cap2Temp1);
		
		Temporada temporada1Friends = new Temporada(1, 2, capitulosTemp1Friends);
		
		Capitulo cap1Temp2 = new Capitulo(20, 1, new ArrayList<Actor>());
		Capitulo cap2Temp2 = new Capitulo(25, 1, new ArrayList<Actor>());

	
		ArrayList<Capitulo>  capitulosTemp2Friends = new ArrayList<Capitulo> ();
		capitulosTemp2Friends.add(cap1Temp2);
		capitulosTemp2Friends.add(cap2Temp2);
		
		Temporada temporada2Friends = new Temporada(2, 2, capitulosTemp2Friends);
	
		ArrayList<Temporada> temporadasFriends = new ArrayList<Temporada>();
		temporadasFriends.add(temporada1Friends);
		temporadasFriends.add(temporada2Friends);		
		
		Serie friends = new Serie("comedia", protagonistasFriends, temporadasFriends);
		
		Usuario leandro = new Usuario();
		
		leandro.acabasDeMirar(cap1Temp1);
		leandro.acabasDeMirar(cap1Temp2);
		leandro.acabasDeMirar(cap2Temp1);
	
		
		System.out.print(leandro.vioContenidoCompleto(friends));
	
		
		
		
		
		
	}
}
