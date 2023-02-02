package main;



public class TresEnRaya {
	
	private Tablero tablero;
	
	private Jugador[] jugadores;
	
	private Turno turno;
	
	public TresEnRaya() {
		tablero = new Tablero();
		jugadores = new Jugador[2];
		jugadores[0] = new Jugador('o');
		jugadores[1] = new Jugador('x');
		turno = new Turno();
	}
	
	public void jugar() {
		tablero.mostrar()
	}

	public static void main(String[] args) {
		new TresEnRaya().jugar();
	}

}
