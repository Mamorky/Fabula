package dam.psp;

public class PruebaCarrera {

	public static void main(String[] args) {
		Carrera carrera = new Carrera();
		Liebre liebre = new Liebre(carrera);
		Tortuga tortuga = new Tortuga(carrera);

		liebre.start();
		tortuga.start();
	}
}
