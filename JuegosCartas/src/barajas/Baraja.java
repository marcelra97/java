package barajas;

import java.util.ArrayList;

public class Baraja {

	//atributos
	private ArrayList<Integer> lista_cartas;	//lista de cartas

	
	
	//construcotres
	public Baraja() { // nos crea una baraja vacia
		
		this.lista_cartas= new ArrayList<Integer>();
		
		
	}
	
	public Baraja(int tipobaraja) { //nos crea la baraja españaola, luego podemos incluirle unas barajas mas.
		
		
		
	}
	
	public Baraja(int tipobaraja, boolean barajar) { //igual que la anterior pero tiene un boleano que nos dice si hay que barajar despues de crearla o no
		
		
	}
	
	//propiedades
	
	public void NumeroCartas() {
		
	}
	
	public void Vacia() {
		
	}
	
	//metodo
	
	public ArrayList<Integer> Barajar() {
		
		return;
	}
	
	public int Cortar() {
		
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