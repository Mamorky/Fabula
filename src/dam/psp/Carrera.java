package dam.psp;

public class Carrera {
	boolean ganaron = false;

	public void Correr(Liebre liebre){
		long probabilidad = Math.round(Math.random()*100);
		if(probabilidad >= 20 && probabilidad < 40) {
			liebre.casillaActual  += 9;
			System.out.println("La liebre realiza un gran salto y su pos actual es "+liebre.casillaActual);
		}
		else if(probabilidad >= 40 && probabilidad < 50)
			if((liebre.casillaActual - 12) <= 0) {
				liebre.casillaActual = 0;
				System.out.println("La liebre tiene un resbalón grande y su pos actual es "+liebre.casillaActual);
			}
			else {
				liebre.casillaActual -= 12;
				System.out.println("La liebre tiene un resbalón grande y su pos actual es "+liebre.casillaActual);
			}
		else if(probabilidad >= 50 && probabilidad < 80) {
			liebre.casillaActual += 1;
			System.out.println("La liebre hace un pequeño salto y su pos actual es "+liebre.casillaActual);
		}
		else
			if((liebre.casillaActual -2) <= 0) {
				liebre.casillaActual = 0;
				System.out.println("La liebre tiene un resbalón pequeño y su pos actual es "+liebre.casillaActual);
			}
			else {
				liebre.casillaActual -= 2;
				System.out.println("La liebre tiene un resbalón pequeño y su pos actual es "+liebre.casillaActual);
			}
	}
	
	public void Correr(Tortuga tortuga){
		long probabilidad = Math.round(Math.random()*100);
		if(probabilidad <= 50) {
			tortuga.casillaActual  += 3;
			System.out.println("La tortuga avanza rapido y su pos actual es "+tortuga.casillaActual);
		}
		else if(probabilidad <= 70 && probabilidad > 50)
			if((tortuga.casillaActual - 6) <= 0) {
				tortuga.casillaActual = 0;
				System.out.println("La tortuga resbala y su pos actual es "+tortuga.casillaActual);
			}
			else {
				tortuga.casillaActual -= 6;
				System.out.println("La tortuga resbala y su pos actual es "+tortuga.casillaActual);
			}
		else {
			tortuga.casillaActual += 1;
			System.out.println("La tortuga avanza lento y su pos actual es "+tortuga.casillaActual);
		}
	}
}
