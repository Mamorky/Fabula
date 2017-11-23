package dam.psp;

public class Tortuga extends Thread{
	int casillaActual;
	boolean gane = false;
	Carrera carrera;
	
	public Tortuga(Carrera carrera) {
		// TODO Auto-generated constructor stub
		this.carrera = carrera;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (casillaActual < 70) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			carrera.Correr(this);
		}
		
		if(!carrera.ganaron) {
			gane = true;
			carrera.ganaron = true;
			System.out.println("La tortuga ganó");
		}
		else {
			System.out.println("La tortuga perdió");
		}
	}
}
