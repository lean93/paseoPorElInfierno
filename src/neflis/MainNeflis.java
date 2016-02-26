package neflis;

import java.util.ArrayList;

import javax.swing.plaf.ActionMapUIResource;

public class MainNeflis {

	public static void main(String args[]) {
		
		Actor ross = new Actor();
		Actor rachel = new Actor();
		Actor chandler = new Actor();
		Actor ted = new Actor();
		
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
		Capitulo cap2Temp2 = new Capitulo(25, 2, new ArrayList<Actor>());

	
		ArrayList<Capitulo>  capitulosTemp2Friends = new ArrayList<Capitulo> ();
		capitulosTemp2Friends.add(cap1Temp2);
		capitulosTemp2Friends.add(cap2Temp2);
		
		Temporada temporada2Friends = new Temporada(2, 2, capitulosTemp2Friends);
	
		ArrayList<Temporada> temporadasFriends = new ArrayList<Temporada>();
		temporadasFriends.add(temporada1Friends);
		temporadasFriends.add(temporada2Friends);		
		
		Serie friends = new Serie("comedia", protagonistasFriends, temporadasFriends);
		
		cap1Temp1.setSerie(friends);cap1Temp2.setSerie(friends);cap2Temp1.setSerie(friends);cap2Temp2.setSerie(friends);
		
		Pelicula algunaPeli = new Pelicula(130, protagonistasFriends, "accion");
		Pelicula algunaPeli2 = new Pelicula(100, protagonistasFriends, "accion");
		Usuario leandro = new Usuario();
		
		leandro.acabasDeMirar(cap1Temp1);
		leandro.acabasDeMirar(cap1Temp2);
		leandro.acabasDeMirar(cap2Temp1);
		leandro.acabasDeMirar(algunaPeli);
		leandro.acabasDeMirar(algunaPeli2);
	
		// 1) -- ver si un usario vio un contenido completo
		System.out.println("leandro vio firends completo ?" + leandro.vioContenidoCompleto(friends));
		
		//2) -- duracion de un contenido
		
		System.out.println("duracion total de friends: " + friends.duracionTotal());
		
		//3) -- ultimo capiulo de la serie
		
		System.out.println("es el final el cap 2-2? " +friends.capituloFinal().equals(cap2Temp2));
		
		
		//4-a) generos que vio
		
		System.out.println("generos que vio lean: " + leandro.generosVistos());
		
		//4-b) genero preferido
		
		System.out.println("lean prefiere: " + leandro.generoPreferido());
		
		//5-a) actor participo en un contenido
		
		System.out.println(friends.actuoElActor(ross));
		System.out.println(friends.actuoElActor(ted));
		
		//5-b) usuario es fan de un actor
		
		System.out.println(leandro.sosFanDe(ross));
		System.out.println(leandro.sosFanDe(ted));
		
	
	}
}
