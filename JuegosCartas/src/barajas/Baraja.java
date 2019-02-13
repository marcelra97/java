package barajas;

import java.util.ArrayList;
import java.util.Random;

public class Baraja {

	//atributos
	private ArrayList<Carta> lista_cartas;	//lista de cartas

	
	
	//construcotres
	public Baraja() { // nos crea una baraja vacia
		
		this.lista_cartas= new ArrayList<Carta>();
		
		
	}
	
	public Baraja(int tipobaraja) { //nos crea la baraja española, luego podemos incluirle unas barajas mas.
		
		this(tipobaraja, false); // llama al tercer constructor para crear una baraja sin barajearla
		
	}
	
	public Baraja(int tipobaraja, boolean barajar) { //igual que la anterior pero tiene un boleano que nos dice si hay que barajar despues de crearla o no

		for(int i = 0; i < 40*tipobaraja; i++) {
			
			Carta c1 = new Carta(i);
			
			this.lista_cartas.add(c1);
		}
		
		if(barajar == true) {
			
			Barajar();
			
		}
				
	}

	//propiedades
	
	public void NumeroCartas() {
		
	}
	
	public void Vacia() {
		
	}
	
	//metodos
	
	public void Barajar() {
		
		Random r = new Random();
		
		int random = 0;
		
		Carta recuperar = new Carta(0);
		
		for(int i = 0; i > this.lista_cartas.size(); i--) {
			
			random = r.nextInt(40);
			recuperar = this.lista_cartas.remove(random);
			
			this.lista_cartas.add(recuperar);
			
			
			
			/*Carta c1= new Carta(random);
			posicion= r.nextInt(40); 	
			
			this.lista_cartas.set(posicion, c1);
			*/
			
		}
		
		
	}
	
	public  Cortar() {
		
		return;
	}
	
	public Baraja Robar() {
		
		return;
	}
	
	public Baraja InstertarCartaFinal(int id_carta) {
		
		return;
	}
	
	public Baraja InsertarCartaPrincipio(int id_carta) {
		
		return;
	}
	
	public Baraja InsertaCartaFinal(Carta c) {
		
		return;
	}
	
	public Baraja InsertaCartaPrincipio(Carta c) {
		
		return;
	}
}
