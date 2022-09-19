package EjemplosFG;

public class Icosaedro {
	public static void main(String[] args) {
		float a;
		double Area,v;
		
		a=5;
		Area=5*Math.pow(a, 2)*Math.sqrt(3);
		v=5*(3+Math.sqrt(5)*Math.pow(a, 3)/12);
		
		System.out.println("Datos del icosaedro:");
		System.out.println("Area:"+String.format("%.2f",Area));
		System.out.println("Volumen"+String.format("%.2f",v));
		
		

	}

}
