package dam.psp;

public class Liebre extends Thread{
	int casillaActual;
	boolean gane = false;
	Carrera carrera;
	
	public Liebre(Carrera carrera) {
		// TODO Auto-generated constructor stub
		this.carrera = carrera;
	}
	
	@Override
	public void run() {
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
			System.out.println("La liebre ganó");
		}
		else {
			System.out.println("La liebre perdió");
		}
		
		// TODO Auto-generated method stub
		super.run();
	}
}
