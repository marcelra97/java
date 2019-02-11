package barajas;

import java.util.ArrayList;

public class Carta {

	//atributo
	private int numero; //empieza por el 1 y acaba en el 10, siendo este el rey, el 9 el caballo y el 8 la sota
	private int palo; // 0=oro; 1=copas; 2=espadas; 3=bastos;
	
	//constructor
	public Carta(int numero, int palo) {
		
		
		this.numero=numero;
		
		this.palo=palo;// 0=oro, 1=copas , 2=espadas, 3=bastos
		
		
		
	}
	public Carta(int id) { // le pasamos un numero del 1 al 40 representando el 1 el as de oro y el 40 el rey de bastos
		
		//como el mazo se divide en 4 partes se
		
		this.palo= (id-1)/10;
		
		if(id % 10 ==0) {
			this.numero= 10;
		}
		else {
			this.numero= id % 10;
		}
		
		
	}
	
	
	//propiedades
	
	public int Numero() { // devuelve el numero de la carta
		
		return this.numero;
	}
	
	public int Palo() { // devuelve el numero del palo
		
		
		return this.palo;
	}
	
	public String NombreNumero() { //devulve el numero de la carta como un String (1=as, 2=dos,...,10=rey) 


		//creo un array donde estan todos los nombres de las cartas correspondiente con su numero
		String[] cambioletra = {" ", "as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};

		//luego recorro el vector 
		for(int i = 0; i<cambioletra.length; i++) {

			//busco la posicion que sea igual al numero	
			if(this.numero==i) {

				return cambioletra[i]; //y devuelvo el numero 
			}

		}

		return null;

	}


	
	public String NombrePalo() { //devuelve el nombre del palo
		
		String[] cambioletra= {"oros", "copas", "espadas", "bastos"}; // creo el vector con todos los nombres de palo 
		
		for(int i=0; i<cambioletra.length; i++) { // lo recorro
		
			if(this.palo == i) { //busco la posicion que sea igual con el numero de palo

				return cambioletra[i]; // y devuelvo el palo
			}
		}
		return null;
						
	}
	
	public String NombreCarta() { //devuelve el nombre de la carta completo (as de oro, dos de bastos, tres de espadas,...)
		
		String devuelveNumero = NombreNumero();
		
		String devuelvePalo = NombrePalo();
		
		String CartaCompleta = devuelveNumero + " de " + devuelvePalo;
		
		return CartaCompleta;
	}
	
	public double Valor7ymedio() { //devuelve el valor de la carta en el juego 7ymedio
		
		return;
	}
	

}
